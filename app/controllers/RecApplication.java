package controllers;


import play.data.Form;
import play.*;
import play.mvc.*;
import play.db.*;
import play.data.*;
import models.TenRatings;
import models.MovieRatings;
import models.MovieRecommender;
import models.Movies;
import models.Users;
import views.html.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecApplication extends Controller {

    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);
    static boolean filled = false;
    final static Form<Users> dbRegForm = Form.form(Users.class);
    //final static Form<Login> loginForm = Form.form(Login.class);
    static int userID = 1;

    List<Integer> randMovieIDs = null;
    
    //TODO: TIMER here to wrap construction of movRec object after SVD calc
    //MovieRecommender movRec = new MovieRecommender("movies_1M.txt", "V_1M_short.txt");
    public static MovieRecommender movRec = new MovieRecommender(Movies.find.all(), "V_100K_short.txt");

    //database stuff

    public Result index() {
        return recommended();
    }
    
    //CAN CREATE methods to open other pages...

    public Result recommended() {
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
    	
        if (storedRatings.size() < 10) {
            return rate();
        } else {
            List<String> recommendations = movRec.getRecommendations(movRec.createNewUserVectorUsingList(storedRatings));
            return ok(recommended.render("Recommended for You", recommendations));
        }
        
        //return ok(recommended.render("Recommended For You"));
    }
    
    public Result history() {
        List<MovieRatings> storedRatings = MovieRatings.find.where().eq("userID", userID).findList();
        
        //Pass in a list of strings in format Movie Title: Rating
        return ok(history.render("Rating History", storedRatings));
    }
    
    
    public Result register_user() {
        return ok(register_user.render("User Registration", dbRegForm));
    }
    
    /**
    public Result login() {
        return ok(login.render("User Login", login));
    }
    **/

    public Result view() {
        return ok(view.render("View Movies", 
            Movies.find.all()
        ));
    }
    
    public Result users() {
        return ok(users.render("View Users", 
            Users.find.all()
        ));
    }
    
    /**
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                routes.Application.index()
            );
        }
    }
    **/
    
    
    public Result registered() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        //Grab each rating in from the form and add to User Ratings.
        String email = formMap.get("username");
        String username = formMap.get("username");
        String password = formMap.get("password");
        
        //TODO: PLACE THEM INTO DATABASE!
        //TODO: BACKEND; CHECK USERNAME/PASSWORD for validity.
        
        Users newUser = new Users();
        newUser.email = email;
        newUser.username = username;
        newUser.password = password;
        newUser.save();

        return ok(registered.render("Registration Confirmation", username));
    }

    /** DEMO */
    public Result rate() { 	
        //Send Ratings to Database. Ensures form is filled to 0.
        addRatings();

        //TODO: Make sure we don't get movieIDs the user has already rated.
        randMovieIDs = movRec.getRandMovies();
        List<String> tenMoviesTest = new ArrayList<String>();
        for (int i = 0; i < randMovieIDs.size(); i++) {
            tenMoviesTest.add(MovieRecommender.getMovieTitle(randMovieIDs.get(i)));
        }
        
        //Preset Radio Buttons to 0
        TenRatings preset = presetRatingsForm();
        
        System.out.println("CALLING RATE PAGE");
        return ok(rate.render("Rate Movies", tenMoviesTest, ratingsForm.fill(preset)));
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
        preset.m10 = 0;
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
        
        //Grab each rating in from the form and add to User Ratings.
        HashMap<Integer, Integer> ratingsMap = new HashMap<Integer, Integer>();
        ratingsMap.put(randMovieIDs.get(0), Integer.parseInt(formMap.get("m1")));
        ratingsMap.put(randMovieIDs.get(1), Integer.parseInt(formMap.get("m2")));
        ratingsMap.put(randMovieIDs.get(2), Integer.parseInt(formMap.get("m3")));
        ratingsMap.put(randMovieIDs.get(3), Integer.parseInt(formMap.get("m4")));
        ratingsMap.put(randMovieIDs.get(4), Integer.parseInt(formMap.get("m5")));
        ratingsMap.put(randMovieIDs.get(5), Integer.parseInt(formMap.get("m6")));
        ratingsMap.put(randMovieIDs.get(6), Integer.parseInt(formMap.get("m7")));
        ratingsMap.put(randMovieIDs.get(7), Integer.parseInt(formMap.get("m8")));
        ratingsMap.put(randMovieIDs.get(8), Integer.parseInt(formMap.get("m9")));
        ratingsMap.put(randMovieIDs.get(9), Integer.parseInt(formMap.get("m10")));

        //TODO: ADD RATINGS TO DATABASE!!!
        /*for (int i = 0; i < ratingsMap.size(); i ++) {
        	if (ratingsMap.get(i) != 0) {
        		//add rating to database
        	}
        }*/
        //save
        
        return ratingsMap;
    }
    
    
    public Result maintenance() {
        return ok(maintenance.render());
    }
    
/*  DEPRECATED: FROM DEMO  
    public Result results() {
        HashMap<Integer, Integer> ratingsMap = addRatings();
        
        //Call getRecommendation() to populate recommendations ArrayList
        List<String> recommendations = movRec.getRecommendations(movRec.createNewUserVectorUsingMap(ratingsMap));
        
        return ok(results.render("Results", recommendations));
    }
*/    
    /** TESTING */
    public Result random() {
    	List<String> recommendations = movRec.getRecommendations(movRec.genRandUser());

    	return ok(recommended.render("Random", recommendations));
    }
}
