
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object invalid_Scope0 {
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

class invalid extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""	"""),format.raw/*3.70*/("""

    """),format.raw/*5.5*/("""Hello, """),_display_(/*5.13*/email),format.raw/*5.18*/("""!<br>
    You have entered an invalid password!

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
object invalid extends invalid_Scope0.invalid
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 01:01:00 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/invalid.scala.html
                  HASH: 95d9fd4328021bf81a5abc1e1a3b75c58cb70c6d
                  MATRIX: 756->1|881->31|909->34|935->52|974->54|1002->102|1034->108|1068->116|1093->121
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|36->5|36->5
                  -- GENERATED --
              */
          