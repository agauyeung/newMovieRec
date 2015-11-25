
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/newMovieRec/conf/routes
// @DATE:Tue Nov 24 23:03:12 PST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseRecApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def register_user: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.register_user",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register_user"})
        }
      """
    )
  
    // @LINE:28
    def rate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.rate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
        }
      """
    )
  
    // @LINE:9
    def recommended: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.recommended",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommended"})
        }
      """
    )
  
    // @LINE:30
    def maintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.maintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "maintenance"})
        }
      """
    )
  
    // @LINE:35
    def registered: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.registered",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registered"})
        }
      """
    )
  
    // @LINE:21
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:33
    def random: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.random",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "random"})
        }
      """
    )
  
    // @LINE:12
    def history: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.history",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:18
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecApplication.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "view"})
        }
      """
    )
  
  }


}