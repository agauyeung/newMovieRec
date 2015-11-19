package models;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains a HashMap mapping User IDs to an array of movie ratings.
 * 
 * @author agauyeung
 *
 */
public class UserMap {
	/**
	 * Map mapping User IDs to an array of movie ratings. The indices of the array correspond to the Movie IDs.
	 */
	private Map<Integer, int[]> usermap;
	/**
	 * Total number of movies.
	 */
	private int totalMovies;
	
	/**
	 * Constructor
	 * 
	 * @param totalMovies
	 */
	public UserMap(int totalMovies) {
		usermap = new HashMap<Integer, int[]>();
		usermap.put(0, null);
		this.totalMovies = totalMovies;
	}
	
	/**
	 * Checks to see if the user is already in the mapping. If not, the user is added.
	 * Adds the rating to the user's ratings array.
	 * 
	 * @param userID
	 * @param movieID
	 * @param rating
	 */
	public void addRating(int userID, int movieID, int rating) {
		checkAndAddUser(userID);
		int[] ratings = usermap.get(userID);
		ratings[movieID] = rating;
	}
	
	/**
	 * Gets user's ratings array.
	 * 
	 * @param userID
	 * @return user's ratings array.
	 */
	public int[] getRatings(int userID) {
		return usermap.get(userID);
	}
	
	/**
	 * @return number of users
	 */
	public int size() {
		return usermap.size();
	}
	
	/**
	 * Checks if the user is in the mapping. If not, the user is added, 
	 * and a new ratings array is mapped to it.
	 * 
	 * @param user
	 */
	public void checkAndAddUser(int userID) {
		int[] ratings;
		
		if (!contains(userID)) {
			ratings = new int[totalMovies];
			ratings[0] = -1;
			usermap.put(userID, ratings);
			
		}
	}
	
	/**
	 * Checks if user map contains the User ID.
	 * 
	 * @param user
	 * @return true if User ID in user map and false if not
	 */
    public boolean contains(int userID) {
    	if (userID != 0 && usermap.containsKey(userID)){
    		return true;
    	} else {
    		return false;
    	}
    }
}
