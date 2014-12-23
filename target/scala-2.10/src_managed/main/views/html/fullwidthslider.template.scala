
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
object fullwidthslider extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""﻿
    <!-- it works the same with all jquery version from 1.x to 2.x -->
    <script type="text/javascript" src="../js/jquery-1.9.1.min.js"></script>
    <!-- use jssor.slider.mini.js (40KB) instead for release -->
    <!-- jssor.slider.mini.js = (jssor.js + jssor.slider.js) -->
    <script type="text/javascript" src="../js/jssor.js"></script>
    <script type="text/javascript" src="../js/jssor.slider.js"></script>
    <script>
        jQuery(document).ready(function ($) """),format.raw/*9.45*/("""{"""),format.raw/*9.46*/("""

            var _CaptionTransitions = [];
            _CaptionTransitions["L"] = """),format.raw/*12.40*/("""{"""),format.raw/*12.41*/(""" $Duration: 900, x: 0.6, $Easing: """),format.raw/*12.75*/("""{"""),format.raw/*12.76*/(""" $Left: $JssorEasing$.$EaseInOutSine """),format.raw/*12.113*/("""}"""),format.raw/*12.114*/(""", $Opacity: 2 """),format.raw/*12.128*/("""}"""),format.raw/*12.129*/(""";
            _CaptionTransitions["R"] = """),format.raw/*13.40*/("""{"""),format.raw/*13.41*/(""" $Duration: 900, x: -0.6, $Easing: """),format.raw/*13.76*/("""{"""),format.raw/*13.77*/(""" $Left: $JssorEasing$.$EaseInOutSine """),format.raw/*13.114*/("""}"""),format.raw/*13.115*/(""", $Opacity: 2 """),format.raw/*13.129*/("""}"""),format.raw/*13.130*/(""";
            _CaptionTransitions["T"] = """),format.raw/*14.40*/("""{"""),format.raw/*14.41*/(""" $Duration: 900, y: 0.6, $Easing: """),format.raw/*14.75*/("""{"""),format.raw/*14.76*/(""" $Top: $JssorEasing$.$EaseInOutSine """),format.raw/*14.112*/("""}"""),format.raw/*14.113*/(""", $Opacity: 2 """),format.raw/*14.127*/("""}"""),format.raw/*14.128*/(""";
            _CaptionTransitions["B"] = """),format.raw/*15.40*/("""{"""),format.raw/*15.41*/(""" $Duration: 900, y: -0.6, $Easing: """),format.raw/*15.76*/("""{"""),format.raw/*15.77*/(""" $Top: $JssorEasing$.$EaseInOutSine """),format.raw/*15.113*/("""}"""),format.raw/*15.114*/(""", $Opacity: 2 """),format.raw/*15.128*/("""}"""),format.raw/*15.129*/(""";
            _CaptionTransitions["ZMF|10"] = """),format.raw/*16.45*/("""{"""),format.raw/*16.46*/(""" $Duration: 900, $Zoom: 11, $Easing: """),format.raw/*16.83*/("""{"""),format.raw/*16.84*/(""" $Zoom: $JssorEasing$.$EaseOutQuad, $Opacity: $JssorEasing$.$EaseLinear """),format.raw/*16.156*/("""}"""),format.raw/*16.157*/(""", $Opacity: 2 """),format.raw/*16.171*/("""}"""),format.raw/*16.172*/(""";
            _CaptionTransitions["RTT|10"] = """),format.raw/*17.45*/("""{"""),format.raw/*17.46*/(""" $Duration: 900, $Zoom: 11, $Rotate: 1, $Easing: """),format.raw/*17.95*/("""{"""),format.raw/*17.96*/(""" $Zoom: $JssorEasing$.$EaseOutQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInExpo """),format.raw/*17.204*/("""}"""),format.raw/*17.205*/(""", $Opacity: 2, $Round: """),format.raw/*17.228*/("""{"""),format.raw/*17.229*/(""" $Rotate: 0.8"""),format.raw/*17.242*/("""}"""),format.raw/*17.243*/(""" """),format.raw/*17.244*/("""}"""),format.raw/*17.245*/(""";
            _CaptionTransitions["RTT|2"] = """),format.raw/*18.44*/("""{"""),format.raw/*18.45*/(""" $Duration: 900, $Zoom: 3, $Rotate: 1, $Easing: """),format.raw/*18.93*/("""{"""),format.raw/*18.94*/(""" $Zoom: $JssorEasing$.$EaseInQuad, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInQuad """),format.raw/*18.201*/("""}"""),format.raw/*18.202*/(""", $Opacity: 2, $Round: """),format.raw/*18.225*/("""{"""),format.raw/*18.226*/(""" $Rotate: 0.5"""),format.raw/*18.239*/("""}"""),format.raw/*18.240*/(""" """),format.raw/*18.241*/("""}"""),format.raw/*18.242*/(""";
            _CaptionTransitions["RTTL|BR"] = """),format.raw/*19.46*/("""{"""),format.raw/*19.47*/(""" $Duration: 900, x: -0.6, y: -0.6, $Zoom: 11, $Rotate: 1, $Easing: """),format.raw/*19.114*/("""{"""),format.raw/*19.115*/(""" $Left: $JssorEasing$.$EaseInCubic, $Top: $JssorEasing$.$EaseInCubic, $Zoom: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear, $Rotate: $JssorEasing$.$EaseInCubic """),format.raw/*19.293*/("""}"""),format.raw/*19.294*/(""", $Opacity: 2, $Round: """),format.raw/*19.317*/("""{"""),format.raw/*19.318*/(""" $Rotate: 0.8"""),format.raw/*19.331*/("""}"""),format.raw/*19.332*/(""" """),format.raw/*19.333*/("""}"""),format.raw/*19.334*/(""";
            _CaptionTransitions["CLIP|LR"] = """),format.raw/*20.46*/("""{"""),format.raw/*20.47*/(""" $Duration: 900, $Clip: 15, $Easing: """),format.raw/*20.84*/("""{"""),format.raw/*20.85*/(""" $Clip: $JssorEasing$.$EaseInOutCubic """),format.raw/*20.123*/("""}"""),format.raw/*20.124*/(""", $Opacity: 2 """),format.raw/*20.138*/("""}"""),format.raw/*20.139*/(""";
            _CaptionTransitions["MCLIP|L"] = """),format.raw/*21.46*/("""{"""),format.raw/*21.47*/(""" $Duration: 900, $Clip: 1, $Move: true, $Easing: """),format.raw/*21.96*/("""{"""),format.raw/*21.97*/(""" $Clip: $JssorEasing$.$EaseInOutCubic"""),format.raw/*21.134*/("""}"""),format.raw/*21.135*/(""" """),format.raw/*21.136*/("""}"""),format.raw/*21.137*/(""";
            _CaptionTransitions["MCLIP|R"] = """),format.raw/*22.46*/("""{"""),format.raw/*22.47*/(""" $Duration: 900, $Clip: 2, $Move: true, $Easing: """),format.raw/*22.96*/("""{"""),format.raw/*22.97*/(""" $Clip: $JssorEasing$.$EaseInOutCubic"""),format.raw/*22.134*/("""}"""),format.raw/*22.135*/(""" """),format.raw/*22.136*/("""}"""),format.raw/*22.137*/(""";

            var options = """),format.raw/*24.27*/("""{"""),format.raw/*24.28*/("""
                $FillMode: 2,                                       //[Optional] The way to fill image in slide, 0 stretch, 1 contain (keep aspect ratio and put all inside slide), 2 cover (keep aspect ratio and cover whole slide), 4 actual size, 5 contain for large image, actual size for small image, default value is 0
                $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
                $AutoPlayInterval: 4000,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
                $PauseOnHover: 1,                                   //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

                $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
                $SlideEasing: $JssorEasing$.$EaseOutQuint,          //[Optional] Specifies easing for right to left animation, default value is $JssorEasing$.$EaseOutQuad
                $SlideDuration: 800,                               //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
                $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
                //$SlideWidth: 600,                                 //[Optional] Width of every slide in pixels, default value is width of 'slides' container
                //$SlideHeight: 300,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
                $SlideSpacing: 0, 					                //[Optional] Space between each slide in pixels, default value is 0
                $DisplayPieces: 1,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
                $ParkingPosition: 0,                                //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
                $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
                $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
                $DragOrientation: 1,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

                $CaptionSliderOptions: """),format.raw/*43.40*/("""{"""),format.raw/*43.41*/("""                            //[Optional] Options which specifies how to animate caption
                    $Class: $JssorCaptionSlider$,                   //[Required] Class to create instance to animate caption
                    $CaptionTransitions: _CaptionTransitions,       //[Required] An array of caption transitions to play caption, see caption transition section at jssor slideshow transition builder
                    $PlayInMode: 1,                                 //[Optional] 0 None (no play), 1 Chain (goes after main slide), 3 Chain Flatten (goes after main slide and flatten all caption animations), default value is 1
                    $PlayOutMode: 3                                 //[Optional] 0 None (no play), 1 Chain (goes before main slide), 3 Chain Flatten (goes before main slide and flatten all caption animations), default value is 1
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/(""",

                $BulletNavigatorOptions: """),format.raw/*50.42*/("""{"""),format.raw/*50.43*/("""                          //[Optional] Options to specify and enable navigator or not
                    $Class: $JssorBulletNavigator$,                 //[Required] Class to create navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 1,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1,                                      //[Optional] Steps to go for each navigation request, default value is 1
                    $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
                    $SpacingX: 8,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
                    $SpacingY: 8,                                   //[Optional] Vertical space between each item in pixel, default value is 0
                    $Orientation: 1,                                //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
                    $Scale: false,                                  //Scales bullets navigator or not while slider scale
                """),format.raw/*60.17*/("""}"""),format.raw/*60.18*/(""",

                $ArrowNavigatorOptions: """),format.raw/*62.41*/("""{"""),format.raw/*62.42*/("""                           //[Optional] Options to specify and enable arrow navigator or not
                    $Class: $JssorArrowNavigator$,                  //[Requried] Class to create arrow navigator instance
                    $ChanceToShow: 1,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 2,                                 //[Optional] Auto center arrows in parent container, 0 No, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1                                       //[Optional] Steps to go for each navigation request, default value is 1
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/(""";

            var jssor_slider1 = new $JssorSlider$("slider1_container", options);

            //responsive code begin
            //you can remove responsive code if you don't want the slider scales while window resizes
            function ScaleSlider() """),format.raw/*74.36*/("""{"""),format.raw/*74.37*/("""
                var bodyWidth = document.body.clientWidth;
                if (bodyWidth)
                    jssor_slider1.$ScaleWidth(Math.min(bodyWidth, 1920));
                else
                    window.setTimeout(ScaleSlider, 30);
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""
            ScaleSlider();

            $(window).bind("load", ScaleSlider);
            $(window).bind("resize", ScaleSlider);
            $(window).bind("orientationchange", ScaleSlider);
            //responsive code end
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/(""");
    </script>
    <!-- Jssor Slider Begin -->
    <!-- You can move inline styles to css file or css block. -->
    <div id="slider1_container" style="position: relative; margin: 0 auto;
        top: 0px; left: 0px; width: 1300px; height: 500px; overflow: hidden;">
        <!-- Loading Screen -->
        <div u="loading" style="position: absolute; top: 0px; left: 0px;">
            <div style="filter: alpha(opacity=70); opacity: 0.7; position: absolute; display: block;
                top: 0px; left: 0px; width: 100%; height: 100%;">
            </div>
            <div style="position: absolute; display: block; background: url(../img/loading.gif) no-repeat center center;
                top: 0px; left: 0px; width: 100%; height: 100%;">
            </div>
        </div>
        <!-- Slides Container -->
        <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 1300px;
            height: 500px; overflow: hidden;">
            
                 <div>
                <img u="image" src=""""),_display_(Seq[Any](/*107.38*/routes/*107.44*/.Assets.at("images/homeslider/1.jpg"))),format.raw/*107.81*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*110.38*/routes/*110.44*/.Assets.at("images/homeslider/2.jpg"))),format.raw/*110.81*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*113.38*/routes/*113.44*/.Assets.at("images/homeslider/3.jpg"))),format.raw/*113.81*/("""" />
            </div>
           
            
        </div>
                
        <!-- Bullet Navigator Skin Begin -->
        <style>
            /* jssor slider bullet navigator skin 21 css */
            /*
            .jssorb21 div           (normal)
            .jssorb21 div:hover     (normal mouseover)
            .jssorb21 .av           (active)
            .jssorb21 .av:hover     (active mouseover)
            .jssorb21 .dn           (mousedown)
            */
            .jssorb21 div, .jssorb21 div:hover, .jssorb21 .av
            """),format.raw/*130.13*/("""{"""),format.raw/*130.14*/("""
                background:url("""),_display_(Seq[Any](/*131.33*/routes/*131.39*/.Assets.at("images/testSlider/b05.png"))),format.raw/*131.78*/(""") no-repeat ;
                overflow:hidden;
                cursor: pointer;
            """),format.raw/*134.13*/("""}"""),format.raw/*134.14*/("""
            .jssorb21 div """),format.raw/*135.27*/("""{"""),format.raw/*135.28*/(""" background-position: -5px -5px; """),format.raw/*135.61*/("""}"""),format.raw/*135.62*/("""
            .jssorb21 div:hover, .jssorb21 .av:hover """),format.raw/*136.54*/("""{"""),format.raw/*136.55*/(""" background-position: -35px -5px; """),format.raw/*136.89*/("""}"""),format.raw/*136.90*/("""
            .jssorb21 .av """),format.raw/*137.27*/("""{"""),format.raw/*137.28*/(""" background-position: -65px -5px; """),format.raw/*137.62*/("""}"""),format.raw/*137.63*/("""
            .jssorb21 .dn, .jssorb21 .dn:hover """),format.raw/*138.48*/("""{"""),format.raw/*138.49*/(""" background-position: -95px -5px; """),format.raw/*138.83*/("""}"""),format.raw/*138.84*/("""
        </style>
        <!-- bullet navigator container -->
        <div u="navigator" class="jssorb21" style="position: absolute; bottom: 26px; left: 6px;">
            <!-- bullet navigator item prototype -->
            <div u="prototype" style="POSITION: absolute; WIDTH: 19px; HEIGHT: 19px; text-align:center; line-height:19px; color:White; font-size:12px;"></div>
        </div>
        <!-- Bullet Navigator Skin End -->

        <!-- Arrow Navigator Skin Begin -->
        <style>
            /* jssor slider arrow navigator skin 21 css */
            /*
            .jssora21l              (normal)
            .jssora21r              (normal)
            .jssora21l:hover        (normal mouseover)
            .jssora21r:hover        (normal mouseover)
            .jssora21ldn            (mousedown)
            .jssora21rdn            (mousedown)
            */
            .jssora21l, .jssora21r, .jssora21ldn, .jssora21rdn
            """),format.raw/*159.13*/("""{"""),format.raw/*159.14*/("""
            	position: absolute;
            	cursor: pointer;
            	display: block;
                background:url("""),_display_(Seq[Any](/*163.33*/routes/*163.39*/.Assets.at("images/testSlider/a12.png"))),format.raw/*163.78*/(""") no-repeat;
                overflow: hidden;
            """),format.raw/*165.13*/("""}"""),format.raw/*165.14*/("""
            .jssora21l """),format.raw/*166.24*/("""{"""),format.raw/*166.25*/(""" background-position: -3px -33px; """),format.raw/*166.59*/("""}"""),format.raw/*166.60*/("""
            .jssora21r """),format.raw/*167.24*/("""{"""),format.raw/*167.25*/(""" background-position: -63px -33px; """),format.raw/*167.60*/("""}"""),format.raw/*167.61*/("""
            .jssora21l:hover """),format.raw/*168.30*/("""{"""),format.raw/*168.31*/(""" background-position: -123px -33px; """),format.raw/*168.67*/("""}"""),format.raw/*168.68*/("""
            .jssora21r:hover """),format.raw/*169.30*/("""{"""),format.raw/*169.31*/(""" background-position: -183px -33px; """),format.raw/*169.67*/("""}"""),format.raw/*169.68*/("""
            .jssora21ldn """),format.raw/*170.26*/("""{"""),format.raw/*170.27*/(""" background-position: -243px -33px; """),format.raw/*170.63*/("""}"""),format.raw/*170.64*/("""
            .jssora21rdn """),format.raw/*171.26*/("""{"""),format.raw/*171.27*/(""" background-position: -303px -33px; """),format.raw/*171.63*/("""}"""),format.raw/*171.64*/("""
        </style>
        <!-- Arrow Left -->
        <span u="arrowleft" class="jssora21l" style="width: 55px; height: 55px; top: 123px; left: 8px;">
        </span>
        <!-- Arrow Right -->
        <span u="arrowright" class="jssora21r" style="width: 55px; height: 55px; top: 123px; right: 8px">
        </span>
        <!-- Arrow Navigator Skin End -->
        <a style="display: none" href="http://www.jssor.com">bootstrap slider</a>
    </div>
    <!-- Jssor Slider End -->
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 21 20:24:56 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/fullwidthslider.scala.html
                    HASH: 7c33c778b09c077a57ef08383ece8b475538efe1
                    MATRIX: 865->0|1376->484|1404->485|1518->571|1547->572|1609->606|1638->607|1704->644|1734->645|1777->659|1807->660|1877->702|1906->703|1969->738|1998->739|2064->776|2094->777|2137->791|2167->792|2237->834|2266->835|2328->869|2357->870|2422->906|2452->907|2495->921|2525->922|2595->964|2624->965|2687->1000|2716->1001|2781->1037|2811->1038|2854->1052|2884->1053|2959->1100|2988->1101|3053->1138|3082->1139|3183->1211|3213->1212|3256->1226|3286->1227|3361->1274|3390->1275|3467->1324|3496->1325|3633->1433|3663->1434|3715->1457|3745->1458|3787->1471|3817->1472|3847->1473|3877->1474|3951->1520|3980->1521|4056->1569|4085->1570|4221->1677|4251->1678|4303->1701|4333->1702|4375->1715|4405->1716|4435->1717|4465->1718|4541->1766|4570->1767|4666->1834|4696->1835|4903->2013|4933->2014|4985->2037|5015->2038|5057->2051|5087->2052|5117->2053|5147->2054|5223->2102|5252->2103|5317->2140|5346->2141|5413->2179|5443->2180|5486->2194|5516->2195|5592->2243|5621->2244|5698->2293|5727->2294|5793->2331|5823->2332|5853->2333|5883->2334|5959->2382|5988->2383|6065->2432|6094->2433|6160->2470|6190->2471|6220->2472|6250->2473|6309->2504|6338->2505|9750->5889|9779->5890|10696->6779|10725->6780|10799->6826|10828->6827|12224->8195|12253->8196|12326->8241|12355->8242|13053->8912|13082->8913|13124->8927|13153->8928|13445->9192|13474->9193|13762->9453|13791->9454|14058->9694|14087->9695|15182->10753|15198->10759|15258->10796|15377->10878|15393->10884|15453->10921|15572->11003|15588->11009|15648->11046|16248->11617|16278->11618|16349->11652|16365->11658|16427->11697|16551->11792|16581->11793|16638->11821|16668->11822|16730->11855|16760->11856|16844->11911|16874->11912|16937->11946|16967->11947|17024->11975|17054->11976|17117->12010|17147->12011|17225->12060|17255->12061|17318->12095|17348->12096|18349->13068|18379->13069|18545->13198|18561->13204|18623->13243|18713->13304|18743->13305|18797->13330|18827->13331|18890->13365|18920->13366|18974->13391|19004->13392|19068->13427|19098->13428|19158->13459|19188->13460|19253->13496|19283->13497|19343->13528|19373->13529|19438->13565|19468->13566|19524->13593|19554->13594|19619->13630|19649->13631|19705->13658|19735->13659|19800->13695|19830->13696
                    LINES: 29->1|37->9|37->9|40->12|40->12|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|41->13|41->13|42->14|42->14|42->14|42->14|42->14|42->14|42->14|42->14|43->15|43->15|43->15|43->15|43->15|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|48->20|48->20|49->21|49->21|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|50->22|50->22|50->22|50->22|50->22|52->24|52->24|71->43|71->43|76->48|76->48|78->50|78->50|88->60|88->60|90->62|90->62|95->67|95->67|96->68|96->68|102->74|102->74|108->80|108->80|115->87|115->87|135->107|135->107|135->107|138->110|138->110|138->110|141->113|141->113|141->113|158->130|158->130|159->131|159->131|159->131|162->134|162->134|163->135|163->135|163->135|163->135|164->136|164->136|164->136|164->136|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|187->159|187->159|191->163|191->163|191->163|193->165|193->165|194->166|194->166|194->166|194->166|195->167|195->167|195->167|195->167|196->168|196->168|196->168|196->168|197->169|197->169|197->169|197->169|198->170|198->170|198->170|198->170|199->171|199->171|199->171|199->171
                    -- GENERATED --
                */
            