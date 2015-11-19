
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
  def apply/*1.2*/(title: String, username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.5*/("""Welcome, """),_display_(/*5.15*/username),format.raw/*5.23*/("""!<br>
    You are now a member of our movie recommendation application. Enjoy!

""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(title:String,username:String): play.twirl.api.HtmlFormat.Appendable = apply(title,username)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,username) => apply(title,username)

  def ref: this.type = this

}


}

/**/
object registered extends registered_Scope0.registered
              /*
                  -- GENERATED --
                  DATE: Wed Nov 04 17:41:45 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/app/views/registered.scala.html
                  HASH: c7e9fc740d56cc1cb729e7f2e6731a02b4393098
                  MATRIX: 762->1|890->34|918->37|937->48|976->50|1004->98|1036->104|1072->114|1100->122|1210->203
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5|39->8
                  -- GENERATED --
              */
          