package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

public class Login extends Model {

    @Constraints.Required
    public String email;

    @Constraints.Required
    public String password;
    
}