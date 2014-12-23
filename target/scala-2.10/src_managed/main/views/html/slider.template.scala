
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
object slider extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
    <!-- Jssor Slider Begin -->
    <!-- You can move inline styles to css file or css block. -->
    <div class="container-fluid">
    <div id="slider1_container" style="position: relative; top: 0px; left: 0px; width: 50px; height: 50px; overflow: hidden; ">

        <!-- Loading Screen -->
        <div u="loading" style="position: absolute; top: 0px; left: 0px;">
            <div style="filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;
                background-color: #000000; top: 0px; left: 0px;width: 100%;height:100%;">
            </div>
            <div style="position: absolute; display: block; background: url(img/loading.gif) no-repeat center center;
                top: 0px; left: 0px;width: 100%;height:100%;">
            </div>
        </div>

        <!-- Slides Container -->
        <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 50px; height: 50px; overflow: hidden; align-component: center;">
             <div>
                <img u="image" src=""""),_display_(Seq[Any](/*94.38*/routes/*94.44*/.Assets.at("images/homeslider/10.jpg"))),format.raw/*94.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*97.38*/routes/*97.44*/.Assets.at("images/homeslider/11.jpg"))),format.raw/*97.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*100.38*/routes/*100.44*/.Assets.at("images/homeslider/12.jpg"))),format.raw/*100.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*103.38*/routes/*103.44*/.Assets.at("images/homeslider/13.jpg"))),format.raw/*103.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*106.38*/routes/*106.44*/.Assets.at("images/homeslider/14.jpg"))),format.raw/*106.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*109.38*/routes/*109.44*/.Assets.at("images/homeslider/15.jpg"))),format.raw/*109.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*112.38*/routes/*112.44*/.Assets.at("images/homeslider/17.jpg"))),format.raw/*112.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*115.38*/routes/*115.44*/.Assets.at("images/homeslider/18.jpg"))),format.raw/*115.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*118.38*/routes/*118.44*/.Assets.at("images/homeslider/19.jpg"))),format.raw/*118.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*121.38*/routes/*121.44*/.Assets.at("images/homeslider/20.jpg"))),format.raw/*121.82*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*124.38*/routes/*124.44*/.Assets.at("images/homeslider/1.jpg"))),format.raw/*124.81*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*127.38*/routes/*127.44*/.Assets.at("images/homeslider/2.jpg"))),format.raw/*127.81*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*130.38*/routes/*130.44*/.Assets.at("images/homeslider/3.jpg"))),format.raw/*130.81*/("""" />
            </div>
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*133.38*/routes/*133.44*/.Assets.at("images/homeslider/4.jpg"))),format.raw/*133.81*/("""" />
            </div>
           
            <div>
                <img u="image" src=""""),_display_(Seq[Any](/*137.38*/routes/*137.44*/.Assets.at("images/homeslider/7.jpg"))),format.raw/*137.81*/("""" />
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
            .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av """),format.raw/*153.63*/("""{"""),format.raw/*153.64*/("""
                background: url("""),_display_(Seq[Any](/*154.34*/routes/*154.40*/.Assets.at("images/testSlider/b05.png"))),format.raw/*154.79*/(""") no-repeat;
                overflow: hidden;
                cursor: pointer;
            """),format.raw/*157.13*/("""}"""),format.raw/*157.14*/("""

            .jssorb05 div """),format.raw/*159.27*/("""{"""),format.raw/*159.28*/("""
                background-position: -7px -7px;
            """),format.raw/*161.13*/("""}"""),format.raw/*161.14*/("""

                .jssorb05 div:hover, .jssorb05 .av:hover """),format.raw/*163.58*/("""{"""),format.raw/*163.59*/("""
                    background-position: -37px -7px;
                """),format.raw/*165.17*/("""}"""),format.raw/*165.18*/("""

            .jssorb05 .av """),format.raw/*167.27*/("""{"""),format.raw/*167.28*/("""
                background-position: -67px -7px;
            """),format.raw/*169.13*/("""}"""),format.raw/*169.14*/("""

            .jssorb05 .dn, .jssorb05 .dn:hover """),format.raw/*171.48*/("""{"""),format.raw/*171.49*/("""
                background-position: -97px -7px;
            """),format.raw/*173.13*/("""}"""),format.raw/*173.14*/("""
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
            .jssora12l, .jssora12r, .jssora12ldn, .jssora12rdn """),format.raw/*192.64*/("""{"""),format.raw/*192.65*/("""
                position: absolute;
                cursor: pointer;
                display: block;
                background: url("""),_display_(Seq[Any](/*196.34*/routes/*196.40*/.Assets.at("images/testSlider/a12.png"))),format.raw/*196.79*/(""") no-repeat;
                overflow: hidden;
            """),format.raw/*198.13*/("""}"""),format.raw/*198.14*/("""

            .jssora12l """),format.raw/*200.24*/("""{"""),format.raw/*200.25*/("""
                background-position: -16px -37px;
            """),format.raw/*202.13*/("""}"""),format.raw/*202.14*/("""

            .jssora12r """),format.raw/*204.24*/("""{"""),format.raw/*204.25*/("""
                background-position: -75px -37px;
            """),format.raw/*206.13*/("""}"""),format.raw/*206.14*/("""

            .jssora12l:hover """),format.raw/*208.30*/("""{"""),format.raw/*208.31*/("""
                background-position: -136px -37px;
            """),format.raw/*210.13*/("""}"""),format.raw/*210.14*/("""

            .jssora12r:hover """),format.raw/*212.30*/("""{"""),format.raw/*212.31*/("""
                background-position: -195px -37px;
            """),format.raw/*214.13*/("""}"""),format.raw/*214.14*/("""

            .jssora12ldn """),format.raw/*216.26*/("""{"""),format.raw/*216.27*/("""
                background-position: -256px -37px;
            """),format.raw/*218.13*/("""}"""),format.raw/*218.14*/("""

            .jssora12rdn """),format.raw/*220.26*/("""{"""),format.raw/*220.27*/("""
                background-position: -315px -37px;
            """),format.raw/*222.13*/("""}"""),format.raw/*222.14*/("""
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
                    DATE: Mon Dec 22 21:22:58 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/slider.scala.html
                    HASH: 60c1bad77404c7faf5f9965e1e19fad098f6d793
                    MATRIX: 856->0|928->37|942->43|1015->95|1233->278|1247->284|1309->325|1397->378|1411->384|1480->432|1577->502|1605->503|1708->578|1737->579|1795->609|1824->610|1895->653|1924->654|5014->3716|5043->3717|5760->4406|5789->4407|5861->4451|5890->4452|7169->5703|7198->5704|7269->5747|7298->5748|7715->6137|7744->6138|7785->6151|7814->6152|8099->6409|8128->6410|8432->6686|8461->6687|8721->6920|8750->6921|9844->7979|9859->7985|9919->8023|10034->8102|10049->8108|10109->8146|10225->8225|10241->8231|10302->8269|10418->8348|10434->8354|10495->8392|10611->8471|10627->8477|10688->8515|10804->8594|10820->8600|10881->8638|10997->8717|11013->8723|11074->8761|11190->8840|11206->8846|11267->8884|11383->8963|11399->8969|11460->9007|11576->9086|11592->9092|11653->9130|11769->9209|11785->9215|11845->9252|11961->9331|11977->9337|12037->9374|12153->9453|12169->9459|12229->9496|12345->9575|12361->9581|12421->9618|12549->9709|12565->9715|12625->9752|13186->10284|13216->10285|13287->10319|13303->10325|13365->10364|13486->10456|13516->10457|13573->10485|13603->10486|13693->10547|13723->10548|13811->10607|13841->10608|13940->10678|13970->10679|14027->10707|14057->10708|14148->10770|14178->10771|14256->10820|14286->10821|14377->10883|14407->10884|15309->11757|15339->11758|15511->11893|15527->11899|15589->11938|15677->11997|15707->11998|15761->12023|15791->12024|15883->12087|15913->12088|15967->12113|15997->12114|16089->12177|16119->12178|16179->12209|16209->12210|16302->12274|16332->12275|16392->12306|16422->12307|16515->12371|16545->12372|16601->12399|16631->12400|16724->12464|16754->12465|16810->12492|16840->12493|16933->12557|16963->12558
                    LINES: 29->1|29->1|29->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|36->8|36->8|40->12|40->12|40->12|40->12|43->15|43->15|61->33|61->33|66->38|66->38|68->40|68->40|77->49|77->49|79->51|79->51|83->55|83->55|84->56|84->56|89->61|89->61|95->67|95->67|102->74|102->74|122->94|122->94|122->94|125->97|125->97|125->97|128->100|128->100|128->100|131->103|131->103|131->103|134->106|134->106|134->106|137->109|137->109|137->109|140->112|140->112|140->112|143->115|143->115|143->115|146->118|146->118|146->118|149->121|149->121|149->121|152->124|152->124|152->124|155->127|155->127|155->127|158->130|158->130|158->130|161->133|161->133|161->133|165->137|165->137|165->137|181->153|181->153|182->154|182->154|182->154|185->157|185->157|187->159|187->159|189->161|189->161|191->163|191->163|193->165|193->165|195->167|195->167|197->169|197->169|199->171|199->171|201->173|201->173|220->192|220->192|224->196|224->196|224->196|226->198|226->198|228->200|228->200|230->202|230->202|232->204|232->204|234->206|234->206|236->208|236->208|238->210|238->210|240->212|240->212|242->214|242->214|244->216|244->216|246->218|246->218|248->220|248->220|250->222|250->222
                    -- GENERATED --
                */
            