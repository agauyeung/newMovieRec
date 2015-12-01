package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Movies extends Model {

    @Id
    public Integer id;

    @Constraints.Required
    public String name;

    public String genres;

    public String imdbid;

    public String tmdbid;

    public static Finder<Integer, Movies> find = new Finder<Integer,Movies>(Movies.class);
}

