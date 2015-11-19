
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

class results extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, recommendations: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""
    """),format.raw/*4.43*/("""
    """),_display_(/*5.6*/for(recommendation <- recommendations) yield /*5.44*/ {_display_(Seq[Any](format.raw/*5.46*/("""
        """),_display_(/*6.10*/recommendation),format.raw/*6.24*/("""  
        """),format.raw/*7.9*/("""<br>
    """)))}),format.raw/*8.6*/("""
""")))}),format.raw/*9.2*/("""
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
object results extends results_Scope0.results
              /*
                  -- GENERATED --
                  DATE: Wed Nov 04 17:41:45 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/app/views/results.scala.html
                  HASH: f64c404ae952e6fe9e1d548abb2b49bf9ca384fc
                  MATRIX: 762->1|903->47|931->50|950->61|989->63|1017->111|1049->154|1080->160|1133->198|1172->200|1208->210|1242->224|1279->235|1318->245|1349->247
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|38->7|39->8|40->9
                  -- GENERATED --
              */
          