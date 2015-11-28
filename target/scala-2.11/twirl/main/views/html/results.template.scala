
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object results_Scope0 {
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

class results extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, recommendations: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""	"""),format.raw/*3.70*/("""
    """),format.raw/*4.43*/("""
    """),_display_(/*5.6*/recommendations),format.raw/*5.21*/(""" """),format.raw/*5.22*/("""= recommendations.reverse
    """),_display_(/*6.6*/for(recommendation <- recommendations) yield /*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
        """),_display_(/*7.10*/recommendation),format.raw/*7.24*/("""  
        """),format.raw/*8.9*/("""<br>
    """)))}),format.raw/*9.6*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String,recommendations:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(title,email,recommendations)

  def f:((String,String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (title,email,recommendations) => apply(title,email,recommendations)

  def ref: this.type = this

}


}

/**/
object results extends results_Scope0.results
              /*
                  -- GENERATED --
                  DATE: Sat Nov 28 01:01:00 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/results.scala.html
                  HASH: 033d70b63504338f92f5a518a4dd301dd8ad2ac9
                  MATRIX: 769->1|925->62|953->65|979->83|1018->85|1046->133|1078->176|1109->182|1144->197|1172->198|1228->229|1281->267|1320->269|1356->279|1390->293|1427->304|1466->314|1498->316
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|39->8|40->9|41->10
                  -- GENERATED --
              */
          