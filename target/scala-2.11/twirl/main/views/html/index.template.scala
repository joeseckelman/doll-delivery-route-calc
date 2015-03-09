
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(output: String,syntaxtype: String,notHome: Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""


"""),_display_(/*4.2*/main("Welcome to Play heres a new message")/*4.45*/ {_display_(Seq[Any](format.raw/*4.47*/("""

	"""),_display_(/*6.3*/if(notHome == 1)/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
	"""),format.raw/*7.2*/("""<h1>Map Output From: """),_display_(/*7.24*/syntaxtype),format.raw/*7.34*/("""</h1>
	<pre>
    """),_display_(/*9.6*/output),format.raw/*9.12*/("""
    """),format.raw/*10.5*/("""</pre>
	""")))}/*11.4*/else/*11.9*/{_display_(Seq[Any](format.raw/*11.10*/("""
		"""),format.raw/*12.3*/("""<h1>Completely different title</h1>
		<p>add fun stuff here when delusionally tired in the morning</p>
	""")))}),format.raw/*14.3*/("""
""")))}),format.raw/*15.2*/("""
"""))}
  }

  def render(output:String,syntaxtype:String,notHome:Int): play.twirl.api.HtmlFormat.Appendable = apply(output,syntaxtype,notHome)

  def f:((String,String,Int) => play.twirl.api.HtmlFormat.Appendable) = (output,syntaxtype,notHome) => apply(output,syntaxtype,notHome)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 08 22:09:31 EDT 2015
                  SOURCE: /home/muffin/play-scala/app/views/index.scala.html
                  HASH: d85fd3fceccfc745888b94859298160e23569dcc
                  MATRIX: 516->1|652->49|681->53|732->96|771->98|800->102|824->118|862->119|890->121|938->143|968->153|1011->171|1037->177|1069->182|1096->192|1108->197|1147->198|1177->201|1312->306|1344->308
                  LINES: 19->1|22->1|25->4|25->4|25->4|27->6|27->6|27->6|28->7|28->7|28->7|30->9|30->9|31->10|32->11|32->11|32->11|33->12|35->14|36->15
                  -- GENERATED --
              */
          