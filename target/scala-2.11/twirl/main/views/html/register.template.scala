
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
        
        """),_display_(/*9.10*/inputText(field = regForm("email"), 'placeholder -> "Email",
        '_label -> "Email")),format.raw/*10.28*/("""
        """),_display_(/*11.10*/inputText(field = regForm("username"), 'placeholder -> "Username",
        '_label -> "Username")),format.raw/*12.31*/("""
        """),_display_(/*13.10*/inputPassword(field = regForm("password"), 'placeholder -> "Password",
        '_label -> "Password")),format.raw/*14.31*/("""
        """),format.raw/*15.9*/("""<input type="submit" class="tenratings" value="Register Now">         

    """)))}),format.raw/*17.6*/("""

""")))}),format.raw/*19.2*/("""
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
                  DATE: Wed Dec 16 22:39:31 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/register.scala.html
                  HASH: 13691f9cfcc293c97ac9bf6d5dc8c34d959d4a44
                  MATRIX: 763->1|910->38|937->56|964->58|987->73|1026->75|1054->123|1087->165|1118->171|1193->238|1232->240|1277->259|1386->347|1423->357|1541->454|1578->464|1700->565|1736->574|1843->651|1876->654
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|40->10|41->11|42->12|43->13|44->14|45->15|47->17|49->19
                  -- GENERATED --
              */
          