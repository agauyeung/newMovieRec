
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Form[Search],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, searchForm: Form[Search]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.58*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, email)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""	"""),format.raw/*4.70*/("""

    """),format.raw/*6.35*/("""
    """),_display_(/*7.6*/form(action = routes.RecApplication.find(), 'id -> "searchForm")/*7.70*/ {_display_(Seq[Any](format.raw/*7.72*/("""
        
        """),_display_(/*9.10*/inputText(field = searchForm("text"), 'placeholder -> "Enter keyword:",
                                                '_label -> "Search Movie by Movie Title:"
        )),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""<input label="Enter Keyword(s) here:" type="submit" class="button" value="Search">
    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String,searchForm:Form[Search]): play.twirl.api.HtmlFormat.Appendable = apply(title,email,searchForm)

  def f:((String,String,Form[Search]) => play.twirl.api.HtmlFormat.Appendable) = (title,email,searchForm) => apply(title,email,searchForm)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 22:39:32 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/search.scala.html
                  HASH: 9d59ce6616501987dff9cf8729a008a8fade02bc
                  MATRIX: 767->1|933->57|960->75|987->77|1013->95|1052->97|1080->145|1113->181|1144->187|1216->251|1255->253|1300->272|1492->443|1528->452|1646->540|1678->542
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|41->11|42->12|43->13|44->14
                  -- GENERATED --
              */
          