
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
  def apply/*1.2*/(title: String, username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.5*/("""Welcome, """),_display_(/*5.15*/username),format.raw/*5.23*/("""!<br>
    You are logged in!

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
object authenticated extends authenticated_Scope0.authenticated
              /*
                  -- GENERATED --
                  DATE: Wed Nov 04 17:41:45 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/app/views/authenticated.scala.html
                  HASH: e47220cb2b3c8cc490d4860455fb86d8bb6670ff
                  MATRIX: 768->1|896->34|924->37|943->48|982->50|1010->98|1042->104|1078->114|1106->122|1166->153
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5|39->8
                  -- GENERATED --
              */
          