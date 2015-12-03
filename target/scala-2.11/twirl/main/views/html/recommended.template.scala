
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recommended_Scope0 {
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

class recommended extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Movies],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, recommendations: List[Movies] , username : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/base(title, username)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""	"""),format.raw/*3.73*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/themoviedb.js")),format.raw/*4.71*/(""""></script>
    
    """),format.raw/*6.43*/("""
    
    """),_display_(/*8.6*/for(movie <- recommendations) yield /*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
        """),format.raw/*9.9*/("""<img id="poster"""),_display_(/*9.25*/movie/*9.30*/.id),format.raw/*9.33*/("""" src=""></img>
        <script>
            movie = theMovieDb.movies.getById("""),format.raw/*11.47*/("""{"""),format.raw/*11.48*/(""""id": """),_display_(/*11.55*/movie/*11.60*/.tmdbid),format.raw/*11.67*/(""" """),format.raw/*11.68*/("""}"""),format.raw/*11.69*/(""", successCB, errorCB);
                    
            function successCB(data) """),format.raw/*13.38*/("""{"""),format.raw/*13.39*/("""
                """),format.raw/*14.17*/("""image_size = "w150";
                var movie = JSON.parse(data);
                document.getElementById("poster" + """),_display_(/*16.53*/movie/*16.58*/.id),format.raw/*16.61*/(""").setAttribute("src", 
                theMovieDb.common.getImage("""),format.raw/*17.44*/("""{"""),format.raw/*17.45*/("""size: image_size, file: movie.poster_path"""),format.raw/*17.86*/("""}"""),format.raw/*17.87*/("""));
                        
                console.log(theMovieDb.common.getImage("""),format.raw/*19.56*/("""{"""),format.raw/*19.57*/("""size: image_size, file: movie.poster_path"""),format.raw/*19.98*/("""}"""),format.raw/*19.99*/("""));
                console.log(movie.poster_path);
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/(""";
        
            function errorCB(data) """),format.raw/*23.36*/("""{"""),format.raw/*23.37*/("""
                """),format.raw/*24.17*/("""console.log("Error callback: " + data);
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/(""";
        </script>
        <br>
        <b>"""),_display_(/*28.13*/movie/*28.18*/.name),format.raw/*28.23*/("""</b>
        <br>
        <br>
    """)))}),format.raw/*31.6*/("""
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(title:String,recommendations:List[Movies],username:String): play.twirl.api.HtmlFormat.Appendable = apply(title,recommendations,username)

  def f:((String,List[Movies],String) => play.twirl.api.HtmlFormat.Appendable) = (title,recommendations,username) => apply(title,recommendations,username)

  def ref: this.type = this

}


}

/**/
object recommended extends recommended_Scope0.recommended
              /*
                  -- GENERATED --
                  DATE: Wed Dec 02 21:32:15 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/recommended.scala.html
                  HASH: bea26d83b7bcbeb467605edf11a2820ea00af2d5
                  MATRIX: 777->1|938->67|966->70|995->91|1034->93|1062->141|1093->146|1133->160|1147->166|1213->212|1261->271|1297->282|1341->311|1380->313|1415->322|1457->338|1470->343|1493->346|1600->425|1629->426|1663->433|1677->438|1705->445|1734->446|1763->447|1872->528|1901->529|1946->546|2092->665|2106->670|2130->673|2224->739|2253->740|2322->781|2351->782|2463->866|2492->867|2561->908|2590->909|2682->973|2711->974|2785->1020|2814->1021|2859->1038|2939->1090|2968->1091|3040->1136|3054->1141|3080->1146|3146->1182|3178->1184
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|39->8|39->8|39->8|40->9|40->9|40->9|40->9|42->11|42->11|42->11|42->11|42->11|42->11|42->11|44->13|44->13|45->14|47->16|47->16|47->16|48->17|48->17|48->17|48->17|50->19|50->19|50->19|50->19|52->21|52->21|54->23|54->23|55->24|56->25|56->25|59->28|59->28|59->28|62->31|63->32
                  -- GENERATED --
              */
          