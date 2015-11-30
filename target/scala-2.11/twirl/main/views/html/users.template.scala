
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
    """),format.raw/*4.5*/("""<h1>All Users<h1>
    
    <ul> 
    """),_display_(/*7.6*/for(users <- users) yield /*7.25*/ {_display_(Seq[Any](format.raw/*7.27*/("""
    """),format.raw/*8.5*/("""<div>
      <p>"""),_display_(/*9.11*/users/*9.16*/.userID),format.raw/*9.23*/("""</->
      <p>"""),_display_(/*10.11*/users/*10.16*/.username),format.raw/*10.25*/("""</->
      <li>"""),_display_(/*11.12*/users/*11.17*/.email),format.raw/*11.23*/("""
        """),format.raw/*12.9*/("""<ul>
            """),_display_(/*13.14*/users/*13.19*/.password),format.raw/*13.28*/("""
        """),format.raw/*14.9*/("""</ul>
      </li>
      </->
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""</ul>
""")))}),format.raw/*19.2*/("""
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
                  DATE: Sun Nov 29 22:36:55 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/users.scala.html
                  HASH: a54784a2fe9faa9fcd978c03865825aa667165cf
                  MATRIX: 764->1|909->51|937->54|963->72|1002->74|1033->79|1096->117|1130->136|1169->138|1200->143|1242->159|1255->164|1282->171|1324->186|1338->191|1368->200|1411->216|1425->221|1452->227|1488->236|1533->254|1547->259|1577->268|1613->277|1677->311|1709->316|1746->323
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|48->17|49->18|50->19
                  -- GENERATED --
              */
          