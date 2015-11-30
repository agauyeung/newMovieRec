
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
        
        <script>
            JSON.parse(theMovieDb.movies.getImages("""),format.raw/*23.52*/("""{"""),format.raw/*23.53*/(""""id": """),_display_(/*23.60*/link/*23.64*/.tmdbID),format.raw/*23.71*/(""" """),format.raw/*23.72*/("""}"""),format.raw/*23.73*/(""", successCB, errorCB));
            
            function successCB(data) """),format.raw/*25.38*/("""{"""),format.raw/*25.39*/("""
                """),format.raw/*26.17*/("""console.log("Success callback: " + data);
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/(""";
        
            function errorCB(data) """),format.raw/*29.36*/("""{"""),format.raw/*29.37*/("""
                """),format.raw/*30.17*/("""console.log("Error callback: " + data);
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/(""";
         </script>
     </li>
    """)))}),format.raw/*34.6*/(""" 
    """),format.raw/*35.5*/("""</ul>
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
                  DATE: Mon Nov 30 01:24:26 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/view.scala.html
                  HASH: 4f912433f3c4a9839abf9eb51a5753bf926afae9
                  MATRIX: 775->1|943->74|971->77|997->95|1036->97|1067->102|1107->116|1121->122|1187->168|1271->227|1306->247|1345->249|1379->256|1411->261|1425->266|1451->271|1487->280|1533->299|1547->304|1580->316|1616->325|1669->348|1701->354|1735->372|1775->374|1809->381|1868->413|1881->417|1909->424|1945->433|2056->516|2085->517|2119->524|2132->528|2160->535|2189->536|2218->537|2320->611|2349->612|2394->629|2476->683|2505->684|2579->730|2608->731|2653->748|2733->800|2762->801|2829->838|2862->844
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|46->15|47->16|47->16|47->16|48->17|50->19|50->19|50->19|51->20|54->23|54->23|54->23|54->23|54->23|54->23|54->23|56->25|56->25|57->26|58->27|58->27|60->29|60->29|61->30|62->31|62->31|65->34|66->35
                  -- GENERATED --
              */
          