
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
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/themoviedb.js")),format.raw/*4.71*/(""""></script>
    
    <h1>Movies<h1>
    
    <div class="container">
        <div class="row">
        """),_display_(/*10.10*/for(movie <- movies) yield /*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
            """),format.raw/*11.13*/("""<div class="col-xs-4">
                <img id="poster"""),_display_(/*12.33*/movie/*12.38*/.id),format.raw/*12.41*/("""" src="" class = "thumbnail">
                
                </img>
                
                <script>
                    movie = theMovieDb.movies.getById("""),format.raw/*17.55*/("""{"""),format.raw/*17.56*/(""""id": """),_display_(/*17.63*/movie/*17.68*/.tmdbid),format.raw/*17.75*/(""" """),format.raw/*17.76*/("""}"""),format.raw/*17.77*/(""", successCB, errorCB);
                    
                    function successCB(data) """),format.raw/*19.46*/("""{"""),format.raw/*19.47*/("""
                        """),format.raw/*20.25*/("""image_size = "w500";
                        var movie = JSON.parse(data);
                        document.getElementById("poster" + """),_display_(/*22.61*/movie/*22.66*/.id),format.raw/*22.69*/(""").setAttribute("src", 
                        theMovieDb.common.getImage("""),format.raw/*23.52*/("""{"""),format.raw/*23.53*/("""size: image_size, file: movie.poster_path"""),format.raw/*23.94*/("""}"""),format.raw/*23.95*/("""));
                        
                        console.log(theMovieDb.common.getImage("""),format.raw/*25.64*/("""{"""),format.raw/*25.65*/("""size: image_size, file: movie.poster_path"""),format.raw/*25.106*/("""}"""),format.raw/*25.107*/("""));
                        console.log(movie.poster_path);
                    """),format.raw/*27.21*/("""}"""),format.raw/*27.22*/(""";
            
                    function errorCB(data) """),format.raw/*29.44*/("""{"""),format.raw/*29.45*/("""
                        """),format.raw/*30.25*/("""console.log("Error callback: " + data);
                    """),format.raw/*31.21*/("""}"""),format.raw/*31.22*/(""";
                 </script>
             </div>
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""</div>
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
                  DATE: Sun Dec 06 18:37:01 PST 2015
                  SOURCE: /Users/alphaneo1/login/app/views/view.scala.html
                  HASH: a3f79bc5869445470a9483e286503c6941036674
                  MATRIX: 763->1|910->53|938->56|964->74|1003->76|1034->81|1074->95|1088->101|1154->147|1285->251|1321->271|1361->273|1402->286|1484->341|1498->346|1522->349|1716->515|1745->516|1779->523|1793->528|1821->535|1850->536|1879->537|1996->626|2025->627|2078->652|2240->787|2254->792|2278->795|2380->869|2409->870|2478->911|2507->912|2627->1004|2656->1005|2726->1046|2756->1047|2864->1127|2893->1128|2979->1186|3008->1187|3061->1212|3149->1272|3178->1273|3267->1331|3303->1340
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|41->10|41->10|41->10|42->11|43->12|43->12|43->12|48->17|48->17|48->17|48->17|48->17|48->17|48->17|50->19|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|54->23|56->25|56->25|56->25|56->25|58->27|58->27|60->29|60->29|61->30|62->31|62->31|65->34|66->35
                  -- GENERATED --
              */
          