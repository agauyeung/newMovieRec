
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
    """),format.raw/*4.92*/("""
    """),format.raw/*5.43*/("""
    """),_display_(/*6.6*/recommendations),format.raw/*6.21*/(""" """),format.raw/*6.22*/("""= recommendations.reverse
    """),_display_(/*7.6*/for(recommendation <- recommendations) yield /*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""
        """),_display_(/*8.10*/recommendation),format.raw/*8.24*/("""  
        """),format.raw/*9.9*/("""<br>
    """)))}),format.raw/*10.6*/("""
""")))}),format.raw/*11.2*/("""
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
                  DATE: Wed Dec 16 22:39:31 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/results.scala.html
                  HASH: 25b7e0b0a82e8f7859e0876d3ff08d591865b986
                  MATRIX: 769->1|925->62|953->65|979->83|1018->85|1046->133|1078->225|1110->268|1141->274|1176->289|1204->290|1260->321|1313->359|1352->361|1388->371|1422->385|1459->396|1499->406|1531->408
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|40->9|41->10|42->11
                  -- GENERATED --
              */
          