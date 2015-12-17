package models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.apache.mahout.math.Matrix;
import org.apache.mahout.math.SparseMatrix;

import models.MovieRatings;
import models.Movies;

/**
 * Contains movies, V matrix, genres.
 * Calculates recommendations, picks random movie IDs
 */
public class MovieRecommender {
	
	//The maximum number of recommendations.
	private static final int MAXNUMOFRECS = 10;
	
	//The list of Movie objects that are in the database.
	private static List<Movies> movies;
	
	//The V matrix
	private static SparseMatrix V;
	
	//List of lists of genres corresponding to movie IDS.
	private ArrayList<List<String>> genres;
	
	/**
	 * Constructor
	 * @param movies - List of Movies objects
	 * @param VFile - location of V matrix text file as a String
	 */
	public MovieRecommender(List<Movies> movies, String VFile){
		try {
            genres = new ArrayList<List<String>>();
			MovieRecommender.movies = movies;
			//populate genres
			for (int i = 0; i < movies.size(); i ++) {
				List<String> moviegenre = parseGenres(movies.get(i).genres);
				genres.add(i, moviegenre);
			}
		
			readV(Paths.get(VFile));
			System.out.println("Movie Recommender object initialized. All files read successfully.");
		} catch (IOException e) {
			System.out.println("The movie file or V file not valid.");
		}
	}
	
	/**
	 * Gets the number of movies.
	 * @return number of movies
	 */
	public int getNumOfMovies() {
		return movies.size();
	}
	
	/**
	 * Goes through each word in the line; they are separated by 1 space.
	 * 
	 * @param text - line from file
	 * @return List of words in the line
	 */
	public List<String> parseText(String text) {
		ArrayList<String> words = new ArrayList<>();
		String word = "";
		
		for (char c: text.toCharArray()) {
			if (c != ' '){
				word += c;
			} else {
				words.add(word);
				word = "";
			}
		}
		if (!word.contentEquals("")){
			words.add(word);
		}
		
		return words;
	}
	
	/**
	 * Goes through each word in the line; they are separated by pipes.
	 * 
	 * @param text - line
	 * @return List of words in the line
	 */
	public List<String> parseGenres(String text) {
		ArrayList<String> words = new ArrayList<>();
		String word = "";
		
		for (char c: text.toCharArray()) {
			if (c != '|'){
				word += c;
			} else {
				words.add(word);
				word = "";
			}
		}
		if (!word.contentEquals("")){
			words.add(word);
		}
		
		return words;
	}
	
	/**
	 * Reads the V text file and creates V Sparse Matrix (Apache Mahout)
	 * @param path - Path object pointing to V matrix text file.
	 */
	private void readV(Path path) throws IOException {
		
		List<String> line;
		String text;
		int movie, i;
			
		try (
				//DO NOT USE: BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF8"))
				//-- Incompatible with Heroku
				BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
			) {
			movie = 0;
			
			if ((text = reader.readLine()) != null){
				line = parseText(text);
				
				System.out.println("Columns Retained: " + line.size());
				
				V = new SparseMatrix(movies.size(), line.size());
				for (i = 0; i < line.size(); i ++) {
					V.set(movie, i, Double.parseDouble(line.get(i)));
				}
				movie ++;
			}
			
			//populate row
			while ((text = reader.readLine()) != null){
				line = parseText(text);
				for (i = 0; i < line.size(); i ++) {
					V.set(movie, i, Double.parseDouble(line.get(i)));
				}
				movie ++;
			}
		}
	}
	
	/**
	 * Gets 10 random movie IDs. Does not return IDs of movies already rated.
	 * @param prevRatings - list of previous MovieRatings
	 * @return ArrayList of Movie IDs
	 */
    public ArrayList<Integer> getRandMovies(List<MovieRatings> prevRatings){
		System.out.println("GETTING RANDOM MOVIES");

        ArrayList<Integer> prev = new ArrayList<Integer>();
        for (MovieRatings mr : prevRatings) {
            prev.add(mr.movieID - 1);
        }

        ArrayList<Integer> ranmov = new ArrayList<Integer>();
        Random rand = new Random();
        int num = 0;
        System.out.println("SIZE " + movies.size());
        while(ranmov.size() < 9) {
            num = rand.nextInt(movies.size());
            //Check to see if movie ID has been rated by user or already added to rand list
            if(!ranmov.contains(num) && !prev.contains(num)) {
                ranmov.add(num);
            }
        }
		System.out.println("GOT RANDOM MOVIES");

        return ranmov;
    }
    
