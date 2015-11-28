
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/newMovieRec/conf/routes
// @DATE:Sat Nov 28 01:01:02 PST 2015

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
  RecApplication_1: controllers.RecApplication,
  // @LINE:24
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    RecApplication_1: controllers.RecApplication,
    // @LINE:24
    Assets_0: controllers.Assets
  ) = this(errorHandler, RecApplication_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, RecApplication_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.RecApplication.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommended""", """controllers.RecApplication.recommended()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.RecApplication.history()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RecApplication.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """view""", """controllers.RecApplication.view()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.RecApplication.users()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rate""", """controllers.RecApplication.rate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """maintenance""", """controllers.RecApplication.maintenance()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registered""", """controllers.RecApplication.registered()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.RecApplication.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.RecApplication.logout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.RecApplication.authenticate()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_RecApplication_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_RecApplication_index0_invoker = createInvoker(
    RecApplication_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_RecApplication_recommended1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommended")))
  )
  private[this] lazy val controllers_RecApplication_recommended1_invoker = createInvoker(
    RecApplication_1.recommended(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "recommended",
      Nil,
      "GET",
      """ Recommended For You page""",
      this.prefix + """recommended"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RecApplication_history2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_RecApplication_history2_invoker = createInvoker(
    RecApplication_1.history(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "history",
      Nil,
      "GET",
      """ Rating History page""",
      this.prefix + """history"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RecApplication_register3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RecApplication_register3_invoker = createInvoker(
    RecApplication_1.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "register",
      Nil,
      "GET",
      """ User_DB Registration page""",
      this.prefix + """register"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_RecApplication_view4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("view")))
  )
  private[this] lazy val controllers_RecApplication_view4_invoker = createInvoker(
    RecApplication_1.view(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """view"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RecApplication_users5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_RecApplication_users5_invoker = createInvoker(
    RecApplication_1.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
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
  private[this] lazy val controllers_RecApplication_rate7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rate")))
  )
  private[this] lazy val controllers_RecApplication_rate7_invoker = createInvoker(
    RecApplication_1.rate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "rate",
      Nil,
      "GET",
      """ Ratings""",
      this.prefix + """rate"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_RecApplication_maintenance8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("maintenance")))
  )
  private[this] lazy val controllers_RecApplication_maintenance8_invoker = createInvoker(
    RecApplication_1.maintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "maintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """maintenance"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_RecApplication_registered9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registered")))
  )
  private[this] lazy val controllers_RecApplication_registered9_invoker = createInvoker(
    RecApplication_1.registered(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "registered",
      Nil,
      "POST",
      """""",
      this.prefix + """registered"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_RecApplication_login10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_RecApplication_login10_invoker = createInvoker(
    RecApplication_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "login",
      Nil,
      "GET",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_RecApplication_logout11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_RecApplication_logout11_invoker = createInvoker(
    RecApplication_1.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_RecApplication_authenticate12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_RecApplication_authenticate12_invoker = createInvoker(
    RecApplication_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecApplication",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """authenticate"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_RecApplication_index0_route(params) =>
      call { 
        controllers_RecApplication_index0_invoker.call(RecApplication_1.index())
      }
  
    // @LINE:9
    case controllers_RecApplication_recommended1_route(params) =>
      call { 
        controllers_RecApplication_recommended1_invoker.call(RecApplication_1.recommended())
      }
  
    // @LINE:12
    case controllers_RecApplication_history2_route(params) =>
      call { 
        controllers_RecApplication_history2_invoker.call(RecApplication_1.history())
      }
  
    // @LINE:15
    case controllers_RecApplication_register3_route(params) =>
      call { 
        controllers_RecApplication_register3_invoker.call(RecApplication_1.register())
      }
  
    // @LINE:18
    case controllers_RecApplication_view4_route(params) =>
      call { 
        controllers_RecApplication_view4_invoker.call(RecApplication_1.view())
      }
  
    // @LINE:21
    case controllers_RecApplication_users5_route(params) =>
      call { 
        controllers_RecApplication_users5_invoker.call(RecApplication_1.users())
      }
  
    // @LINE:24
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:28
    case controllers_RecApplication_rate7_route(params) =>
      call { 
        controllers_RecApplication_rate7_invoker.call(RecApplication_1.rate())
      }
  
    // @LINE:30
    case controllers_RecApplication_maintenance8_route(params) =>
      call { 
        controllers_RecApplication_maintenance8_invoker.call(RecApplication_1.maintenance())
      }
  
    // @LINE:35
    case controllers_RecApplication_registered9_route(params) =>
      call { 
        controllers_RecApplication_registered9_invoker.call(RecApplication_1.registered())
      }
  
    // @LINE:38
    case controllers_RecApplication_login10_route(params) =>
      call { 
        controllers_RecApplication_login10_invoker.call(RecApplication_1.login())
      }
  
    // @LINE:40
    case controllers_RecApplication_logout11_route(params) =>
      call { 
        controllers_RecApplication_logout11_invoker.call(RecApplication_1.logout())
      }
  
    // @LINE:42
    case controllers_RecApplication_authenticate12_route(params) =>
      call { 
        controllers_RecApplication_authenticate12_invoker.call(RecApplication_1.authenticate())
      }
  }
}