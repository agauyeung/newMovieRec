package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Users extends Model {

    @Id
    public Integer userID;

    @Constraints.Required
    public String email;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date create_time = new Date();

    public static Finder<Integer, Users> find = new Finder<Integer,Users>(Users.class);
}