package controllers;

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

/**
 * Controller for Movie Recommender Application.
 * Contains page request/response logic.
 */
public class RecApplication extends Controller {

    //form that contains fields for rating movies
    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);

    //form that contains fields for registration
    final static Form<Users> dbRegForm = Form.form(Users.class);
    
    //form that contains fields for login
    final static Form<Login> loginForm = Form.form(Login.class);
    
    //form that contains fields for movie search
    final static Form<Search> searchForm = Form.form(Search.class);

    //list of random movie IDs that are generated for the use of ratingsForm
    List<Integer> randMovieIDs = null;
    
    //boolean variable that redirects users from recommended page to rate page when 
    //user hasn't rated at least 10 movies
    boolean redirectFromRecommended = false;
    
    //MovieRecommender object that contains movies, V matrix, etc.
    public static MovieRecommender movRec = new MovieRecommender(Movies.find.all(), "V_1M_short.txt");

    /**
     * Redirects user to "recommended" page if user has active session.
     * Redirects user to "login" page if user does not have an active session. 
     */
    public Result index() {
        String user = session("connected");
        
        if (user != null) {
            return recommended();
        } else {
            return login();
        }
    }
    
    /**
     * Gets recommendations for users and sends them to "recommended" view and renders it.
     */
    public Result recommended() {
        String userID = session("userID");
        String username = session("connected");
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
    	
    	//redirects to rate page if user has not rated at least 10 movies
        if (storedRatings.size() < 10) {
            redirectFromRecommended = true;
            return rate();
        } else {
            List<String> recommendations = movRec.getRecommendations(movRec.createNewUserVectorUsingList(storedRatings));
            List<Movies> movieList = new ArrayList<Movies>();
            
            for (String s : recommendations) {
                Integer i = Integer.parseInt(s);
                System.out.println(i);
                Movies tmpMovie = Movies.find.byId(i + 1);
                //if database entry for the movie is null, ignore it.
                if (tmpMovie != null) {
                    movieList.add(tmpMovie);
                    System.out.println("\t" + tmpMovie.name);
                }
            }
            
            System.out.println("Num of Actual Recs: " + movieList.size());
            
            return ok(recommended.render("Recommended For You", movieList , username));
        }
        
        //return ok(recommended.render("Recommended For You"));
    }
    
    /**
     * Gets user history and sends them to "rating history" view and renders it.
     */
    public Result history() {
        String userID = session("userID");
        String email = session("connected");
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
        
        //Pass in a list of strings in format Movie Title: Rating
        return ok(history.render("Rating History", email , storedRatings));
    }
    
    /**
     * Sends registration form to "registration" view and renders it.
     */
    public Result register() {
        return ok(register.render("User Registration", dbRegForm));
    }
    
    /**
     * Sends login form for "login" view and renders it.
     */
    public Result login() {
        return ok(login.render("User Login", loginForm));
    }
    
    /**
     * Sends search form to "search" view and renders it.
     */
    public Result search() {
        String email = session("connected");
        
        if (email == null){
            email = "";
        }
        
        return ok(search.render("Movie Search", email, searchForm));
    }
    
    /**
     * Clears session and renders "loggedout" view.
     */
    public Result logout() {
        String email = session("connected");
        System.out.println(email);
        session().clear();
        return ok(loggedout.render("You are now logged out! " + email, ""));
    }
    
    /**
     * Lists 21 rows of 3 movies each, sends to "view" view, and renders it.
     */
    public Result view() {
        String userID = session("userID");
        String email = session("connected");
        
        System.out.println(email);
        if (email == null){
            email = "";
        }
        
        return ok(view.render("View All Movies", email,
            Movies.find
            .setMaxRows(21)
            .findList()
        ));
    }
    
    /**
     * Grabs search text that user inputed into search form, searches for the movies
     * from the database (up to 21 rows, 3 movies each), sends them to the "view" view
     * and renders it.
     */
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
            
        for (Movies m : foundMovies) {
            System.out.println("Movie: " + m.id);
        }
            
        System.out.println(foundMovies.size());
        
        return ok(view.render("Found Movies", email,
            foundMovies
        ));
    }
    
    /**
     * FOR DEV USE ONLY.
     * Sends all Users objects in database to "users" view and renders it.
     */
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
    
    /**
     * Authenticates login. If valid, creates new session and renders "authenticated" view.
     * If invalid, renders "invalid" view.
     */
    public Result authenticate() {
        Form<Login> filledForm = loginForm.bindFromRequest();
        Map<String, String> userMap = filledForm.data();
        
        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        //Grab each field from the form.
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
    
    
    /**
     * Grabs user-inputed form data from registration form, and creates new
     * user if info is valid. Creates new session. If invalid, renders "invalid"
     * view. If valid, renders "registered" view.
     */
    public Result registered() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
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
        
        //place into database
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

        return ok(registered.render("Registration Confirmation", username));
    }
    
    /**
     * Checks if String is blank.
     */
    private boolean isBlank(String input) {
        return input == null || input.isEmpty() || input.trim().isEmpty();
    }

    /**
     * Adds ratings from form to database.
     * Grabs random movies and sends them to "rate" view and renders it.
     */
    public Result rate() {
        //Send Ratings to Database. Ensures form is filled to 0.
        addRatings();

        //Make sure we don't get movieIDs the user has already rated.
        String userID = session("userID");
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();

        System.out.println("History");
        List<Integer> history = new ArrayList<Integer>();
        for (MovieRatings oldRating : storedRatings) {
            history.add(oldRating.movieID - 1);
        }
        
        randMovieIDs = movRec.getRandMovies(storedRatings);
        List<Movies> tenMoviesTest = new ArrayList<Movies>();
        System.out.println(randMovieIDs.size());
        for (int i = 0; i < randMovieIDs.size(); i++) {
            Movies tmpMovie = Movies.find.byId(randMovieIDs.get(i) + 1);
            if (tmpMovie != null) {
                tenMoviesTest.add(tmpMovie);
                System.out.println(tmpMovie.name);
            //Increment to valid entry if movie entry is null.
            } else {
                System.out.println("Looping because null entry");
                int original = randMovieIDs.get(i);
                int j = original;
                boolean done = false;
                while (j <= movRec.getNumOfMovies()) {
                    j ++;
                    tmpMovie = Movies.find.byId(j + 1);
                    if (tmpMovie != null && !history.contains(j) && !randMovieIDs.contains(j)) {
                        tenMoviesTest.add(tmpMovie);
                        done = true;
                        System.out.println("DONE: " + tmpMovie.name + " " + j);
                        randMovieIDs.set(i, j);
                        break;
                    }
                }
                if (!done) {
                    j = 0;
                    while (j < original) {
                        j ++;
                        tmpMovie = Movies.find.byId(j + 1);
                        if (tmpMovie != null && !history.contains(j) && !randMovieIDs.contains(j)) {
                            tenMoviesTest.add(tmpMovie);
                            System.out.println("DONE: " + tmpMovie.name + " " + j);
                            randMovieIDs.set(i, j);
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
    
    /**
     * Presets Ratings Form to all 0s. This ensures user can't send empty form data.
     */
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
    
    /**
     * Grabs ratings from form and adds them to database.
     */
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
        
        String userID = session("userID");
        System.out.println(userID);
        
        //ADD RATINGS TO DATABASE
        for (Map.Entry<Integer, Integer> e: ratingsMap.entrySet()) {
            if (e.getValue() != 0) {
        	    MovieRatings movieRating = new MovieRatings();
        	    movieRating.userID = Integer.parseInt(userID);
        	    movieRating.movieID = e.getKey();
        	    movieRating.movieRating = e.getValue();
        	    movieRating.save();
        	    System.out.println("Saved: " + movieRating.movieID + MovieRecommender.getMovieTitle(movieRating.movieID - 1));
            }
        }
        
        return ratingsMap;
    }
    
    /**
     * Renders maintenance page.
     */
    public Result maintenance() {
        return ok(maintenance.render());
    }
}