    /**
     * Gets the title of the movie.
     * @param movieID
     * @return name of the movie
     */
    public static String getMovieTitle(int movieID){
        return movies.get(movieID).name;
    }
    
    /**
     * Creates a user vector from a HashMap of ratings.
     * @param ratingsMap - HashMap of movieIDs to user's ratings
     * @return user vector as a SparseMatrix (Apache Mahout)
     */
    public SparseMatrix createNewUserVectorUsingMap(HashMap<Integer, Integer> ratingsMap) {
    	SparseMatrix vector = new SparseMatrix(1, getNumOfMovies());
		System.out.println("Ratings:");
    	for (int movieID : ratingsMap.keySet()) {
    	    System.out.println("MovieID: " + movieID + ", Rating: " + ratingsMap.get(movieID));
    		vector.set(0, movieID, ratingsMap.get(movieID));
    	}
    	return vector;
    }
    
    /**
     * Creates a user vector from a List of ratings.
     * @param ratingsMap - List of user's ratings, where index corresponds to movie ID
     * @return user vector as a SparseMatrix (Apache Mahout)
     */
    public SparseMatrix createNewUserVectorUsingList(List<MovieRatings> ratingsList) {
        SparseMatrix vector = new SparseMatrix(1, getNumOfMovies());
		System.out.println("Ratings:");
		int movieID;
		
    	for (MovieRatings rating : ratingsList) {
    	    movieID = rating.movieID - 1;
    	    System.out.println("MovieID: " + movieID + ", Rating: " + rating.movieRating);
    		vector.set(0, movieID, rating.movieRating);
    	}
    	return vector;
    }
    
    /**
     * Calculates the recommendation vector for a user.
     * Multiplies the user vector by V, then by V Transposed.
     * @param user - user vector as SparseMatrix (Apache Mahout)
     * @return recommendation vector as Matrix
     */
	public Matrix calcRecVector(SparseMatrix user) throws UnsupportedEncodingException, FileNotFoundException, IOException {
		Matrix qV = user.times(V);
		Matrix VTransposed = V.transpose();
		Matrix recommendations = qV.times(VTransposed);
		return recommendations;
	}
    
