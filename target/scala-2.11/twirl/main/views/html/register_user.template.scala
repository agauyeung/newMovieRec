
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_user_Scope0 {
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

class register_user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, regForm: Form[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""	"""),format.raw/*4.63*/("""

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
object register_user extends register_user_Scope0.register_user
              /*
                  -- GENERATED --
                  DATE: Tue Nov 24 22:28:29 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/newMovieRec/app/views/register_user.scala.html
                  HASH: 6b54c2bf6cf5f033b6df937c5dffd30abbefef99
                  MATRIX: 773->1|920->38|947->56|974->58|993->69|1032->71|1060->119|1093->161|1124->167|1199->234|1238->236|1283->255|1363->315|1400->325|1487->391|1524->401|1611->467|1647->476|1754->553|1787->556
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|40->10|41->11|41->11|42->12|44->14|46->16
                  -- GENERATED --
              */
          