
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
    """),format.raw/*4.53*/("""
    """),_display_(/*5.6*/title),format.raw/*5.11*/("""!

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
                  DATE: Wed Dec 16 22:39:32 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/invalid.scala.html
                  HASH: 1789bb80534ecb0287887bdc288355fa43c0387e
                  MATRIX: 756->1|881->31|909->34|935->52|974->54|1002->102|1034->155|1065->161|1090->166
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|36->5
                  -- GENERATED --
              */
          