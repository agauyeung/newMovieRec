
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
    """),format.raw/*5.59*/("""
    """),format.raw/*6.43*/("""
    
    """),format.raw/*8.5*/("""<div class="container">
        <div class="row">
        """),_display_(/*10.10*/for(movie <- recommendations) yield /*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<div class="col-xs-4"> 
                <img id="poster"""),_display_(/*12.33*/movie/*12.38*/.id),format.raw/*12.41*/("""" src="" class = "thumbnail"></img>
                <script>
                    movie = theMovieDb.movies.getById("""),format.raw/*14.55*/("""{"""),format.raw/*14.56*/(""""id": """),_display_(/*14.63*/movie/*14.68*/.tmdbid),format.raw/*14.75*/(""" """),format.raw/*14.76*/("""}"""),format.raw/*14.77*/(""", successCB, errorCB);
                            
                    function successCB(data) """),format.raw/*16.46*/("""{"""),format.raw/*16.47*/("""
                        """),format.raw/*17.25*/("""image_size = "w150";
                        var movie = JSON.parse(data);
                        document.getElementById("poster" + """),_display_(/*19.61*/movie/*19.66*/.id),format.raw/*19.69*/(""").setAttribute("src", 
                        theMovieDb.common.getImage("""),format.raw/*20.52*/("""{"""),format.raw/*20.53*/("""size: image_size, file: movie.poster_path"""),format.raw/*20.94*/("""}"""),format.raw/*20.95*/("""));
                                
                        console.log(theMovieDb.common.getImage("""),format.raw/*22.64*/("""{"""),format.raw/*22.65*/("""size: image_size, file: movie.poster_path"""),format.raw/*22.106*/("""}"""),format.raw/*22.107*/("""));
                        console.log(movie.poster_path);
                    """),format.raw/*24.21*/("""}"""),format.raw/*24.22*/(""";
                
                    function errorCB(data) """),format.raw/*26.44*/("""{"""),format.raw/*26.45*/("""
                        """),format.raw/*27.25*/("""console.log("Error callback: " + data);
                    """),format.raw/*28.21*/("""}"""),format.raw/*28.22*/(""";
                </script>
                <br>
                    <p>"""),_display_(/*31.25*/movie/*31.30*/.name),format.raw/*31.35*/("""</p>
                <br>
            </div>
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""</div>
    </div>
""")))}),format.raw/*37.2*/("""
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
                  DATE: Wed Dec 16 22:39:31 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/recommended.scala.html
                  HASH: 4e17d4d5eff81eb9d1ac8c3bfa638586d5879bfb
                  MATRIX: 777->1|938->67|966->70|995->91|1034->93|1062->141|1093->146|1133->160|1147->166|1213->212|1256->282|1288->325|1324->335|1410->394|1455->423|1495->425|1536->438|1619->494|1633->499|1657->502|1800->617|1829->618|1863->625|1877->630|1905->637|1934->638|1963->639|2088->736|2117->737|2170->762|2332->897|2346->902|2370->905|2472->979|2501->980|2570->1021|2599->1022|2727->1122|2756->1123|2826->1164|2856->1165|2964->1245|2993->1246|3083->1308|3112->1309|3165->1334|3253->1394|3282->1395|3382->1468|3396->1473|3422->1478|3507->1532|3543->1541|3592->1560
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|37->6|39->8|41->10|41->10|41->10|42->11|43->12|43->12|43->12|45->14|45->14|45->14|45->14|45->14|45->14|45->14|47->16|47->16|48->17|50->19|50->19|50->19|51->20|51->20|51->20|51->20|53->22|53->22|53->22|53->22|55->24|55->24|57->26|57->26|58->27|59->28|59->28|62->31|62->31|62->31|65->34|66->35|68->37
                  -- GENERATED --
              */
          