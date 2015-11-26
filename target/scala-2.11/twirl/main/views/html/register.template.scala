
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, regForm: Form[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, "")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""	"""),format.raw/*4.67*/("""

    """),format.raw/*6.41*/("""
    """),_display_(/*7.6*/form(action = routes.RecApplication.registered(), 'id -> "regForm")/*7.73*/ {_display_(Seq[Any](format.raw/*7.75*/("""
        
        """),_display_(/*9.10*/inputText(field = regForm("email"), 'placeholder -> "email")),format.raw/*9.70*/("""
        """),_display_(/*10.10*/inputText(field = regForm("username"), 'placeholder -> "username")),format.raw/*10.76*/("""
        """),_display_(/*11.10*/inputText(field = regForm("password"), 'placeholder -> "password")),format.raw/*11.76*/("""
        """),format.raw/*12.9*/("""<input type="submit" class="tenratings" value="Register Now">         

    """)))}),format.raw/*14.6*/("""

""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(title:String,regForm:Form[Users]): play.twirl.api.HtmlFormat.Appendable = apply(title,regForm)

  def f:((String,Form[Users]) => play.twirl.api.HtmlFormat.Appendable) = (title,regForm) => apply(title,regForm)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Thu Nov 26 05:13:28 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/register.scala.html
                  HASH: 3612d7c79048262d5a5c0f218be40b4a97765c57
                  MATRIX: 763->1|910->38|937->56|964->58|987->73|1026->75|1054->123|1087->165|1118->171|1193->238|1232->240|1277->259|1357->319|1394->329|1481->395|1518->405|1605->471|1641->480|1748->557|1781->560
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|40->10|41->11|41->11|42->12|44->14|46->16
                  -- GENERATED --
              */
          