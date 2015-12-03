
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
    """),format.raw/*5.5*/("""<script src=""""),_display_(/*5.19*/routes/*5.25*/.Assets.versioned("javascripts/themoviedb.js")),format.raw/*5.71*/(""""></script>

    """),_display_(/*7.6*/if(redirect == 1)/*7.23*/{_display_(Seq[Any](format.raw/*7.24*/("""
        """),format.raw/*8.9*/("""<font color="red">
            <br>Note that you must rate at least 10 movies before getting recommendations.
            <br>When you have done so, please navigate to "Recommended For You".<br><br>
        </font>
    """)))}),format.raw/*12.6*/("""
    
    """),format.raw/*14.78*/("""
    """),_display_(/*15.6*/form(action = routes.RecApplication.rate(), 'id -> "ratingsForm")/*15.71*/ {_display_(Seq[Any](format.raw/*15.73*/("""
    
    """),format.raw/*17.5*/("""<div class="container">
        <div class="row">
            """),_display_(/*19.14*/for((movie, index) <- movies.zipWithIndex) yield /*19.56*/ {_display_(Seq[Any](format.raw/*19.58*/("""
                """),format.raw/*20.17*/("""<div class="col-xs-4">
                    <img id="poster"""),_display_(/*21.37*/movie/*21.42*/.id),format.raw/*21.45*/("""" src="" class = "thumbnail"></img>
                    
                    <script>
                        movie = theMovieDb.movies.getById("""),format.raw/*24.59*/("""{"""),format.raw/*24.60*/(""""id": """),_display_(/*24.67*/movie/*24.72*/.tmdbid),format.raw/*24.79*/(""" """),format.raw/*24.80*/("""}"""),format.raw/*24.81*/(""", successCB, errorCB);
                        
                        function successCB(data) """),format.raw/*26.50*/("""{"""),format.raw/*26.51*/("""
                            """),format.raw/*27.29*/("""image_size = "w150";
                            var movie = JSON.parse(data);
                            document.getElementById("poster" + """),_display_(/*29.65*/movie/*29.70*/.id),format.raw/*29.73*/(""").setAttribute("src", 
                            theMovieDb.common.getImage("""),format.raw/*30.56*/("""{"""),format.raw/*30.57*/("""size: image_size, file: movie.poster_path"""),format.raw/*30.98*/("""}"""),format.raw/*30.99*/("""));
                            
                            console.log(theMovieDb.common.getImage("""),format.raw/*32.68*/("""{"""),format.raw/*32.69*/("""size: image_size, file: movie.poster_path"""),format.raw/*32.110*/("""}"""),format.raw/*32.111*/("""));
                            console.log(movie.poster_path);
                        """),format.raw/*34.25*/("""}"""),format.raw/*34.26*/(""";
            
                        function errorCB(data) """),format.raw/*36.48*/("""{"""),format.raw/*36.49*/("""
                            """),format.raw/*37.29*/("""console.log("Error callback: " + data);
                        """),format.raw/*38.25*/("""}"""),format.raw/*38.26*/(""";
                    </script>
                    
                    """),_display_(/*41.22*/inputRadioGroup(
                        ratingsForm("m" + (index+1)),  
                        options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                        '_label -> movie.name,
                        '_error -> ratingsForm("m" + (index+1)).error.map(_.withMessage("Select Rating"))
                    )),format.raw/*46.22*/("""
                """),format.raw/*47.17*/("""</div>
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""<input type="submit" class="tenratings" value="Submit Ratings and Load More Movies">
        </div>
    </div>
    """)))}),format.raw/*52.6*/("""
    """),format.raw/*53.43*/("""
""")))}),format.raw/*54.2*/("""
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
                  DATE: Thu Dec 03 03:38:48 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/rate.scala.html
                  HASH: af8f2b6aff43770141d49421cb6c6da82855c948
                  MATRIX: 784->1|993->99|1020->117|1047->119|1073->137|1112->139|1140->187|1171->192|1211->206|1225->212|1291->258|1334->276|1359->293|1397->294|1432->303|1682->523|1720->606|1752->612|1826->677|1866->679|1903->689|1993->752|2051->794|2091->796|2136->813|2222->872|2236->877|2260->880|2432->1024|2461->1025|2495->1032|2509->1037|2537->1044|2566->1045|2595->1046|2720->1143|2749->1144|2806->1173|2976->1316|2990->1321|3014->1324|3120->1402|3149->1403|3218->1444|3247->1445|3375->1545|3404->1546|3474->1587|3504->1588|3620->1676|3649->1677|3739->1739|3768->1740|3825->1769|3917->1833|3946->1834|4047->1908|4426->2266|4471->2283|4522->2303|4563->2316|4709->2432|4742->2475|4774->2477
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|35->5|35->5|35->5|35->5|37->7|37->7|37->7|38->8|42->12|44->14|45->15|45->15|45->15|47->17|49->19|49->19|49->19|50->20|51->21|51->21|51->21|54->24|54->24|54->24|54->24|54->24|54->24|54->24|56->26|56->26|57->27|59->29|59->29|59->29|60->30|60->30|60->30|60->30|62->32|62->32|62->32|62->32|64->34|64->34|66->36|66->36|67->37|68->38|68->38|71->41|76->46|77->47|78->48|79->49|82->52|83->53|84->54
                  -- GENERATED --
              */
          