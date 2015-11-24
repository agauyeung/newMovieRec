
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/newMovieRec/conf/routes
// @DATE:Mon Nov 23 19:29:55 PST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:24
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:24
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommended""", """controllers.Application.recommended()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.Application.history()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register_user""", """controllers.Application.register_user()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """view""", """controllers.Application.view()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Application.users()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rate""", """controllers.Application.rate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random""", """controllers.Application.random()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registered""", """controllers.Application.registered()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_recommended1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommended")))
  )
  private[this] lazy val controllers_Application_recommended1_invoker = createInvoker(
    Application_1.recommended(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "recommended",
      Nil,
      "GET",
      """ Recommended For You page""",
      this.prefix + """recommended"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_history2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Application_history2_invoker = createInvoker(
    Application_1.history(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "history",
      Nil,
      "GET",
      """ Rating History page""",
      this.prefix + """history"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_register_user3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register_user")))
  )
  private[this] lazy val controllers_Application_register_user3_invoker = createInvoker(
    Application_1.register_user(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "register_user",
      Nil,
      "GET",
      """ User_DB Registration page""",
      this.prefix + """register_user"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_view4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("view")))
  )
  private[this] lazy val controllers_Application_view4_invoker = createInvoker(
    Application_1.view(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """view"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_users5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Application_users5_invoker = createInvoker(
    Application_1.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "users",
      Nil,
      "GET",
      """ View users in the database""",
      this.prefix + """users"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_rate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rate")))
  )
  private[this] lazy val controllers_Application_rate7_invoker = createInvoker(
    Application_1.rate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "rate",
      Nil,
      "GET",
      """ Ratings""",
      this.prefix + """rate"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_random8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random")))
  )
  private[this] lazy val controllers_Application_random8_invoker = createInvoker(
    Application_1.random(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "random",
      Nil,
      "GET",
      """""",
      this.prefix + """random"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_registered9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registered")))
  )
  private[this] lazy val controllers_Application_registered9_invoker = createInvoker(
    Application_1.registered(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registered",
      Nil,
      "POST",
      """""",
      this.prefix + """registered"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_recommended1_route(params) =>
      call { 
        controllers_Application_recommended1_invoker.call(Application_1.recommended())
      }
  
    // @LINE:12
    case controllers_Application_history2_route(params) =>
      call { 
        controllers_Application_history2_invoker.call(Application_1.history())
      }
  
    // @LINE:15
    case controllers_Application_register_user3_route(params) =>
      call { 
        controllers_Application_register_user3_invoker.call(Application_1.register_user())
      }
  
    // @LINE:18
    case controllers_Application_view4_route(params) =>
      call { 
        controllers_Application_view4_invoker.call(Application_1.view())
      }
  
    // @LINE:21
    case controllers_Application_users5_route(params) =>
      call { 
        controllers_Application_users5_invoker.call(Application_1.users())
      }
  
    // @LINE:24
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:28
    case controllers_Application_rate7_route(params) =>
      call { 
        controllers_Application_rate7_invoker.call(Application_1.rate())
      }
  
    // @LINE:31
    case controllers_Application_random8_route(params) =>
      call { 
        controllers_Application_random8_invoker.call(Application_1.random())
      }
  
    // @LINE:33
    case controllers_Application_registered9_route(params) =>
      call { 
        controllers_Application_registered9_invoker.call(Application_1.registered())
      }
  }
}