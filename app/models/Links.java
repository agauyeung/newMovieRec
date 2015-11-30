package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Links extends Model {

    @Id
    public Integer id;
    
    public Integer movieID;
    
    public String imdbID;

    public String tmdbID;

    public static Finder<Integer, Links> find = new Finder<Integer,Links>(Links.class);
}

