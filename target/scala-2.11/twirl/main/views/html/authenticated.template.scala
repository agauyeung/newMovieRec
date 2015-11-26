
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object authenticated_Scope0 {
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

class authenticated extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.5*/("""Welcome, """),_display_(/*5.15*/email),format.raw/*5.20*/("""!<br>
    You are logged in!

""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(title,email)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,email) => apply(title,email)

  def ref: this.type = this

}


}

/**/
object authenticated extends authenticated_Scope0.authenticated
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 19:08:31 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/authenticated.scala.html
                  HASH: 365f48fac935e2e8bed945f7c6ae0a73753505db
                  MATRIX: 768->1|893->31|921->34|940->45|979->47|1007->95|1039->101|1075->111|1100->116|1160->147
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5|39->8
                  -- GENERATED --
              */
          