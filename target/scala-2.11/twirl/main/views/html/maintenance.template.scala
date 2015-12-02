
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object maintenance_Scope0 {
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

class maintenance extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/base("Site Under Maintenance", "User")/*1.40*/ {_display_(Seq[Any](format.raw/*1.42*/("""	"""),format.raw/*1.90*/("""

    """),format.raw/*3.5*/("""<font color="red">
    <br>The site is currently under mainenance. Please try again later.
    </font>

""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object maintenance extends maintenance_Scope0.maintenance
              /*
                  -- GENERATED --
                  DATE: Tue Dec 01 20:41:19 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/maintenance.scala.html
                  HASH: 67f5f74ddea21bcf677ef47bc8932270f85db8ad
                  MATRIX: 839->1|885->39|924->41|952->89|984->95|1118->200
                  LINES: 32->1|32->1|32->1|32->1|34->3|38->7
                  -- GENERATED --
              */
          