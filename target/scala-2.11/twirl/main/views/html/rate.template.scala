
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

class rate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,String,List[Movies],Form[TenRatings],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, movies: List[Movies], ratingsForm: Form[TenRatings], redirect: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.100*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, email)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""	"""),format.raw/*4.70*/("""
    """),format.raw/*5.59*/("""

    """),format.raw/*7.5*/("""<script src=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("javascripts/themoviedb.js")),format.raw/*7.71*/(""""></script>

    """),_display_(/*9.6*/if(redirect == 1)/*9.23*/{_display_(Seq[Any](format.raw/*9.24*/("""
        """),format.raw/*10.9*/("""<font color="red">
            <br>Note that you must rate at least 10 movies before getting recommendations.
            <br>When you have done so, please navigate to "Recommended".<br><br>
        </font>
    """)))}),format.raw/*14.6*/("""
    
    """),_display_(/*16.6*/form(action = routes.RecApplication.rate(), 'id -> "ratingsForm")/*16.71*/ {_display_(Seq[Any](format.raw/*16.73*/("""
    
    """),format.raw/*18.5*/("""<div class="container">
        <div class="row">
            """),_display_(/*20.14*/for((movie, index) <- movies.zipWithIndex) yield /*20.56*/ {_display_(Seq[Any](format.raw/*20.58*/("""
                """),format.raw/*21.17*/("""<div class="col-xs-4">
                    <img id="poster"""),_display_(/*22.37*/movie/*22.42*/.id),format.raw/*22.45*/("""" src="" class = "thumbnail"></img>
                    
                    <script>
                        movie = theMovieDb.movies.getById("""),format.raw/*25.59*/("""{"""),format.raw/*25.60*/(""""id": """),_display_(/*25.67*/movie/*25.72*/.tmdbid),format.raw/*25.79*/(""" """),format.raw/*25.80*/("""}"""),format.raw/*25.81*/(""", successCB, errorCB);
                        
                        function successCB(data) """),format.raw/*27.50*/("""{"""),format.raw/*27.51*/("""
                            """),format.raw/*28.29*/("""image_size = "w150";
                            var movie = JSON.parse(data);
                            document.getElementById("poster" + """),_display_(/*30.65*/movie/*30.70*/.id),format.raw/*30.73*/(""").setAttribute("src", 
                            theMovieDb.common.getImage("""),format.raw/*31.56*/("""{"""),format.raw/*31.57*/("""size: image_size, file: movie.poster_path"""),format.raw/*31.98*/("""}"""),format.raw/*31.99*/("""));
                            
                            console.log(theMovieDb.common.getImage("""),format.raw/*33.68*/("""{"""),format.raw/*33.69*/("""size: image_size, file: movie.poster_path"""),format.raw/*33.110*/("""}"""),format.raw/*33.111*/("""));
                            console.log(movie.poster_path);
                        """),format.raw/*35.25*/("""}"""),format.raw/*35.26*/(""";
            
                        function errorCB(data) """),format.raw/*37.48*/("""{"""),format.raw/*37.49*/("""
                            """),format.raw/*38.29*/("""console.log("Error callback: " + data);
                        """),format.raw/*39.25*/("""}"""),format.raw/*39.26*/(""";
                    </script>
                    """),format.raw/*41.92*/("""
                    
                    """),_display_(/*43.22*/inputRadioGroup(
                        ratingsForm("m" + (index+1)),  
                        options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                        '_label -> movie.name,
                        '_error -> ratingsForm("m" + (index+1)).error.map(_.withMessage("Select Rating"))
                    )),format.raw/*48.22*/("""
                """),format.raw/*49.17*/("""</div>
            """)))}),format.raw/*50.14*/("""
            """),format.raw/*51.13*/("""<div class="center-block">
                <input type="submit" class="tenratings" value="Submit Ratings and Load More Movies">
            </div>
        </div>
    </div>
    """)))}),format.raw/*56.6*/("""
    """),format.raw/*57.43*/("""
""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String,movies:List[Movies],ratingsForm:Form[TenRatings],redirect:Int): play.twirl.api.HtmlFormat.Appendable = apply(title,email,movies,ratingsForm,redirect)

  def f:((String,String,List[Movies],Form[TenRatings],Int) => play.twirl.api.HtmlFormat.Appendable) = (title,email,movies,ratingsForm,redirect) => apply(title,email,movies,ratingsForm,redirect)

  def ref: this.type = this

}


}

/**/
object rate extends rate_Scope0.rate
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 22:39:32 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/rate.scala.html
                  HASH: c23e16f182d3552d575996a25c292f0cc2f50748
                  MATRIX: 784->1|993->99|1020->117|1047->119|1073->137|1112->139|1140->187|1172->246|1204->252|1244->266|1258->272|1324->318|1367->336|1392->353|1430->354|1466->363|1708->575|1745->586|1819->651|1859->653|1896->663|1986->726|2044->768|2084->770|2129->787|2215->846|2229->851|2253->854|2425->998|2454->999|2488->1006|2502->1011|2530->1018|2559->1019|2588->1020|2713->1117|2742->1118|2799->1147|2969->1290|2983->1295|3007->1298|3113->1376|3142->1377|3211->1418|3240->1419|3368->1519|3397->1520|3467->1561|3497->1562|3613->1650|3642->1651|3732->1713|3761->1714|3818->1743|3910->1807|3939->1808|4019->1931|4089->1974|4468->2332|4513->2349|4564->2369|4605->2382|4813->2560|4846->2603|4878->2605
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|35->5|37->7|37->7|37->7|37->7|39->9|39->9|39->9|40->10|44->14|46->16|46->16|46->16|48->18|50->20|50->20|50->20|51->21|52->22|52->22|52->22|55->25|55->25|55->25|55->25|55->25|55->25|55->25|57->27|57->27|58->28|60->30|60->30|60->30|61->31|61->31|61->31|61->31|63->33|63->33|63->33|63->33|65->35|65->35|67->37|67->37|68->38|69->39|69->39|71->41|73->43|78->48|79->49|80->50|81->51|86->56|87->57|88->58
                  -- GENERATED --
              */
          