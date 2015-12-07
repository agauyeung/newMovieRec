
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Search],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, searchForm: Form[Search]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, "")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""	"""),format.raw/*4.67*/("""

    """),format.raw/*6.35*/("""
    """),_display_(/*7.6*/form(action = routes.RecApplication.find(), 'id -> "searchForm")/*7.70*/ {_display_(Seq[Any](format.raw/*7.72*/("""
        
        """),_display_(/*9.10*/inputText(field = searchForm("text"), 'placeholder -> "Movie Name to Search")),format.raw/*9.87*/("""
        """),format.raw/*10.9*/("""<input type="submit" class="button" value="Search">
    """)))}),format.raw/*11.6*/("""
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(title:String,searchForm:Form[Search]): play.twirl.api.HtmlFormat.Appendable = apply(title,searchForm)

  def f:((String,Form[Search]) => play.twirl.api.HtmlFormat.Appendable) = (title,searchForm) => apply(title,searchForm)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Sun Dec 06 17:11:31 PST 2015
                  SOURCE: /Users/alphaneo1/login/app/views/search.scala.html
                  HASH: 1a23dccdfe1e1f468ff432042f2cfb3bd46ec7a1
                  MATRIX: 760->1|911->42|938->60|965->62|988->77|1027->79|1055->127|1088->163|1119->169|1191->233|1230->235|1275->254|1372->331|1408->340|1495->397|1527->399
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|41->11|42->12
                  -- GENERATED --
              */
          