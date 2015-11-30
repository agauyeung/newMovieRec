package models;

import java.util.*;
import javax.persistence.*;
import models.Hash;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;
    
import org.mindrot.jbcrypt.BCrypt;

@Entity
public class Users extends Model {

    @Id
    public Integer userID;

    @Constraints.Required
    @Column(unique = true)
    public String email;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    @Formats.DateTime(pattern="dd/MM/yyyy")
    public Date create_time = new Date();

    public static Finder<Integer, Users> find = new Finder<Integer,Users>(Users.class);

    /**
     * Authenticate a User, from a email and clear password.
     *
     * @param email         email
     * @param clearPassword clear password
     * @return User if authenticated, null otherwise
     * @throws AppException App Exception
     */
    public static Users authenticate(String email, String clearPassword) throws AppException {

        // get the user with email only to keep the salt password
        Users user = find.where().eq("email", email).findUnique();
        if (user != null) {
            // get the hash password from the salt + clear password
            if (Hash.checkPassword(clearPassword, user.password)) {
                return user;
            }
        }
        return null;
    }
}