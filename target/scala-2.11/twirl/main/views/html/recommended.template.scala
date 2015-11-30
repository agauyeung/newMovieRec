
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

class recommended extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, recommendations: List[String] , username : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.68*/("""

"""),_display_(/*3.2*/base(title, username)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""	"""),format.raw/*3.73*/("""
    """),format.raw/*4.43*/("""
    
    """),_display_(/*6.6*/for(recommendation <- recommendations) yield /*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
        """),_display_(/*7.10*/recommendation),format.raw/*7.24*/("""  
        """),format.raw/*8.9*/("""<br>
        <br>
    """)))}),format.raw/*10.6*/("""
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(title:String,recommendations:List[String],username:String): play.twirl.api.HtmlFormat.Appendable = apply(title,recommendations,username)

  def f:((String,List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (title,recommendations,username) => apply(title,recommendations,username)

  def ref: this.type = this

}


}

/**/
object recommended extends recommended_Scope0.recommended
              /*
                  -- GENERATED --
                  DATE: Sun Nov 29 22:36:55 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/recommended.scala.html
                  HASH: 765a1a069b4551e803681dfa5cec62665427ede9
                  MATRIX: 777->1|938->67|966->70|995->91|1034->93|1062->141|1094->184|1130->195|1183->233|1222->235|1258->245|1292->259|1329->270|1382->293|1414->295
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|38->7|39->8|41->10|42->11
                  -- GENERATED --
              */
          