    /**
     * 
     */
    public List<String> getRecommendations(SparseMatrix user) {
        //Create HashMap of Genres to Integers, where the ints represent the number of movies
        //the user rated as 4+ that falls into that genre.
    	HashMap<String, Integer> userGenres = new HashMap<String, Integer>();
    	for (int movieID = 0; movieID < user.numCols(); movieID ++) {
    	    if (user.get(0, movieID) >= 4) {
    	        List<String> movieGenres = genres.get(movieID);
    	        for (String movieGenre : movieGenres) {
    	            //if map contains this genre, increment the value
    	            if (userGenres.keySet().contains(movieGenre)) {
    	                userGenres.put(movieGenre, userGenres.get(movieGenre) + 1);
    	            } else {
    	                userGenres.put(movieGenre, 1);
    	            }
    	        }
    	    }
    	}
    	
    	//The following 2 array lists correspond to each other.
    	//They represent the top 3 genres the user likes.
    	ArrayList<String> genreTitleMax = new ArrayList<String>();
        ArrayList<Integer> genreValueMax = new ArrayList<Integer>();
        for (int i = 0 ; i < 3; i ++) {
            genreTitleMax.add("");
            genreValueMax.add(-1);
        }
        
        //Find the top 3 genres for the user.
        for (String key : userGenres.keySet()) {
            Integer value = userGenres.get(key);
            //if greater than smallest, replace smallest with current
            if (value > genreValueMax.get(0)) {
                genreValueMax.set(0, value);
                genreTitleMax.set(0, key);
                //if greater than 2nd, swap smallest and 2nd
                if (value > genreValueMax.get(1)) {
                    genreValueMax.set(0, genreValueMax.get(1));
                    genreTitleMax.set(0, genreTitleMax.get(1));
                    genreValueMax.set(1, value);
                    genreTitleMax.set(1, key);
                }
                //if greater than biggest, swap 2nd and biggest
                if (value > genreValueMax.get(2)) {
                    genreValueMax.set(1, genreValueMax.get(2));
                    genreTitleMax.set(1, genreTitleMax.get(2));
                    genreValueMax.set(2, value);
                    genreTitleMax.set(2, key);
                }
            }   
        }
        
    	Matrix recommendations = null;
    	try {
    		recommendations = calcRecVector(user);
    	} catch (Exception e) {
    		System.out.println("Exception from calcRecVector");
    	}
    	
        System.out.println("Recommending Movies...");
        List<String> recMovies = new ArrayList<String>();
        //List<Movies> moviesList = new ArrayList<Movies>();
        
        for (int i = 0; i < MAXNUMOFRECS; i++) {
            recMovies.add(null);
            //moviesList.add(null);
        }
        int movieID;
        
        //Top recommended movies, sorted by predicted rating (highest at end of list)
        LinkedList<Integer> topRecs = new LinkedList<Integer>();
        
        System.out.println("Top 3 Genres");
        for (int z = 0; z < genreTitleMax.size(); z ++) {
            System.out.println(genreTitleMax.get(z));
        }

        boolean isInGenre;
        for (int j = 0; j < recommendations.columnSize(); j++) {
            //Don't recommend movies the user has already seen
        	if (user.get(0, j) != 0) {
        		continue;
        	}
        	//Don't recommend movie if the movie does not fall within top 3 genres for user
            isInGenre = false;
            for (String genreTitle : genres.get(j)) {
            	//if the genre is in the top 3 genres for the user, add the movie to
            	//the top recommendations.
                if (genreTitleMax.contains(genreTitle)) {
                    isInGenre = true;
                    break;
                }
            }
            if (!isInGenre) {
                continue;
            }

        	//go through all ratings
        	//if max, put in linked list
        	
        	//Initially add first movie to top recommendations.
        	if (j == 0) {
        		topRecs.add(j);
        	//If top recomendations hasn't reached the max
        	} else if (topRecs.size() < MAXNUMOFRECS) {
        	    //If recommendation rating for current is greater than recommendation rating
        	    //of the top recommendation at the end of the list
        		if (recommendations.get(0, j) > recommendations.get(0, topRecs.getLast())) {
        		    topRecs.addLast(j);
        		} else {
        		    //Go through linked list and put it in its appropriate place.
	               	ListIterator<Integer> listIterator = topRecs.listIterator();
	            	while (listIterator.hasNext()) {
	            		if (recommendations.get(0, j) <= recommendations.get(0, listIterator.next())) {
	            			listIterator.previous();
	            			listIterator.add(j);
	            			break;
	            		}
	            	}
        		}
        	} else {
        		if (recommendations.get(0, j) > recommendations.get(0, topRecs.getLast())) {
        			topRecs.addLast(j);
        			topRecs.removeFirst();
        		} else {
	        		
	        		ListIterator<Integer> listIterator = topRecs.listIterator();
	        		boolean atFirst = true;
	
	            	while (listIterator.hasNext()) {
	            		if (atFirst && recommendations.get(0, j) <= recommendations.get(0, listIterator.next())) {
	            			break;
	            		}
	            		else if (!atFirst && recommendations.get(0, j) <= recommendations.get(0, listIterator.next())) {
	            			listIterator.previous();
	            			listIterator.add(j);
	            			topRecs.removeFirst();
	            			break;
	            		}
	            		atFirst = false;
	            	}
        		}
        	} 
        }
        
        ListIterator<Integer> listIterator = topRecs.listIterator();
        int index = topRecs.size() - 1;
        //place top recs into Map sorted by highest recommended movie to lowest (key is 10 to 1)
    	while (listIterator.hasNext()) {
    		movieID = listIterator.next();
    		recMovies.set(index, Integer.toString(movieID));
    		index --;
    	}
        
        System.out.println("DONE RECOMMENDING");
        return recMovies;
    }
    
    /**
     * FOR TESTING PURPOSES ONLY
     * Generates a random user.
     * @return random user vector as Sparse Matrix (Apache Mahout)
     */
    public SparseMatrix genRandUser() {
    	SparseMatrix user = new SparseMatrix(1, getNumOfMovies());

    	Random rand = new Random();
    	for(int y = 0; y < movies.size(); y++){
    		user.set(0, y, rand.nextInt(6));
    	}
    	
    	return user;
    }
	
	
	
}
