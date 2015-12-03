
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
        """),_display_(/*16.10*/for((movie, index) <- movies.zipWithIndex) yield /*16.52*/ {_display_(Seq[Any](format.raw/*16.54*/("""
            """),format.raw/*17.13*/("""<img id="poster"""),_display_(/*17.29*/movie/*17.34*/.id),format.raw/*17.37*/("""" src=""></img>
            
            <script>
                movie = theMovieDb.movies.getById("""),format.raw/*20.51*/("""{"""),format.raw/*20.52*/(""""id": """),_display_(/*20.59*/movie/*20.64*/.tmdbid),format.raw/*20.71*/(""" """),format.raw/*20.72*/("""}"""),format.raw/*20.73*/(""", successCB, errorCB);
                
                function successCB(data) """),format.raw/*22.42*/("""{"""),format.raw/*22.43*/("""
                    """),format.raw/*23.21*/("""image_size = "w150";
                    var movie = JSON.parse(data);
                    document.getElementById("poster" + """),_display_(/*25.57*/movie/*25.62*/.id),format.raw/*25.65*/(""").setAttribute("src", 
                    theMovieDb.common.getImage("""),format.raw/*26.48*/("""{"""),format.raw/*26.49*/("""size: image_size, file: movie.poster_path"""),format.raw/*26.90*/("""}"""),format.raw/*26.91*/("""));
                    
                    console.log(theMovieDb.common.getImage("""),format.raw/*28.60*/("""{"""),format.raw/*28.61*/("""size: image_size, file: movie.poster_path"""),format.raw/*28.102*/("""}"""),format.raw/*28.103*/("""));
                    console.log(movie.poster_path);
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/(""";
    
                function errorCB(data) """),format.raw/*32.40*/("""{"""),format.raw/*32.41*/("""
                    """),format.raw/*33.21*/("""console.log("Error callback: " + data);
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/(""";
            </script>
            
            """),_display_(/*37.14*/inputRadioGroup(
                ratingsForm("m" + (index+1)),  
                options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                '_label -> movie.name,
                '_error -> ratingsForm("m" + (index+1)).error.map(_.withMessage("Select Rating"))
            )),format.raw/*42.14*/(""" 
        """)))}),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""<input type="submit" class="tenratings" value="Submit Ratings and Load More Movies">         
    """)))}),format.raw/*45.6*/("""
    """),format.raw/*46.43*/("""
""")))}),format.raw/*47.2*/("""
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
                  DATE: Wed Dec 02 21:32:15 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/rate.scala.html
                  HASH: f57cba6d1b43b767924b6f6b8542073f2e0081a1
                  MATRIX: 784->1|993->99|1020->117|1047->119|1073->137|1112->139|1140->187|1171->192|1211->206|1225->212|1291->258|1334->276|1359->293|1397->294|1432->303|1682->523|1720->606|1752->612|1826->677|1866->679|1903->689|1961->731|2001->733|2042->746|2085->762|2099->767|2123->770|2251->870|2280->871|2314->878|2328->883|2356->890|2385->891|2414->892|2523->973|2552->974|2601->995|2755->1122|2769->1127|2793->1130|2891->1200|2920->1201|2989->1242|3018->1243|3130->1327|3159->1328|3229->1369|3259->1370|3359->1442|3388->1443|3462->1489|3491->1490|3540->1511|3624->1567|3653->1568|3730->1618|4069->1936|4111->1947|4147->1956|4276->2055|4309->2098|4341->2100
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|35->5|35->5|35->5|35->5|37->7|37->7|37->7|38->8|42->12|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|47->17|50->20|50->20|50->20|50->20|50->20|50->20|50->20|52->22|52->22|53->23|55->25|55->25|55->25|56->26|56->26|56->26|56->26|58->28|58->28|58->28|58->28|60->30|60->30|62->32|62->32|63->33|64->34|64->34|67->37|72->42|73->43|74->44|75->45|76->46|77->47
                  -- GENERATED --
              */
          