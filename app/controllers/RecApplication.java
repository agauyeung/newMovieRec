package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import play.db.*;
import play.data.*;
import models.TenRatings;
import models.MovieRatings;
import models.MovieRecommender;
import models.Movies;
import models.Users;
import models.Links;
import models.Recommender;
import models.Login;
import models.Hash;
import models.AppException;
import models.UserMap;
import models.Search;
import views.html.*;

import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class RecApplication extends Controller {
   
    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);
    
    static boolean filled = false;
    final static Form<Users> dbRegForm = Form.form(Users.class);
    final static Form<Login> loginForm = Form.form(Login.class);
    final static Form<Search> searchForm = Form.form(Search.class);

    List<Integer> randMovieIDs = null;
    boolean redirectFromRecommended = false;
    
    //MovieRecommender movRec = new MovieRecommender("movies_1M.txt", "V_1M_short.txt");
    public static MovieRecommender movRec = new MovieRecommender(Movies.find.all(), "V_1M_short.txt");

    public Result index() {
        String user = session("connected");
        
        if (user != null) {
            return recommended();
        } else {
            return login();
        }
    }
    
    //CAN CREATE methods to open other pages...

    public Result recommended() {
                System.out.println("Working Directory = " +
              System.getProperty("user.dir"));
        try {
            if (!movRec.isVSet()) {
                System.out.println("initializing V");
                movRec.readV(Play.application().getFile("V_1M_short.txt").toPath()); 
            }
        } catch (IOException e) {
			System.out.println("The movie file or V file not valid.");
		}
        String userID = session("userID");
        String username = session("connected");
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
    	
        if (storedRatings.size() < 10) {
            redirectFromRecommended = true;
            return rate();
        } else {
            List<String> recommendations = movRec.getRecommendations(movRec.createNewUserVectorUsingList(storedRatings));
            List<Movies> movieList = new ArrayList<Movies>();
            
            for (String s : recommendations) {
                Integer i = Integer.parseInt(s);
                System.out.println(i);
                Movies tmpMovie = Movies.find.byId(i);
                if (tmpMovie != null) {
                    movieList.add(tmpMovie);
                    System.out.println(tmpMovie.name);
                }
            }
            
            System.out.println(movieList.size());
            
            return ok(recommended.render("Recommended For You", movieList , username));
        }
        
        //return ok(recommended.render("Recommended For You"));
    }
    
    public Result history() {
        String userID = session("userID");
        String email = session("connected");
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
        
        //Pass in a list of strings in format Movie Title: Rating
        return ok(history.render("Rating History", email , storedRatings));
    }
    
    
    public Result register() {
        return ok(register.render("User Registration", dbRegForm));
    }
    
    public Result login() {
        return ok(login.render("User Login", loginForm));
    }
    
    public Result search() {
        return ok(search.render("Movie Search", searchForm));
    }
    
    public Result logout() {
        String email = session("connected");
        System.out.println(email);
        session().clear();
        return ok(loggedout.render("You are now logged out! " + email, ""));
    }
    
    /**
    public Result view() {
        String userID = session("userID");
        String email = session("connected");
        
        System.out.println(email);
        if (email == null){
            email = "";
        }
        
        return ok(view.render("View Movies", email,
            Movies.find.all()
        ));
    }
    **/
    
    public Result view() {
        String userID = session("userID");
        String email = session("connected");
        
        System.out.println(email);
        if (email == null){
            email = "";
        }
        
        //int id = 4954;
    
        return ok(view.render("View All Movies", email,
            Movies.find
            .setMaxRows(21)
            .findList()
        ));
    }
    
    public Result find() {
        String email = session("connected");
        
        if (email == null){
            email = "";
        }
        
        Form<Search> filledForm = searchForm.bindFromRequest();
        Map<String, String> userMap = filledForm.data();
        
        //Grab each rating in from the form and add to User Ratings.
        String movieText = userMap.get("text");
        
        // More complex task query
        List<Movies> foundMovies = Movies.find.where()
            .ilike("name", "%" + movieText + "%")
            .setMaxRows(21)
            .findList();
            
        System.out.println(foundMovies.size());
        
        return ok(view.render("Found Movies", email,
            foundMovies
        ));
    }
    
    public Result users() {
        String email = session("connected");
        
        System.out.println(email);
        if (email == null){
            email = "";
        }
        
        return ok(users.render("View Users", email,
            Users.find.all()
        ));
    }
    
    public Result authenticate() {
        Form<Login> filledForm = loginForm.bindFromRequest();
        Map<String, String> userMap = filledForm.data();
        
        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        //Grab each rating in from the form and add to User Ratings.
        String email = userMap.get("email");
        String password = userMap.get("password");
        
        Users user = null;
        try {
            user = Users.authenticate(email, password);
            if (user != null) {
                session("connected", email);
                session("userID", user.userID.toString());
                System.out.println(user.email);
            } else {
                System.out.println("Error");
            }
        } catch (AppException e) {
            return ok(invalid.render("Invalid Password", email));
        }
        
        if (user == null) {
            return ok(invalid.render("Invalid Login", ""));
        }

        return ok(authenticated.render("Logged in", email));
    }
    
    
    public Result registered() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        //Grab each rating in from the form and add to User Ratings.
        String email = formMap.get("email");
        String username = formMap.get("username");
        String password = formMap.get("password");
        
        if (isBlank(email)) {
            System.out.println("Email is required");
        }

        if (isBlank(username)) {
            System.out.println("Username is required");
        }

        if (isBlank(password)) {
            System.out.println( "Password is required");
        }
        
        //PLACE THEM INTO DATABASE!
        //TODO: BACKEND; CHECK USERNAME/PASSWORD for validity.
        
        try {
            Users newUser = new Users();
            newUser.email = email;
            newUser.username = username;
            newUser.password = BCrypt.hashpw(password, BCrypt.gensalt());
            newUser.save();
            
            session("connected", email);
            session("userID", newUser.userID.toString());
            
            if (newUser != null) {
                System.out.println(newUser.email);
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            return ok(invalid.render("Email is already registered: " + email , ""));
        }
        
        //session("connected", email);
        //session("userID", newUser.userID.toString());

        return ok(registered.render("Registration Confirmation", username));
    }
    
    private boolean isBlank(String input) {
        return input == null || input.isEmpty() || input.trim().isEmpty();
    }

    /** DEMO */
    public Result rate() {
/*        try {
            if (!movRec.isVSet()) {
                System.out.println("initializing V");
                movRec.readV(Play.application().getFile("V_1M_short.txt").toPath()); 
            }
        } catch (IOException e) {
			System.out.println("The movie file or V file not valid.");
		}
*/        //Send Ratings to Database. Ensures form is filled to 0.
        addRatings();

        //Make sure we don't get movieIDs the user has already rated.
        String userID = session("userID");
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
        
        randMovieIDs = movRec.getRandMovies(storedRatings);
        //List<String> tenMoviesTest = new ArrayList<String>();
        List<Movies> tenMoviesTest = new ArrayList<Movies>();
        System.out.println(randMovieIDs.size());
        for (int i = 0; i < randMovieIDs.size(); i++) {
            //tenMoviesTest.add(MovieRecommender.getMovieTitle(randMovieIDs.get(i)));
            Movies tmpMovie = Movies.find.byId(randMovieIDs.get(i));
            if (tmpMovie != null) {
                tenMoviesTest.add(tmpMovie);
                System.out.println(tmpMovie.name);
            } else {
                System.out.println("Looping because null entry");
                int original = i;
                int j = i;
                boolean done = false;
                while (i <= movRec.getNumOfMovies()) {
                    j ++;
                    tmpMovie = Movies.find.byId(j);
                    if (tmpMovie != null) {
                        tenMoviesTest.add(tmpMovie);
                        done = true;
                        System.out.println("DONE: " + tmpMovie.name);
                        break;
                    }
                }
                if (!done) {
                    j = 0;
                    while (j < original) {
                        j ++;
                        tmpMovie = Movies.find.byId(j);
                        if (tmpMovie != null) {
                            tenMoviesTest.add(tmpMovie);
                            System.out.println("DONE: " + tmpMovie.name);
                            break;
                        }
                    }
                }
            }
        }
        
        //Preset Radio Buttons to 0
        TenRatings preset = presetRatingsForm();
        String email = session("connected");
        
        System.out.println("CALLING RATE PAGE");
        if (redirectFromRecommended) {
            redirectFromRecommended = false;
            return ok(rate.render("Rate Movies", email , tenMoviesTest, ratingsForm.fill(preset), 1));
        } else {
            return ok(rate.render("Rate Movies", email , tenMoviesTest, ratingsForm.fill(preset), 0));
        }
    }
    
    public TenRatings presetRatingsForm() {
        TenRatings preset = new TenRatings();
        preset.m1 = 0;
        preset.m2 = 0;
        preset.m3 = 0;
        preset.m4 = 0;
        preset.m5 = 0;
        preset.m6 = 0;
        preset.m7 = 0;
        preset.m8 = 0;
        preset.m9 = 0;
        //preset.m10 = 0;
        return preset;
    }
    
    public HashMap<Integer, Integer> addRatings() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        if (formMap.get("m1") == null) {
            return null;
        }
        
        System.out.println(randMovieIDs.get(0));
        
        //Grab each rating in from the form and add to User Ratings.
        HashMap<Integer, Integer> ratingsMap = new HashMap<Integer, Integer>();
        //add 1 to movieID because database cannot take an entry with ID 0
        if (formMap.get("m1") != null)
            ratingsMap.put(randMovieIDs.get(0) + 1, Integer.parseInt(formMap.get("m1")));
        if (formMap.get("m2") != null)
            ratingsMap.put(randMovieIDs.get(1) + 1, Integer.parseInt(formMap.get("m2")));
        if (formMap.get("m3") != null)
            ratingsMap.put(randMovieIDs.get(2) + 1, Integer.parseInt(formMap.get("m3")));
        if (formMap.get("m4") != null)
            ratingsMap.put(randMovieIDs.get(3) + 1, Integer.parseInt(formMap.get("m4")));
        if (formMap.get("m5") != null)
            ratingsMap.put(randMovieIDs.get(4) + 1, Integer.parseInt(formMap.get("m5")));
        if (formMap.get("m6") != null)
            ratingsMap.put(randMovieIDs.get(5) + 1, Integer.parseInt(formMap.get("m6")));
        if (formMap.get("m7") != null)
            ratingsMap.put(randMovieIDs.get(6) + 1, Integer.parseInt(formMap.get("m7")));
        if (formMap.get("m8") != null)
            ratingsMap.put(randMovieIDs.get(7) + 1, Integer.parseInt(formMap.get("m8")));
        if (formMap.get("m9") != null)
            ratingsMap.put(randMovieIDs.get(8) + 1, Integer.parseInt(formMap.get("m9")));
        //if (formMap.get("m10") != null)
            //ratingsMap.put(randMovieIDs.get(9) + 1, Integer.parseInt(formMap.get("m10")));
        
        //ADD RATINGS TO DATABASE
        
        String userID = session("userID");
        System.out.println(userID);
        
        for (Map.Entry<Integer, Integer> e: ratingsMap.entrySet()) {
            if (e.getValue() != 0) {
        	    MovieRatings movieRating = new MovieRatings();
        	    movieRating.userID = Integer.parseInt(userID);
        	    movieRating.movieID = e.getKey();
        	    movieRating.movieRating = e.getValue();
        	    movieRating.save();
            }
        }
        
        return ratingsMap;
    }
    
    
    public Result maintenance() {
        return ok(maintenance.render());
    }
    
    //DEPRECATED - FOR USE IN MIDTERM DEMO
    /*public Result results() {
        String email = session("connected");
        HashMap<Integer, Integer> ratingsMap = addRatings();
        
        //Call getRecommendation() to populate recommendations ArrayList
        List<String> recommendations = movRec.getRecommendations(movRec.createNewUserVectorUsingMap(ratingsMap));
        
        return ok(results.render("Results", email, recommendations));
    }*/
    
    /** TESTING */
    /**
    public Result random() {
    	List<String> recommendations = movRec.getRecommendations(movRec.genRandUser());

    	return ok(recommended.render("Random", recommendations));
    }
    **/
}
