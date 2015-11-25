
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

class recommended extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, recommendations: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""
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

  def render(title:String,recommendations:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(title,recommendations)

  def f:((String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (title,recommendations) => apply(title,recommendations)

  def ref: this.type = this

}


}

/**/
object recommended extends recommended_Scope0.recommended
              /*
                  -- GENERATED --
                  DATE: Tue Nov 24 19:30:22 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/recommended.scala.html
                  HASH: 52f5e77f6c0d1342370face461c4987cd34047b0
                  MATRIX: 770->1|911->47|939->50|958->61|997->63|1025->111|1057->154|1088->160|1123->175|1151->176|1207->207|1260->245|1299->247|1335->257|1369->271|1406->282|1445->292|1477->294
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|39->8|40->9|41->10
                  -- GENERATED --
              */
          