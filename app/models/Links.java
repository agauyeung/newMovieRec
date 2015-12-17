package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

/**
 * Links our movieIDs with movieIDs in imdb and tmdb (assists in grabbing movie posters)
 */

@Entity
public class Links extends Model {

    @Id
    public Integer id;
    
    public Integer movieID;
    
    public String imdbID;

    public String tmdbID;

    public static Finder<Integer, Links> find = new Finder<Integer,Links>(Links.class);
}

