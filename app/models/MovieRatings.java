package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class MovieRatings extends Model {

    @Id
    public Integer id;

    @Constraints.Required
    public Integer userID;

    @Constraints.Required
    public Integer movieID;

    @Constraints.Required
    public Integer movieRating;

    public String create_time;

    public static Finder<Integer, MovieRatings> find = new Finder<Integer,MovieRatings>(MovieRatings.class);
}