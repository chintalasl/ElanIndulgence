
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
object simpleslider extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript" src=""""),_display_(Seq[Any](/*1.38*/routes/*1.44*/.Assets.at("javascripts/slider/jquery-1.9.1.min.js"))),format.raw/*1.96*/(""""></script>
    <!-- use jssor.slider.mini.js (40KB) instead for release -->
    <!-- jssor.slider.mini.js = (jssor.js + jssor.slider.js) -->
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*4.42*/routes/*4.48*/.Assets.at("javascripts/slider/jssor.js"))),format.raw/*4.89*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*5.42*/routes/*5.48*/.Assets.at("javascripts/slider/jssor.slider.js"))),format.raw/*5.96*/(""""></script>
    <script>

        jQuery(document).ready(function ($) """),format.raw/*8.45*/("""{"""),format.raw/*8.46*/("""

            var _SlideshowTransitions = [
            //Fade
            """),format.raw/*12.13*/("""{"""),format.raw/*12.14*/(""" $Duration: 1200, $Opacity: 2 """),format.raw/*12.44*/("""}"""),format.raw/*12.45*/("""
            ];

            var options = """),format.raw/*15.27*/("""{"""),format.raw/*15.28*/("""
                $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
                $AutoPlaySteps: 1,                                  //[Optional] Steps to go for each navigation request (this options applys only when slideshow disabled), the default value is 1
                $AutoPlayInterval: 3000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
                $PauseOnHover: 1,                               //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

                $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
                $SlideDuration: 500,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container
                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
                $SlideSpacing: 0, 					                //[Optional] Space between each slide in pixels, default value is 0
                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
                $DragOrientation: 3,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

                $SlideshowOptions: """),format.raw/*33.36*/("""{"""),format.raw/*33.37*/("""                                //[Optional] Options to specify and enable slideshow or not
                    $Class: $JssorSlideshowRunner$,                 //[Required] Class to create instance of slideshow
                    $Transitions: _SlideshowTransitions,            //[Required] An array of slideshow transitions to play slideshow
                    $TransitionsOrder: 1,                           //[Optional] The way to choose transition to play slide, 1 Sequence, 0 Random
                    $ShowLink: true                                    //[Optional] Whether to bring slide link on top of the slider when slideshow is running, default value is false
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/(""",

                $BulletNavigatorOptions: """),format.raw/*40.42*/("""{"""),format.raw/*40.43*/("""                                //[Optional] Options to specify and enable navigator or not
                    $Class: $JssorBulletNavigator$,                       //[Required] Class to create navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 1,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
                    $SpacingX: 10,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
                    $SpacingY: 10,                                   //[Optional] Vertical space between each item in pixel, default value is 0
                    $Orientation: 1                                 //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/(""",

                $ArrowNavigatorOptions: """),format.raw/*51.41*/("""{"""),format.raw/*51.42*/("""
                    $Class: $JssorArrowNavigator$,              //[Requried] Class to create arrow navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $Steps: 1                                       //[Optional] Steps to go for each navigation request, default value is 1
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/("""
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/(""";
            var jssor_slider1 = new $JssorSlider$("slider1_container", options);

            //responsive code begin
            //you can remove responsive code if you don't want the slider scales while window resizes
            function ScaleSlider() """),format.raw/*61.36*/("""{"""),format.raw/*61.37*/("""
                var parentWidth = jssor_slider1.$Elmt.parentNode.clientWidth;
                if (parentWidth)
                    jssor_slider1.$ScaleWidth(Math.min(parentWidth, 600));
                else
                    window.setTimeout(ScaleSlider, 30);
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
            ScaleSlider();

            $(window).bind("load", ScaleSlider);
            $(window).bind("resize", ScaleSlider);
            $(window).bind("orientationchange", ScaleSlider);
            //responsive code end
        """),format.raw/*74.9*/("""}"""),format.raw/*74.10*/(""");
    </script>
	<div id="slider1_container" style="display: block; position: relative; margin: 0px auto; top: 0px; left: 0px; width: 1286px; height: 494.61538461538464px; overflow: hidden;">
            	<div style="position: absolute; top: 0px; left: 0px; width: 1300px; height: 500px; -webkit-transform-origin: 0px 0px; -webkit-transform: scale(0.9892307692307692);"><div class="" style="position: relative; margin: 0px auto; top: 0px; left: 0px; width: 1300px; height: 500px; overflow: visible;">
            	<div u="loading" style="position: absolute; top: 0px; left: 0px; width: 1300px; height: 500px; display: none;">
                	<div style="filter: alpha(opacity=70); opacity: 0.7; position: absolute; display: block; top: 0px; left: 0px; width: 100%; height: 100%;">
                   </div>
                <div style="position: absolute; display: block; background: url(../img/loading.gif) no-repeat center center;
                top: 0px; left: 0px; width: 100%; height: 100%;">
                </div>
            </div>
            <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 1300px; height: 500px; overflow: hidden; z-index: 0;">
                 <div>
                <img u="image" src=""""),_display_(Seq[Any](/*87.38*/routes/*87.44*/.Assets.at("images/img/1920/red.jpg"))),format.raw/*87.81*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*90.38*/routes/*90.44*/.Assets.at("images/homeslider/11.jpg"))),format.raw/*90.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*93.38*/routes/*93.44*/.Assets.at("images/homeslider/12.jpg"))),format.raw/*93.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*96.38*/routes/*96.44*/.Assets.at("images/homeslider/13.jpg"))),format.raw/*96.82*/("""" />
            </div>
                </div>
                
          <!-- Bullet Navigator Skin Begin -->
        <style>
            /* jssor slider bullet navigator skin 05 css */
            /*
            .jssorb05 div           (normal)
            .jssorb05 div:hover     (normal mouseover)
            .jssorb05 .av           (active)
            .jssorb05 .av:hover     (active mouseover)
            .jssorb05 .dn           (mousedown)
            */
            .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av """),format.raw/*110.63*/("""{"""),format.raw/*110.64*/("""
                background: url("""),_display_(Seq[Any](/*111.34*/routes/*111.40*/.Assets.at("images/testSlider/b05.png"))),format.raw/*111.79*/(""") no-repeat;
                overflow: hidden;
                cursor: pointer;
            """),format.raw/*114.13*/("""}"""),format.raw/*114.14*/("""

            .jssorb05 div """),format.raw/*116.27*/("""{"""),format.raw/*116.28*/("""
                background-position: -7px -7px;
            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/("""

                .jssorb05 div:hover, .jssorb05 .av:hover """),format.raw/*120.58*/("""{"""),format.raw/*120.59*/("""
                    background-position: -37px -7px;
                """),format.raw/*122.17*/("""}"""),format.raw/*122.18*/("""

            .jssorb05 .av """),format.raw/*124.27*/("""{"""),format.raw/*124.28*/("""
                background-position: -67px -7px;
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/("""

            .jssorb05 .dn, .jssorb05 .dn:hover """),format.raw/*128.48*/("""{"""),format.raw/*128.49*/("""
                background-position: -97px -7px;
            """),format.raw/*130.13*/("""}"""),format.raw/*130.14*/("""
        </style>
        <!-- bullet navigator container -->
        <div u="navigator" class="jssorb05" style="position: absolute; bottom: 16px; right: 6px;">
            <!-- bullet navigator item prototype -->
            <div u="prototype" style="POSITION: absolute; WIDTH: 16px; HEIGHT: 16px;"></div>
        </div>
        <!-- Bullet Navigator Skin End -->
        <!-- Arrow Navigator Skin Begin -->
        <style>
            /* jssor slider arrow navigator skin 12 css */
            /*
            .jssora12l              (normal)
            .jssora12r              (normal)
            .jssora12l:hover        (normal mouseover)
            .jssora12r:hover        (normal mouseover)
            .jssora12ldn            (mousedown)
            .jssora12rdn            (mousedown)
            */
            .jssora12l, .jssora12r, .jssora12ldn, .jssora12rdn """),format.raw/*149.64*/("""{"""),format.raw/*149.65*/("""
                position: absolute;
                cursor: pointer;
                display: block;
                background: url("""),_display_(Seq[Any](/*153.34*/routes/*153.40*/.Assets.at("images/testSlider/a12.png"))),format.raw/*153.79*/(""") no-repeat;
                overflow: hidden;
            """),format.raw/*155.13*/("""}"""),format.raw/*155.14*/("""

            .jssora12l """),format.raw/*157.24*/("""{"""),format.raw/*157.25*/("""
                background-position: -16px -37px;
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/("""

            .jssora12r """),format.raw/*161.24*/("""{"""),format.raw/*161.25*/("""
                background-position: -75px -37px;
            """),format.raw/*163.13*/("""}"""),format.raw/*163.14*/("""

            .jssora12l:hover """),format.raw/*165.30*/("""{"""),format.raw/*165.31*/("""
                background-position: -136px -37px;
            """),format.raw/*167.13*/("""}"""),format.raw/*167.14*/("""

            .jssora12r:hover """),format.raw/*169.30*/("""{"""),format.raw/*169.31*/("""
                background-position: -195px -37px;
            """),format.raw/*171.13*/("""}"""),format.raw/*171.14*/("""

            .jssora12ldn """),format.raw/*173.26*/("""{"""),format.raw/*173.27*/("""
                background-position: -256px -37px;
            """),format.raw/*175.13*/("""}"""),format.raw/*175.14*/("""

            .jssora12rdn """),format.raw/*177.26*/("""{"""),format.raw/*177.27*/("""
                background-position: -315px -37px;
            """),format.raw/*179.13*/("""}"""),format.raw/*179.14*/("""
        </style>
        <!-- Arrow Left -->
        <span u="arrowleft" class="jssora12l" style="width: 30px; height: 46px; top: 123px; left: 0px;">
        </span>
        <!-- Arrow Right -->
        <span u="arrowright" class="jssora12r" style="width: 30px; height: 46px; top: 123px; right: 0px">
        </span>
        <!-- Arrow Navigator Skin End -->
        <a style="display: none" href="http://www.jssor.com">bootstrap slider</a>
    </div>
    
           
                """))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 22 00:29:31 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/simpleslider.scala.html
                    HASH: 2f23c013f2b797632faccc9743d7d7dfb9f5e8e5
                    MATRIX: 862->0|934->37|948->43|1021->95|1239->278|1253->284|1315->325|1403->378|1417->384|1486->432|1583->502|1611->503|1714->578|1743->579|1801->609|1830->610|1901->653|1930->654|5020->3716|5049->3717|5766->4406|5795->4407|5867->4451|5896->4452|7175->5703|7204->5704|7275->5747|7304->5748|7721->6137|7750->6138|7791->6151|7820->6152|8105->6409|8134->6410|8438->6686|8467->6687|8727->6920|8756->6921|10046->8175|10061->8181|10120->8218|10235->8297|10250->8303|10310->8341|10425->8420|10440->8426|10500->8464|10615->8543|10630->8549|10690->8587|11246->9114|11276->9115|11347->9149|11363->9155|11425->9194|11546->9286|11576->9287|11633->9315|11663->9316|11753->9377|11783->9378|11871->9437|11901->9438|12000->9508|12030->9509|12087->9537|12117->9538|12208->9600|12238->9601|12316->9650|12346->9651|12437->9713|12467->9714|13369->10587|13399->10588|13571->10723|13587->10729|13649->10768|13737->10827|13767->10828|13821->10853|13851->10854|13943->10917|13973->10918|14027->10943|14057->10944|14149->11007|14179->11008|14239->11039|14269->11040|14362->11104|14392->11105|14452->11136|14482->11137|14575->11201|14605->11202|14661->11229|14691->11230|14784->11294|14814->11295|14870->11322|14900->11323|14993->11387|15023->11388
                    LINES: 29->1|29->1|29->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|36->8|36->8|40->12|40->12|40->12|40->12|43->15|43->15|61->33|61->33|66->38|66->38|68->40|68->40|77->49|77->49|79->51|79->51|83->55|83->55|84->56|84->56|89->61|89->61|95->67|95->67|102->74|102->74|115->87|115->87|115->87|118->90|118->90|118->90|121->93|121->93|121->93|124->96|124->96|124->96|138->110|138->110|139->111|139->111|139->111|142->114|142->114|144->116|144->116|146->118|146->118|148->120|148->120|150->122|150->122|152->124|152->124|154->126|154->126|156->128|156->128|158->130|158->130|177->149|177->149|181->153|181->153|181->153|183->155|183->155|185->157|185->157|187->159|187->159|189->161|189->161|191->163|191->163|193->165|193->165|195->167|195->167|197->169|197->169|199->171|199->171|201->173|201->173|203->175|203->175|205->177|205->177|207->179|207->179
                    -- GENERATED --
                */
            