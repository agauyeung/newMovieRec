
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""	"""),format.raw/*4.63*/("""

    """),format.raw/*6.41*/("""
    """),_display_(/*7.6*/form(action = routes.Application.authenticate(), 'id -> "loginForm")/*7.74*/ {_display_(Seq[Any](format.raw/*7.76*/("""
        
        """),_display_(/*9.10*/inputText(field = loginForm("email"), 'placeholder -> "email")),format.raw/*9.72*/("""
        """),_display_(/*10.10*/inputText(field = loginForm("password"), 'placeholder -> "password")),format.raw/*10.78*/("""
        """),format.raw/*11.9*/("""<input type="submit" class="login" value="Login">         

    """)))}),format.raw/*13.6*/("""

""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(title:String,loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(title,loginForm)

  def f:((String,Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (title,loginForm) => apply(title,loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 04:08:51 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/login.scala.html
                  HASH: 3843d4f41eddf9f13d82b6925ee7eeb39c7f5427
                  MATRIX: 757->1|906->40|933->58|960->60|979->71|1018->73|1046->121|1079->163|1110->169|1186->237|1225->239|1270->258|1352->320|1389->330|1478->398|1514->407|1609->472|1642->475
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|40->10|41->11|43->13|45->15
                  -- GENERATED --
              */
          