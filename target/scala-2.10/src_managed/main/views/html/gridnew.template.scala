
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object gridnew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="nested-container">
         <div class="page-banners">
                         <div class="grid12-4 ">
                         <a title="Varun Bahl" href=# itemprop="itemListElement"> 
                         <img src=""""),_display_(Seq[Any](/*5.37*/routes/*5.43*/.Assets.at("images/homepage/1.jpg"))),format.raw/*5.78*/(""""  alt="" itemprop="image"></a>
                         </div>
                          <div class="grid12-8 ">
                          <a title="Manish Arora" href=# itemprop="itemListElement">
                          <img src=src=""""),_display_(Seq[Any](/*9.42*/routes/*9.48*/.Assets.at("images/homepage/2.jpg"))),format.raw/*9.83*/("""" alt="" itemprop="image"></a>
                          </div>
                      </div>
  </div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 21 20:24:57 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/gridnew.scala.html
                    HASH: 70998058a106230d5fee32c6602947d963d770d7
                    MATRIX: 857->0|1127->235|1141->241|1197->276|1472->516|1486->522|1542->557
                    LINES: 29->1|33->5|33->5|33->5|37->9|37->9|37->9
                    -- GENERATED --
                */
            