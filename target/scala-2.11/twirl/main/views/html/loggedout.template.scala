
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object loggedout_Scope0 {
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

class loggedout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""	"""),format.raw/*3.70*/("""

    """),format.raw/*5.5*/("""Hello, """),_display_(/*5.13*/email),format.raw/*5.18*/("""!<br>
    You are now logged out!

""")))}))
      }
    }
  }

  def render(title:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(title,email)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,email) => apply(title,email)

  def ref: this.type = this

}


}

/**/
object loggedout extends loggedout_Scope0.loggedout
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 01:01:00 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/loggedout.scala.html
                  HASH: 7b3b95072e65e74a7cddb6e58c84a026728befd4
                  MATRIX: 760->1|885->31|913->34|939->52|978->54|1006->102|1038->108|1072->116|1097->121
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5
                  -- GENERATED --
              */
          