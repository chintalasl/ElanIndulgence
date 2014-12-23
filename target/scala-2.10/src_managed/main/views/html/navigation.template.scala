
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
object navigation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div style="margin:0">
		<nav class="navbar" role="navigation" style="background-color: #6D9BC3;border-radius: 0px;font-size:12px">
			<div class="container-fluid">
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav">
		        		<li><a href="#" style="color:white" class="maindrop">NEW ARRIVALS</a></li>
				        <li class="dropdown">
				          <a href="#" class="dropdown-toggle maindrop" data-toggle="dropdown" role="button" aria-expanded="false" style="color:white">WOMEN<span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">
				            <li><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">ETHNIC</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">SAREE</a></li>
				            <li><a href="#" style="font-size: 10px;">LEHENGAS</a></li>
				            <li><a href="#" style="font-size: 10px;">KURTIS</a></li>
				            <li><a href="#" style="font-size: 10px;">SALWAR KAMEEZ</a></li>
				            <li style="padding-top:20px"><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">WESTERN</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">DRESSES</a></li>
				            <li style="padding-top:20px"><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">ACCESSORIES</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">JEWELLERY</a></li>
				            <li><a href="#" style="font-size: 10px;">BAGS</a></li>
				            <li><a href="#" style="font-size: 10px;">FOOTWEAR</a></li>
				            <li><a href="#" style="font-size: 10px;">SCARVES</a></li>
				          </ul>
				        </li>
				        <li class="dropdown">
				          <a href="#" class="dropdown-toggle maindrop" data-toggle="dropdown" role="button" aria-expanded="false" style="color:white">MEN<span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">
				            <li><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">ETHNIC</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">SHERWANI</a></li>
				            <li><a href="#" style="font-size: 10px;">KURTAS</a></li>
				            <li style="padding-top:20px"><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">WESTERN</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">SUITS</a></li>
				          </ul>
				        </li>
				        <li class="dropdown">
				          <a href="#" class="dropdown-toggle maindrop" data-toggle="dropdown" role="button" aria-expanded="false" style="color:white">KIDS<span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">
				            <li><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">GIRLS</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">ETHNIC</a></li>
				            <li><a href="#" style="font-size: 10px;">FROCKS</a></li>
				            <li style="padding-top:20px"><a href="#" style="font-weight: bold;font-size: 12px;color: #6D9BC3">BOYS</a></li>
				            <li class="divider"></li>
				            <li><a href="#" style="font-size: 10px;">ETHNIC</a></li>
				          </ul>
				        </li>
		      		</ul>
		    	</div>
			</div>
		</nav>
	</div>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 21 20:24:57 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/navigation.scala.html
                    HASH: 6a128e0e81954f5a9a1d5b5061fbdfb728423e70
                    MATRIX: 860->0
                    LINES: 29->1
                    -- GENERATED --
                */
            