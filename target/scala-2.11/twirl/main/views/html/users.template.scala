
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<h1>View All Users/<h1>

<ul> 
"""),_display_(/*6.2*/for(users <- users) yield /*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
  """),format.raw/*7.3*/("""<p>"""),_display_(/*7.7*/users/*7.12*/.userID),format.raw/*7.19*/("""</->
  <li>"""),_display_(/*8.8*/users/*8.13*/.username),format.raw/*8.22*/("""
    """),format.raw/*9.5*/("""<ul> 
        """),_display_(/*10.10*/users/*10.15*/.password),format.raw/*10.24*/("""
    """),format.raw/*11.5*/("""</ul>
  </li>
""")))}),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""</ul>
"""))
      }
    }
  }

  def render(users:List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Fri Nov 20 02:00:24 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/users.scala.html
                  HASH: c5bfd8bc6046d96c3672d287163356cab3d9d17a
                  MATRIX: 750->1|865->21|893->23|950->55|984->74|1023->76|1052->79|1081->83|1094->88|1121->95|1158->107|1171->112|1200->121|1231->126|1273->141|1287->146|1317->155|1349->160|1394->175|1422->176
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|45->14
                  -- GENERATED --
              */
          