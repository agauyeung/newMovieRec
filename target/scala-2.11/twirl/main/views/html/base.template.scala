
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email : String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>"""),_display_(/*11.17*/title),format.raw/*11.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.98*/("""">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*14.93*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("stylesheets/animate.css")),format.raw/*15.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.86*/("""">

        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="public/images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(/*23.73*/routes/*23.79*/.Assets.versioned("images/ico/apple-touch-icon-144-precomposed.png")),format.raw/*23.147*/("""">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(/*24.73*/routes/*24.79*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*24.147*/("""">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href=""""),_display_(/*25.71*/routes/*25.77*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*25.144*/("""">
        <link rel="apple-touch-icon-precomposed" href=""""),_display_(/*26.57*/routes/*26.63*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*26.130*/("""">
    </head><!--/head-->
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="view"><img src=""""),_display_(/*38.68*/routes/*38.74*/.Assets.versioned("images/logo.png")),format.raw/*38.110*/("""" alt="logo"></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*42.26*/if(email != "")/*42.41*/{_display_(Seq[Any](format.raw/*42.42*/("""
                            """),format.raw/*43.29*/("""<font color="white">
                                <li>Welcome """),_display_(/*44.46*/email),format.raw/*44.51*/("""!</li>
                            </font>
                        """)))}),format.raw/*46.26*/("""
                        """),format.raw/*47.25*/("""<li><a href="view">View Movies</a></li>
                        <li><a href="users">View Users</a></li>
                        """),_display_(/*49.26*/if(email != "")/*49.41*/{_display_(Seq[Any](format.raw/*49.42*/("""
                          """),format.raw/*50.27*/("""<li><a href="recommended">Recommended For You</a></li>
                          <li><a href="rate">Rate Movies</a></li>
                          <li><a href="history">Rating History</a></li>
                          <li><a href="logout">Logout</a></li>
                        """)))}/*54.27*/else/*54.31*/{_display_(Seq[Any](format.raw/*54.32*/("""
                          """),format.raw/*55.27*/("""<li><a href="login">Login</a></li>
                          <li><a href="register">Register</a></li>
                        """)))}),format.raw/*57.26*/("""
                    """),format.raw/*58.21*/("""</ul>
                </div>
            </div>
        </header>
        <div id="theContent" class = "main-body">
        """),_display_(/*63.10*/content),format.raw/*63.17*/("""
        """),format.raw/*64.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,email:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,email)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,email) => (content) => apply(title,email)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Thu Dec 03 01:57:04 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/base.scala.html
                  HASH: 616e71c455b641a1a7a4dadea3c700c0ef0ffc87
                  MATRIX: 755->1|896->47|924->49|1207->305|1233->310|1307->357|1322->363|1393->413|1461->454|1476->460|1550->513|1618->554|1633->560|1702->608|1770->649|1785->655|1850->699|1918->740|1933->746|1995->787|2322->1087|2337->1093|2427->1161|2529->1236|2544->1242|2634->1310|2734->1383|2749->1389|2838->1456|2924->1515|2939->1521|3028->1588|3715->2248|3730->2254|3788->2290|3997->2472|4021->2487|4060->2488|4117->2517|4210->2583|4236->2588|4335->2656|4388->2681|4544->2810|4568->2825|4607->2826|4662->2853|4962->3135|4975->3139|5014->3140|5069->3167|5227->3294|5276->3315|5428->3440|5456->3447|5492->3456
                  LINES: 27->1|32->1|34->3|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|69->38|69->38|69->38|73->42|73->42|73->42|74->43|75->44|75->44|77->46|78->47|80->49|80->49|80->49|81->50|85->54|85->54|85->54|86->55|88->57|89->58|94->63|94->63|95->64
                  -- GENERATED --
              */
          