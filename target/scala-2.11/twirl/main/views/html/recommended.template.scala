
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recommended_Scope0 {
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

class recommended extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, recommendations: List[String] , username : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/base(title, username)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""	"""),format.raw/*3.73*/("""
    """),format.raw/*4.43*/("""
    """),format.raw/*5.5*/("""<font color="blue">
        <br>Welcome """),_display_(/*6.22*/username),format.raw/*6.30*/("""!
        <br>
        <br>
    </font>
    """),_display_(/*10.6*/recommendations),format.raw/*10.21*/(""" """),format.raw/*10.22*/("""= recommendations.reverse
    """),_display_(/*11.6*/for(recommendation <- recommendations) yield /*11.44*/ {_display_(Seq[Any](format.raw/*11.46*/("""
        """),_display_(/*12.10*/recommendation),format.raw/*12.24*/("""  
        """),format.raw/*13.9*/("""<br>
        <br>
    """)))}),format.raw/*15.6*/("""
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(title:String,recommendations:List[String],username:String): play.twirl.api.HtmlFormat.Appendable = apply(title,recommendations,username)

  def f:((String,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (title,recommendations,username) => apply(title,recommendations,username)

  def ref: this.type = this

}


}

/**/
object recommended extends recommended_Scope0.recommended
              /*
                  -- GENERATED --
                  DATE: Fri Nov 27 01:44:52 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/recommended.scala.html
                  HASH: 54b093b2f2c7a2c252ae471d377c70542538a897
                  MATRIX: 777->1|938->67|966->70|995->91|1034->93|1062->141|1094->184|1125->189|1192->230|1220->238|1291->283|1327->298|1356->299|1413->330|1467->368|1507->370|1544->380|1579->394|1617->405|1670->428|1702->430
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|37->6|37->6|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|44->13|46->15|47->16
                  -- GENERATED --
              */
          