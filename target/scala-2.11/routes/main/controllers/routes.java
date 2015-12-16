
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/cs490/newMovieRec/conf/routes
// @DATE:Thu Dec 10 17:41:59 PST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecApplication RecApplication = new controllers.ReverseRecApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecApplication RecApplication = new controllers.javascript.ReverseRecApplication(RoutesPrefix.byNamePrefix());
  }

}
