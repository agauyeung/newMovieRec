
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

class rate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[String],Form[TenRatings],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, movies: List[String], ratingsForm: Form[TenRatings]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""	"""),format.raw/*4.63*/("""

    """),format.raw/*6.5*/("""<font color="red">
        <br>Note that you must rate at least 10 movies before getting recommendations.
        <br>Ignore this message if you have already rated at least 10 movies.<br><br>
    </font>

    """),format.raw/*11.78*/("""
    """),_display_(/*12.6*/form(action = routes.RecApplication.rate(), 'id -> "ratingsForm")/*12.71*/ {_display_(Seq[Any](format.raw/*12.73*/("""
        """),_display_(/*13.10*/for((movie, index) <- movies.zipWithIndex) yield /*13.52*/ {_display_(Seq[Any](format.raw/*13.54*/("""
            """),_display_(/*14.14*/inputRadioGroup(
                ratingsForm("m" + (index+1)),  
                options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                '_label -> movie,
                '_error -> ratingsForm("m" + (index+1)).error.map(_.withMessage("Select Rating"))
            )),format.raw/*19.14*/(""" 
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""<input type="submit" class="tenratings" value="Submit Ratings">         
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.43*/("""
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(title:String,movies:List[String],ratingsForm:Form[TenRatings]): play.twirl.api.HtmlFormat.Appendable = apply(title,movies,ratingsForm)

  def f:((String,List[String],Form[TenRatings]) => play.twirl.api.HtmlFormat.Appendable) = (title,movies,ratingsForm) => apply(title,movies,ratingsForm)

  def ref: this.type = this

}


}

/**/
object rate extends rate_Scope0.rate
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 19:08:31 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/rate.scala.html
                  HASH: 9b7cf14502e1da56ad2cb1872e74e48dd4a8bd0a
                  MATRIX: 773->1|951->69|978->87|1005->89|1024->100|1063->102|1091->150|1123->156|1360->438|1392->444|1466->509|1506->511|1543->521|1601->563|1641->565|1682->579|2016->892|2058->903|2094->912|2202->990|2235->1033|2267->1035
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|49->19|50->20|51->21|52->22|53->23|54->24
                  -- GENERATED --
              */
          