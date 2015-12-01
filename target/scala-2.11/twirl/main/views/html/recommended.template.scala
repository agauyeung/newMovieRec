
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
        """),format.raw/*9.9*/("""<li>"""),_display_(/*9.14*/movie/*9.19*/.id),format.raw/*9.22*/("""
            """),format.raw/*10.13*/("""<ul>
                """),_display_(/*11.18*/movie/*11.23*/.name),format.raw/*11.28*/("""
            """),format.raw/*12.13*/("""</ul>
            <ul>
                """),_display_(/*14.18*/movie/*14.23*/.tmdbid),format.raw/*14.30*/("""
            """),format.raw/*15.13*/("""</ul>
            <div>
            <img id="poster"""),_display_(/*17.29*/movie/*17.34*/.id),format.raw/*17.37*/("""" src="">
                
            </img>
            
            <script>
                movie = theMovieDb.movies.getById("""),format.raw/*22.51*/("""{"""),format.raw/*22.52*/(""""id": """),_display_(/*22.59*/movie/*22.64*/.tmdbid),format.raw/*22.71*/(""" """),format.raw/*22.72*/("""}"""),format.raw/*22.73*/(""", successCB, errorCB);
                
                function successCB(data) """),format.raw/*24.42*/("""{"""),format.raw/*24.43*/("""
                    """),format.raw/*25.21*/("""image_size = "w500";
                    var movie = JSON.parse(data);
                    document.getElementById("poster" + """),_display_(/*27.57*/movie/*27.62*/.id),format.raw/*27.65*/(""").setAttribute("src", 
                    theMovieDb.common.getImage("""),format.raw/*28.48*/("""{"""),format.raw/*28.49*/("""size: image_size, file: movie.poster_path"""),format.raw/*28.90*/("""}"""),format.raw/*28.91*/("""));
                    
                    console.log(theMovieDb.common.getImage("""),format.raw/*30.60*/("""{"""),format.raw/*30.61*/("""size: image_size, file: movie.poster_path"""),format.raw/*30.102*/("""}"""),format.raw/*30.103*/("""));
                    console.log(movie.poster_path);
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/(""";
    
                function errorCB(data) """),format.raw/*34.40*/("""{"""),format.raw/*34.41*/("""
                    """),format.raw/*35.21*/("""console.log("Error callback: " + data);
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/(""";
             </script>
         </div>
        </li>
        <br>
        <br>
    """)))}),format.raw/*42.6*/("""
""")))}),format.raw/*43.2*/("""
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
                  DATE: Tue Dec 01 01:12:47 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/recommended.scala.html
                  HASH: 7bfb83515a522798a0cd9a54e6a247efb5d96a33
                  MATRIX: 777->1|938->67|966->70|995->91|1034->93|1062->141|1093->146|1133->160|1147->166|1213->212|1261->271|1297->282|1341->311|1380->313|1415->322|1446->327|1459->332|1482->335|1523->348|1572->370|1586->375|1612->380|1653->393|1720->433|1734->438|1762->445|1803->458|1882->510|1896->515|1920->518|2078->648|2107->649|2141->656|2155->661|2183->668|2212->669|2241->670|2350->751|2379->752|2428->773|2582->900|2596->905|2620->908|2718->978|2747->979|2816->1020|2845->1021|2957->1105|2986->1106|3056->1147|3086->1148|3186->1220|3215->1221|3289->1267|3318->1268|3367->1289|3451->1345|3480->1346|3596->1432|3628->1434
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|45->14|45->14|45->14|46->15|48->17|48->17|48->17|53->22|53->22|53->22|53->22|53->22|53->22|53->22|55->24|55->24|56->25|58->27|58->27|58->27|59->28|59->28|59->28|59->28|61->30|61->30|61->30|61->30|63->32|63->32|65->34|65->34|66->35|67->36|67->36|73->42|74->43
                  -- GENERATED --
              */
          