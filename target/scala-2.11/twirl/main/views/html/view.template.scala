
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

class view extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,List[Movies],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, movies: List[Movies]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.70*/("""

    """),format.raw/*6.5*/("""<script src=""""),_display_(/*6.19*/routes/*6.25*/.Assets.versioned("javascripts/themoviedb.js")),format.raw/*6.71*/(""""></script>
    
    <h1>Movies<h1>
    
    <div class="container">
        <div class="row">
        """),_display_(/*12.10*/for(movie <- movies) yield /*12.30*/ {_display_(Seq[Any](format.raw/*12.32*/("""
            """),format.raw/*13.13*/("""<div class="col-xs-4">
                <img id="poster"""),_display_(/*14.33*/movie/*14.38*/.id),format.raw/*14.41*/("""" src="" class = "thumbnail">
                
                </img>
                
                <script>
                    movie = theMovieDb.movies.getById("""),format.raw/*19.55*/("""{"""),format.raw/*19.56*/(""""id": """),_display_(/*19.63*/movie/*19.68*/.tmdbid),format.raw/*19.75*/(""" """),format.raw/*19.76*/("""}"""),format.raw/*19.77*/(""", successCB, errorCB);
                    
                    function successCB(data) """),format.raw/*21.46*/("""{"""),format.raw/*21.47*/("""
                        """),format.raw/*22.25*/("""image_size = "w500";
                        var movie = JSON.parse(data);
                        document.getElementById("poster" + """),_display_(/*24.61*/movie/*24.66*/.id),format.raw/*24.69*/(""").setAttribute("src", 
                        theMovieDb.common.getImage("""),format.raw/*25.52*/("""{"""),format.raw/*25.53*/("""size: image_size, file: movie.poster_path"""),format.raw/*25.94*/("""}"""),format.raw/*25.95*/("""));
                        
                        console.log(theMovieDb.common.getImage("""),format.raw/*27.64*/("""{"""),format.raw/*27.65*/("""size: image_size, file: movie.poster_path"""),format.raw/*27.106*/("""}"""),format.raw/*27.107*/("""));
                        console.log(movie.poster_path);
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/(""";
            
                    function errorCB(data) """),format.raw/*31.44*/("""{"""),format.raw/*31.45*/("""
                        """),format.raw/*32.25*/("""console.log("Error callback: " + data);
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/(""";
                 </script>
             </div>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(title:String,email:String,movies:List[Movies]): play.twirl.api.HtmlFormat.Appendable = apply(title,email,movies)

  def f:((String,String,List[Movies]) => play.twirl.api.HtmlFormat.Appendable) = (title,email,movies) => apply(title,email,movies)

  def ref: this.type = this

}


}

/**/
object view extends view_Scope0.view
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 22:39:32 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/view.scala.html
                  HASH: 933c26a8ca12bd8f187d0edad28f48c3d67dc52b
                  MATRIX: 763->1|910->53|938->56|964->74|1003->76|1035->146|1067->152|1107->166|1121->172|1187->218|1318->322|1354->342|1394->344|1435->357|1517->412|1531->417|1555->420|1749->586|1778->587|1812->594|1826->599|1854->606|1883->607|1912->608|2029->697|2058->698|2111->723|2273->858|2287->863|2311->866|2413->940|2442->941|2511->982|2540->983|2660->1075|2689->1076|2759->1117|2789->1118|2897->1198|2926->1199|3012->1257|3041->1258|3094->1283|3182->1343|3211->1344|3300->1402|3336->1411
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|43->12|43->12|43->12|44->13|45->14|45->14|45->14|50->19|50->19|50->19|50->19|50->19|50->19|50->19|52->21|52->21|53->22|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|60->29|60->29|62->31|62->31|63->32|64->33|64->33|67->36|68->37
                  -- GENERATED --
              */
          