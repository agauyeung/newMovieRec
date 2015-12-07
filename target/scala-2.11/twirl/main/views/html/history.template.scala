
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

class history extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,List[MovieRatings],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, history: List[MovieRatings]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""	"""),format.raw/*3.70*/("""

    """),format.raw/*5.43*/("""
    """),_display_(/*6.6*/if(history.isEmpty)/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
        """),format.raw/*7.9*/("""<font color="red">
        <br>You haven't rated any movies yet.
        </font>
    """)))}),format.raw/*10.6*/("""
    """),_display_(/*11.6*/for(rating <- history) yield /*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""
        """),format.raw/*12.9*/("""Movie ID: 
        """),_display_(/*13.10*/(rating.movieID - 1)),format.raw/*13.30*/("""
        """),format.raw/*14.9*/("""Rating: 
        """),_display_(/*15.10*/rating/*15.16*/.movieRating),format.raw/*15.28*/("""
        """),format.raw/*16.9*/("""<br>
    """)))}),format.raw/*17.6*/("""
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String,history:List[MovieRatings]): play.twirl.api.HtmlFormat.Appendable = apply(title,email,history)

  def f:((String,String,List[MovieRatings]) => play.twirl.api.HtmlFormat.Appendable) = (title,email,history) => apply(title,email,history)

  def ref: this.type = this

}


}

/**/
object history extends history_Scope0.history
              /*
                  -- GENERATED --
                  DATE: Fri Dec 04 01:37:52 PST 2015
                  SOURCE: /Users/alphaneo1/login/app/views/history.scala.html
                  HASH: 9a98cd64cd364f85a1d9135ef177ef13dd7ad3b1
                  MATRIX: 775->1|929->60|957->63|983->81|1022->83|1050->131|1083->175|1114->181|1141->200|1180->202|1215->211|1331->297|1363->303|1401->325|1441->327|1477->336|1524->356|1565->376|1601->385|1646->403|1661->409|1694->421|1730->430|1770->440|1802->442
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|41->10|42->11|42->11|42->11|43->12|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18
                  -- GENERATED --
              */
          