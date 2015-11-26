
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

class view extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Movies],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, movies: List[Movies]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""

"""),_display_(/*3.2*/base(title, "")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>All Movies<h1>
    
    <ul> 
    """),_display_(/*7.6*/for(movie <- movies) yield /*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
      """),format.raw/*8.7*/("""<li>"""),_display_(/*8.12*/movie/*8.17*/.name),format.raw/*8.22*/("""
        """),format.raw/*9.9*/("""<ul> 
            """),_display_(/*10.14*/movie/*10.19*/.director),format.raw/*10.28*/("""
        """),format.raw/*11.9*/("""</ul>
      </li>
    """)))}),format.raw/*13.6*/(""" 
    """),format.raw/*14.5*/("""</ul>
""")))}))
      }
    }
  }

  def render(title:String,movies:List[Movies]): play.twirl.api.HtmlFormat.Appendable = apply(title,movies)

  def f:((String,List[Movies]) => play.twirl.api.HtmlFormat.Appendable) = (title,movies) => apply(title,movies)

  def ref: this.type = this

}


}

/**/
object view extends view_Scope0.view
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 04:54:59 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/view.scala.html
                  HASH: 8a422168ba3905279fcaa8f04c2f924736f45f21
                  MATRIX: 756->1|888->38|916->41|939->56|978->58|1009->63|1073->102|1108->122|1147->124|1180->131|1211->136|1224->141|1249->146|1284->155|1330->174|1344->179|1374->188|1410->197|1463->220|1496->226
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|45->14
                  -- GENERATED --
              */
          