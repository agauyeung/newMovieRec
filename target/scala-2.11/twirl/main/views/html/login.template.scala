
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, "")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""	"""),format.raw/*4.67*/("""

    """),format.raw/*6.41*/("""
    """),_display_(/*7.6*/form(action = routes.RecApplication.authenticate(), 'id -> "loginForm")/*7.77*/ {_display_(Seq[Any](format.raw/*7.79*/("""
        
        """),_display_(/*9.10*/inputText(field = loginForm("email"), 'placeholder -> "email")),format.raw/*9.72*/("""
        """),_display_(/*10.10*/inputPassword(field = loginForm("password"), 'placeholder -> "password")),format.raw/*10.82*/("""
        """),format.raw/*11.9*/("""<input type="submit" class="login" value="Login">         

    """)))}),format.raw/*13.6*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(title:String,loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(title,loginForm)

  def f:((String,Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (title,loginForm) => apply(title,loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Dec 06 17:00:56 PST 2015
                  SOURCE: /Users/alphaneo1/login/app/views/login.scala.html
                  HASH: 5c0a18d53924320920783f942263d6a1257a5406
                  MATRIX: 757->1|906->40|933->58|960->60|983->75|1022->77|1050->125|1083->167|1114->173|1193->244|1232->246|1277->265|1359->327|1396->337|1489->409|1525->418|1620->483|1652->485
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|40->10|41->11|43->13|44->14
                  -- GENERATED --
              */
          