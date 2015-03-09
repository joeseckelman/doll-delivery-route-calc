
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object testPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Test page title here")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""

    """),format.raw/*5.5*/("""<h2>Copy Any past Map Details below:</h2>
    <form action=""""),_display_(/*6.20*/routes/*6.26*/.Application.formprocessing()),format.raw/*6.55*/("""" method="post">
    	<textarea placeholder="Map Coordintes" name="maptext"></textarea><br />
    	<input type="submit" class="btn bt-primary" value="Submit" />
    </form>

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 08 20:33:23 EDT 2015
                  SOURCE: /home/muffin/play-scala/app/views/testPage.scala.html
                  HASH: c7de1a9d88460149fa6afe4822cff68d77e59903
                  MATRIX: 508->1|613->18|641->21|677->49|716->51|748->57|835->118|849->124|898->153
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|27->6|27->6|27->6
                  -- GENERATED --
              */
          