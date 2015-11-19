
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object view_Scope0 {
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

class view extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Movies],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movies: List[Movies]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*3.1*/("""<h1>View All Movies/<h1>

<ul> 
"""),_display_(/*6.2*/for(movie <- movies) yield /*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
  """),format.raw/*7.3*/("""<li>"""),_display_(/*7.8*/movie/*7.13*/.name),format.raw/*7.18*/("""
    """),format.raw/*8.5*/("""<ul> 
        """),_display_(/*9.10*/movie/*9.15*/.director),format.raw/*9.24*/("""
    """),format.raw/*10.5*/("""</ul>
  </li>
""")))}),format.raw/*12.2*/(""" 
"""),format.raw/*13.1*/("""</ul>
"""))
      }
    }
  }

  def render(movies:List[Movies]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((List[Movies]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


}

/**/
object view extends view_Scope0.view
              /*
                  -- GENERATED --
                  DATE: Wed Nov 04 17:41:45 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/app/views/view.scala.html
                  HASH: b17195fb715d44840671890982af1f3dd3c8ba6d
                  MATRIX: 749->1|866->23|894->25|952->58|987->78|1026->80|1055->83|1085->88|1098->93|1123->98|1154->103|1195->118|1208->123|1237->132|1269->137|1314->152|1343->154
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|43->12|44->13
                  -- GENERATED --
              */
          