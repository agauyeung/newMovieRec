import play.*;
import play.mvc.Action;
import play.mvc.*;
import play.mvc.Http.*;
import play.mvc.Result.*;
import play.libs.*;
import static play.mvc.Results.*;
import play.mvc.Http.Request;
import java.lang.reflect.Method;

import play.Application;
import java.util.concurrent.TimeUnit;
import scala.concurrent.duration.Duration;
import akka.actor.Cancellable;
import play.GlobalSettings;
import play.libs.Akka;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import views.html.*;
import models.MovieRatings;
import models.MovieRecommender;
import models.Recommender;
import controllers.RecApplication;
import models.Movies;
import java.nio.file.Paths;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.List;

/**
 * Runs tasks and vettes HTTP requests.
 */
public class Global extends GlobalSettings {
    /**
     * Scheduler used to schedule SVD recalculation.
     */
    private static Cancellable scheduler;
    /**
     * Boolea variable indicating whether SVD is currently being updated.
     */
    private static boolean updatingSVD = false;
    
    /**
     * Checks HTTP Requests. If SVD is currently being updated, redirects to maintenance view.
     * If not, allows request to go along.
     */
    public Action onRequest(Request request, Method actionMethod) {
        System.out.println("\nChecking if SVD is currently being updated..." + request.toString());
        if (request.toString().compareTo("GET /maintenance") == 0) {
            return super.onRequest(request, actionMethod);
        }
        
        if (updatingSVD) {
            System.out.println("SVD is currently being updated.\n\n");
            //RecApplication.maintenance();
            return new Action.Simple() {
                @Override
                public F.Promise<Result> call(Context ctx) throws Throwable {
                    return F.Promise.pure(temporaryRedirect(controllers.routes.RecApplication.maintenance()));
                }
            };
        } else {
            System.out.println("SVD is not being updated at this time.\n\n");
            return super.onRequest(request, actionMethod);
        }
    }

    /**
     * On startup, a timer is set to recalculate SVD every week.
     */
    @Override
    public void onStart(Application app) {
       scheduler = Akka.system().scheduler().schedule(
           Duration.create(60*24*7, TimeUnit.MINUTES),      //Initial delay: a week
           Duration.create(60*24*7, TimeUnit.MINUTES),      //Frequency: once a week
           new Runnable() {
                public void run() {
                    // Do startup stuff here
                    
                    //Beginning SVD Update
                    updatingSVD = true;
                    
                    try {
                        //Rename old V to keep it incase we need to roll back
                        Files.move(Paths.get("V_1M_short.txt"), Paths.get("V_1M_short_OLD.txt"), REPLACE_EXISTING);
                        List<Movies> movies = Movies.find.all();
                        Recommender.rebuildUserMap(MovieRatings.find.where().orderBy("userID asc").findList(), movies);
                        Recommender.findSVDMatrices(movies.size());
                        RecApplication.movRec = new MovieRecommender(movies, "V_1M_short.txt");
                    } catch (IOException e) {
                        System.out.println("IO Exception while attempting to rename V file");
                    }
                    //Return to original state
                    updatingSVD = false;
                }
           },
           Akka.system().dispatcher()
       );
       System.out.println("\n\nTimer started. SVD will be updated every week.\n\n");
    }
    
    /**
     * On stop, the scheduler is cancelled.
     */
    @Override
    public void onStop(Application app) {
        //Stop the scheduler
        if (scheduler != null) {
            scheduler.cancel();
        }
    }
    
                        /*@Override
                    public Result call(Context ctx) throws Throwable {
                        return ok(maintenance.render());
                        
                        
                    }*/
}
