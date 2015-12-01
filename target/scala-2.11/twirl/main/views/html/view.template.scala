
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

class view extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,List[Movies],List[Links],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, movies: List[Movies], links : List[Links]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.versioned("javascripts/themoviedb.js")),format.raw/*4.71*/(""""></script>
    
    <h1>All Movies<h1>
    
    <ul>
    """),_display_(/*9.6*/for(movie <- movies) yield /*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
      """),format.raw/*10.7*/("""<li>"""),_display_(/*10.12*/movie/*10.17*/.name),format.raw/*10.22*/("""
        """),format.raw/*11.9*/("""<ul> 
            """),_display_(/*12.14*/movie/*12.19*/.description),format.raw/*12.31*/("""
        """),format.raw/*13.9*/("""</ul>
      </li>
    """)))}),format.raw/*15.6*/("""
    """),_display_(/*16.6*/for(link <- links) yield /*16.24*/ {_display_(Seq[Any](format.raw/*16.26*/("""
      """),format.raw/*17.7*/("""<li>
        <ul> 
            """),_display_(/*19.14*/link/*19.18*/.tmdbID),format.raw/*19.25*/("""
        """),format.raw/*20.9*/("""</ul>
        <img id="poster" src="">
            
        </img>
        
        <script>
            //var movie = theMovieDb.movies.getById("""),format.raw/*26.53*/("""{"""),format.raw/*26.54*/(""""id": """),_display_(/*26.61*/link/*26.65*/.tmdbID),format.raw/*26.72*/(""" """),format.raw/*26.73*/("""}"""),format.raw/*26.74*/(""", successCB, errorCB);
            //data = JSON.parse(movie);
            
            movie = theMovieDb.movies.getById("""),format.raw/*29.47*/("""{"""),format.raw/*29.48*/(""""id": """),_display_(/*29.55*/link/*29.59*/.tmdbID),format.raw/*29.66*/(""" """),format.raw/*29.67*/("""}"""),format.raw/*29.68*/(""", successCB, errorCB);
            
            function successCB(data) """),format.raw/*31.38*/("""{"""),format.raw/*31.39*/("""
                """),format.raw/*32.17*/("""image_size = "w500";
                var movie = JSON.parse(data);
                document.getElementById("poster").setAttribute("src", 
                theMovieDb.common.getImage("""),format.raw/*35.44*/("""{"""),format.raw/*35.45*/("""size: image_size, file: movie.poster_path"""),format.raw/*35.86*/("""}"""),format.raw/*35.87*/("""));
                
                console.log(theMovieDb.common.getImage("""),format.raw/*37.56*/("""{"""),format.raw/*37.57*/("""size: image_size, file: movie.poster_path"""),format.raw/*37.98*/("""}"""),format.raw/*37.99*/("""));
                console.log(movie.poster_path);
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/(""";
            
            

            function errorCB(data) """),format.raw/*43.36*/("""{"""),format.raw/*43.37*/("""
                """),format.raw/*44.17*/("""console.log("Error callback: " + data);
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/(""";
         </script>
     </li>
    """)))}),format.raw/*48.6*/(""" 
    """),format.raw/*49.5*/("""</ul>
""")))}))
      }
    }
  }

  def render(title:String,email:String,movies:List[Movies],links:List[Links]): play.twirl.api.HtmlFormat.Appendable = apply(title,email,movies,links)

  def f:((String,String,List[Movies],List[Links]) => play.twirl.api.HtmlFormat.Appendable) = (title,email,movies,links) => apply(title,email,movies,links)

  def ref: this.type = this

}


}

/**/
object view extends view_Scope0.view
              /*
                  -- GENERATED --
                  DATE: Mon Nov 30 22:07:57 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/view.scala.html
                  HASH: e28375ed06e1515e2bb85fe52488a5e83accebc3
                  MATRIX: 775->1|943->74|971->77|997->95|1036->97|1067->102|1107->116|1121->122|1187->168|1271->227|1306->247|1345->249|1379->256|1411->261|1425->266|1451->271|1487->280|1533->299|1547->304|1580->316|1616->325|1669->348|1701->354|1735->372|1775->374|1809->381|1868->413|1881->417|1909->424|1945->433|2118->578|2147->579|2181->586|2194->590|2222->597|2251->598|2280->599|2430->721|2459->722|2493->729|2506->733|2534->740|2563->741|2592->742|2693->815|2722->816|2767->833|2976->1014|3005->1015|3074->1056|3103->1057|3207->1133|3236->1134|3305->1175|3334->1176|3426->1240|3455->1241|3547->1305|3576->1306|3621->1323|3701->1375|3730->1376|3797->1413|3830->1419
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|51->20|57->26|57->26|57->26|57->26|57->26|57->26|57->26|60->29|60->29|60->29|60->29|60->29|60->29|60->29|62->31|62->31|63->32|66->35|66->35|66->35|66->35|68->37|68->37|68->37|68->37|70->39|70->39|74->43|74->43|75->44|76->45|76->45|79->48|80->49
                  -- GENERATED --
              */
          