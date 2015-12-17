
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email: String, users: List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""

"""),_display_(/*3.2*/base(title, email)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.65*/("""

    """),format.raw/*6.5*/("""<h1>All Users<h1>
    
    <ul> 
    """),_display_(/*9.6*/for(users <- users) yield /*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
    """),format.raw/*10.5*/("""<div>
      <p>"""),_display_(/*11.11*/users/*11.16*/.userID),format.raw/*11.23*/("""</->
      <p>"""),_display_(/*12.11*/users/*12.16*/.username),format.raw/*12.25*/("""</->
      <li>"""),_display_(/*13.12*/users/*13.17*/.email),format.raw/*13.23*/("""
        """),format.raw/*14.9*/("""<ul>
            """),_display_(/*15.14*/users/*15.19*/.password),format.raw/*15.28*/("""
        """),format.raw/*16.9*/("""</ul>
      </li>
      </->
    """)))}),format.raw/*19.6*/("""
    """),format.raw/*20.5*/("""</ul>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(title:String,email:String,users:List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(title,email,users)

  def f:((String,String,List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (title,email,users) => apply(title,email,users)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 22:39:31 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/users.scala.html
                  HASH: 696fd48bc2db9fe06cf7781d7b9f257ddaa1a809
                  MATRIX: 764->1|909->51|937->54|963->72|1002->74|1034->139|1066->145|1129->183|1163->202|1202->204|1234->209|1277->225|1291->230|1319->237|1361->252|1375->257|1405->266|1448->282|1462->287|1489->293|1525->302|1570->320|1584->325|1614->334|1650->343|1714->377|1746->382|1783->389
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|50->19|51->20|52->21
                  -- GENERATED --
              */
          