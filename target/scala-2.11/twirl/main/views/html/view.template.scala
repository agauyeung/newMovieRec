
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
    
    <h1>All Movies<h1>
    
    <ul>
    """),_display_(/*9.6*/for(movie <- movies) yield /*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
      """),format.raw/*10.7*/("""<li>"""),_display_(/*10.12*/movie/*10.17*/.name),format.raw/*10.22*/("""
        """),format.raw/*11.9*/("""<ul> 
            """),_display_(/*12.14*/movie/*12.19*/.genres),format.raw/*12.26*/("""
        """),format.raw/*13.9*/("""</ul>
        <ul> 
            """),_display_(/*15.14*/movie/*15.19*/.imdbid),format.raw/*15.26*/("""
        """),format.raw/*16.9*/("""</ul>
        <ul> 
            """),_display_(/*18.14*/movie/*18.19*/.tmdbid),format.raw/*18.26*/("""
        """),format.raw/*19.9*/("""</ul>
        <div>
            <img id="poster" src="">
                
            </img>
            
            <script>
                movie = theMovieDb.movies.getById("""),format.raw/*26.51*/("""{"""),format.raw/*26.52*/(""""id": """),_display_(/*26.59*/movie/*26.64*/.tmdbid),format.raw/*26.71*/(""" """),format.raw/*26.72*/("""}"""),format.raw/*26.73*/(""", successCB, errorCB);
                
                function successCB(data) """),format.raw/*28.42*/("""{"""),format.raw/*28.43*/("""
                    """),format.raw/*29.21*/("""image_size = "w500";
                    var movie = JSON.parse(data);
                    document.getElementById("poster").setAttribute("src", 
                    theMovieDb.common.getImage("""),format.raw/*32.48*/("""{"""),format.raw/*32.49*/("""size: image_size, file: movie.poster_path"""),format.raw/*32.90*/("""}"""),format.raw/*32.91*/("""));
                    
                    console.log(theMovieDb.common.getImage("""),format.raw/*34.60*/("""{"""),format.raw/*34.61*/("""size: image_size, file: movie.poster_path"""),format.raw/*34.102*/("""}"""),format.raw/*34.103*/("""));
                    console.log(movie.poster_path);
                """),format.raw/*36.17*/("""}"""),format.raw/*36.18*/(""";
    
                function errorCB(data) """),format.raw/*38.40*/("""{"""),format.raw/*38.41*/("""
                    """),format.raw/*39.21*/("""console.log("Error callback: " + data);
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/(""";
             </script>
         </div>
      </li>
    """)))}),format.raw/*44.6*/("""
    """),format.raw/*45.5*/("""</ul>
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
                  DATE: Mon Nov 30 22:46:20 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/view.scala.html
                  HASH: ac97f59a8ab429aad2d06385fa74cd6f78649e3e
                  MATRIX: 763->1|910->53|938->56|964->74|1003->76|1034->81|1074->95|1088->101|1154->147|1238->206|1273->226|1312->228|1346->235|1378->240|1392->245|1418->250|1454->259|1500->278|1514->283|1542->290|1578->299|1638->332|1652->337|1680->344|1716->353|1776->386|1790->391|1818->398|1854->407|2059->584|2088->585|2122->592|2136->597|2164->604|2193->605|2222->606|2331->687|2360->688|2409->709|2630->902|2659->903|2728->944|2757->945|2869->1029|2898->1030|2968->1071|2998->1072|3098->1144|3127->1145|3201->1191|3230->1192|3279->1213|3363->1269|3392->1270|3480->1328|3512->1333
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|46->15|46->15|46->15|47->16|49->18|49->18|49->18|50->19|57->26|57->26|57->26|57->26|57->26|57->26|57->26|59->28|59->28|60->29|63->32|63->32|63->32|63->32|65->34|65->34|65->34|65->34|67->36|67->36|69->38|69->38|70->39|71->40|71->40|75->44|76->45
                  -- GENERATED --
              */
          