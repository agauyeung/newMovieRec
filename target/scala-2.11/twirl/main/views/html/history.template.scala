
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object history_Scope0 {
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

class history extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[MovieRatings],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, history: List[MovieRatings]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.43*/("""
    """),_display_(/*6.6*/if(history.isEmpty)/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
        """),format.raw/*7.9*/("""<font color="red">
        <br>You haven't rated any movies yet.
        </font>
    """)))}),format.raw/*10.6*/("""
    """),_display_(/*11.6*/for(rating <- history) yield /*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""
        """),format.raw/*12.9*/("""Movie ID: 
        """),_display_(/*13.10*/rating/*13.16*/.movieID),format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""Rating: 
        """),_display_(/*15.10*/rating/*15.16*/.movieRating),format.raw/*15.28*/("""
        """),format.raw/*16.9*/("""<br>
    """)))}),format.raw/*17.6*/("""
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(title:String,history:List[MovieRatings]): play.twirl.api.HtmlFormat.Appendable = apply(title,history)

  def f:((String,List[MovieRatings]) => play.twirl.api.HtmlFormat.Appendable) = (title,history) => apply(title,history)

  def ref: this.type = this

}


}

/**/
object history extends history_Scope0.history
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 19:08:31 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/history.scala.html
                  HASH: a708640865d645805b490aa0bdc341ccf097b431
                  MATRIX: 768->1|907->45|935->48|954->59|993->61|1021->109|1054->153|1085->159|1112->178|1151->180|1186->189|1302->275|1334->281|1372->303|1412->305|1448->314|1495->334|1510->340|1539->348|1575->357|1620->375|1635->381|1668->393|1704->402|1744->412|1776->414
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18
                  -- GENERATED --
              */
          