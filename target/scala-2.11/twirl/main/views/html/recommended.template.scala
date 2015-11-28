
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
                  DATE: Sat Nov 28 01:01:00 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/recommended.scala.html
                  HASH: 471500397db77da853c033c4a56fbfa777a46018
                  MATRIX: 777->1|938->67|966->70|995->91|1034->93|1062->141|1094->184|1125->189|1192->230|1220->238|1296->288|1350->326|1390->328|1427->338|1462->352|1500->363|1553->386|1585->388
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|37->6|37->6|42->11|42->11|42->11|43->12|43->12|44->13|46->15|47->16
                  -- GENERATED --
              */
          