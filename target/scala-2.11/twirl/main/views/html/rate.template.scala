
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rate_Scope0 {
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

class rate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,List[String],Form[TenRatings],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, movies: List[String], ratingsForm: Form[TenRatings], redirect: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.100*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, email)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""	"""),format.raw/*4.70*/("""

    """),_display_(/*6.6*/if(redirect == 1)/*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
        """),format.raw/*7.9*/("""<font color="red">
            <br>Note that you must rate at least 10 movies before getting recommendations.
            <br>When you have done so, please navigate to "Recommended For You".<br><br>
        </font>
    """)))}),format.raw/*11.6*/("""
    
    """),format.raw/*13.78*/("""
    """),_display_(/*14.6*/form(action = routes.RecApplication.rate(), 'id -> "ratingsForm")/*14.71*/ {_display_(Seq[Any](format.raw/*14.73*/("""
        """),_display_(/*15.10*/for((movie, index) <- movies.zipWithIndex) yield /*15.52*/ {_display_(Seq[Any](format.raw/*15.54*/("""
            """),_display_(/*16.14*/inputRadioGroup(
                ratingsForm("m" + (index+1)),  
                options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                '_label -> movie,
                '_error -> ratingsForm("m" + (index+1)).error.map(_.withMessage("Select Rating"))
            )),format.raw/*21.14*/(""" 
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""<input type="submit" class="tenratings" value="Submit Ratings and Load More Movies">         
    """)))}),format.raw/*24.6*/("""
    """),format.raw/*25.43*/("""
""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String,movies:List[String],ratingsForm:Form[TenRatings],redirect:Int): play.twirl.api.HtmlFormat.Appendable = apply(title,email,movies,ratingsForm,redirect)

  def f:((String,String,List[String],Form[TenRatings],Int) => play.twirl.api.HtmlFormat.Appendable) = (title,email,movies,ratingsForm,redirect) => apply(title,email,movies,ratingsForm,redirect)

  def ref: this.type = this

}


}

/**/
object rate extends rate_Scope0.rate
              /*
                  -- GENERATED --
                  DATE: Mon Nov 30 22:07:57 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/rate.scala.html
                  HASH: 6ef061452a8b2ddcae6351b83363c4bfe32c0593
                  MATRIX: 784->1|993->99|1020->117|1047->119|1073->137|1112->139|1140->187|1172->194|1197->211|1235->212|1270->221|1520->441|1558->524|1590->530|1664->595|1704->597|1741->607|1799->649|1839->651|1880->665|2214->978|2256->989|2292->998|2421->1097|2454->1140|2486->1142
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|36->6|36->6|37->7|41->11|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|51->21|52->22|53->23|54->24|55->25|56->26
                  -- GENERATED --
              */
          