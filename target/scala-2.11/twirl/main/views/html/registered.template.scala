
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registered_Scope0 {
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

class registered extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""	"""),format.raw/*3.70*/("""

    """),format.raw/*5.5*/("""Welcome, """),_display_(/*5.15*/email),format.raw/*5.20*/("""!<br>
    You are now a member of our movie recommendation application. Enjoy!

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
object registered extends registered_Scope0.registered
              /*
                  -- GENERATED --
                  DATE: Fri Dec 04 01:37:52 PST 2015
                  SOURCE: /Users/alphaneo1/login/app/views/registered.scala.html
                  HASH: 63f920bb38148de0e8edd6abb31e80b42c374b28
                  MATRIX: 762->1|887->31|915->34|941->52|980->54|1008->102|1040->108|1076->118|1101->123|1211->204
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5|39->8
                  -- GENERATED --
              */
          