
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
object mapDistance extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mapfile: String)(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Map Distance")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
   """),format.raw/*4.4*/("""<h1>testing output</h1>
""")))}))}
  }

  def render(mapfile:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(mapfile)(message)

  def f:((String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (mapfile) => (message) => apply(mapfile)(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Mar 08 17:30:28 EDT 2015
                  SOURCE: /home/muffin/play-scala/app/views/mapDistance.scala.html
                  HASH: b606e5c2e19ee7d8281b3ee491afa841d4a448e9
                  MATRIX: 518->1|640->35|668->38|696->58|735->60|765->64
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4
                  -- GENERATED --
              */
          