
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
object thumb extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<script type="text/javascript" src=""""),_display_(Seq[Any](/*1.38*/routes/*1.44*/.Assets.at("javascripts/slider/jquery-1.9.1.min.js"))),format.raw/*1.96*/(""""></script>
    <!-- use jssor.slider.mini.js (40KB) instead for release -->
    <!-- jssor.slider.mini.js = (jssor.js + jssor.slider.js) -->
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*4.42*/routes/*4.48*/.Assets.at("javascripts/slider/jssor.js"))),format.raw/*4.89*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*5.42*/routes/*5.48*/.Assets.at("javascripts/slider/jssor.slider.js"))),format.raw/*5.96*/(""""></script>
    <script>
    jQuery(document).ready(function ($) """),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""
        var options = """),format.raw/*8.23*/("""{"""),format.raw/*8.24*/("""
            $AutoPlay: true,                                    //[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
            $AutoPlaySteps: 7,                                  //[Optional] Steps to go for each navigation request (this options applys only when slideshow disabled), the default value is 1
            $AutoPlayInterval: 1,                            //[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
            $PauseOnHover: 4,                               //[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

            $ArrowKeyNavigation: true,   			            //[Optional] Allows keyboard (arrow key) navigation or not, default value is false
            $SlideEasing: $JssorEasing$.$EaseLinear,          //[Optional] Specifies easing for right to left animation, default value is $JssorEasing$.$EaseOutQuad
            $SlideDuration: 1600,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
            $MinDragOffsetToSlide: 20,                          //[Optional] Minimum drag offset to trigger slide , default value is 20
            $SlideWidth: 250,                                   //[Optional] Width of every slide in pixels, default value is width of 'slides' container
            $SlideHeight: 200,                                //[Optional] Height of every slide in pixels, default value is height of 'slides' container
            $SlideSpacing: 5, 					                //[Optional] Space between each slide in pixels, default value is 0
            $DisplayPieces: 5,                                  //[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
            $ParkingPosition: 0,                              //[Optional] The offset position to park slide (this options applys only when slideshow disabled), default value is 0.
            $UISearchMode: 1,                                   //[Optional] The way (0 parellel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
            $PlayOrientation: 1,                                //[Optional] Orientation to play slide (for auto play, navigation), 1 horizental, 2 vertical, 5 horizental reverse, 6 vertical reverse, default value is 1
            $DragOrientation: 1 ,
            //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)
           

            $BulletNavigatorOptions: """),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""                                //[Optional] Options to specify and enable navigator or not
                $Class: $JssorBulletNavigator$,                       //[Required] Class to create navigator instance
                $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                $AutoCenter: 1,                                 //[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                $Steps: 7,                                      //[Optional] Steps to go for each navigation request, default value is 1
                $Lanes: 1,                                      //[Optional] Specify lanes to arrange items, default value is 1
                $SpacingX: 10,                                   //[Optional] Horizontal space between each item in pixel, default value is 0
                $SpacingY: 10,                                   //[Optional] Vertical space between each item in pixel, default value is 0
                $Orientation: 1                                 //[Optional] The orientation of the navigator, 1 horizontal, 2 vertical, default value is 1
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""",

            $ArrowNavigatorOptions: """),format.raw/*40.37*/("""{"""),format.raw/*40.38*/("""
                $Class: $JssorArrowNavigator$,              //[Requried] Class to create arrow navigator instance
                $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                $Steps: 7                                   //[Optional] Steps to go for each navigation request, default value is 1
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""}"""),format.raw/*44.15*/(""";

        var jssor_slider1 = new $JssorSlider$("slider1_container", options);

        //responsive code begin
        //you can remove responsive code if you don't want the slider scales while window resizes
        function ScaleSlider() """),format.raw/*50.32*/("""{"""),format.raw/*50.33*/("""
            var bodyWidth = document.body.clientWidth;
            if (bodyWidth)
                jssor_slider1.$ScaleWidth(Math.min(bodyWidth, 980));
            else
                window.setTimeout(ScaleSlider, 30);
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""
        ScaleSlider();

        $(window).bind("load", ScaleSlider);
        $(window).bind("resize", ScaleSlider);
        $(window).bind("orientationchange", ScaleSlider);
        //responsive code end
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/(""");
    </script>
    <!-- Jssor Slider Begin -->
    <!-- You can move inline styles to css file or css block. -->
    <div id="slider1_container" style="position: relative; top: 0px; left: 0px; width: 980px; height: 200px; overflow: hidden; ">

        <!-- Loading Screen -->
        <div u="loading" style="position: absolute; top: 0px; left: 0px;">
            <div style="filter: alpha(opacity=70); opacity:0.7; position: absolute; display: block;
                background-color: #000; top: 0px; left: 0px;width: 100%;height:100%;">
            </div>
            <div style="position: absolute; display: block; background: url(/img/loading.gif) no-repeat center center;
                top: 0px; left: 0px;width: 100%;height:100%;">
            </div>
        </div>
<!-- Slides Container -->
        <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 980px; height: 200px; overflow: hidden;">
             <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*81.38*/routes/*81.44*/.Assets.at("images/homeslider/10.jpg"))),format.raw/*81.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*84.38*/routes/*84.44*/.Assets.at("images/homeslider/17.jpg"))),format.raw/*84.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*87.38*/routes/*87.44*/.Assets.at("images/homeslider/12.jpg"))),format.raw/*87.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*90.38*/routes/*90.44*/.Assets.at("images/homeslider/13.jpg"))),format.raw/*90.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*93.38*/routes/*93.44*/.Assets.at("images/homeslider/14.jpg"))),format.raw/*93.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*96.38*/routes/*96.44*/.Assets.at("images/homeslider/15.jpg"))),format.raw/*96.82*/(""""height=200px width=250px  /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*99.38*/routes/*99.44*/.Assets.at("images/homeslider/17.jpg"))),format.raw/*99.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*102.38*/routes/*102.44*/.Assets.at("images/homeslider/18.jpg"))),format.raw/*102.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*105.38*/routes/*105.44*/.Assets.at("images/homeslider/19.jpg"))),format.raw/*105.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*108.38*/routes/*108.44*/.Assets.at("images/homeslider/20.jpg"))),format.raw/*108.82*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*111.38*/routes/*111.44*/.Assets.at("images/homeslider/1.jpg"))),format.raw/*111.81*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*114.38*/routes/*114.44*/.Assets.at("images/homeslider/2.jpg"))),format.raw/*114.81*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*117.38*/routes/*117.44*/.Assets.at("images/homeslider/3.jpg"))),format.raw/*117.81*/("""" height=200px width=250px /></a>
            </div>
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*120.38*/routes/*120.44*/.Assets.at("images/homeslider/4.jpg"))),format.raw/*120.81*/("""" height=200px width=250px /></a>
            </div>
           
            <div><a href=#>
                <img u="image" src=""""),_display_(Seq[Any](/*124.38*/routes/*124.44*/.Assets.at("images/homeslider/7.jpg"))),format.raw/*124.81*/("""" height=200px width=250px /></a>
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
            .jssorb05 div, .jssorb05 div:hover, .jssorb05 .av """),format.raw/*138.63*/("""{"""),format.raw/*138.64*/("""
                background: url("""),_display_(Seq[Any](/*139.34*/routes/*139.40*/.Assets.at("images/testSlider/b05.png"))),format.raw/*139.79*/(""") no-repeat;
                overflow: hidden;
                cursor: pointer;
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/("""

            .jssorb05 div """),format.raw/*144.27*/("""{"""),format.raw/*144.28*/("""
                background-position: -7px -7px;
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/("""

                .jssorb05 div:hover, .jssorb05 .av:hover """),format.raw/*148.58*/("""{"""),format.raw/*148.59*/("""
                    background-position: -37px -7px;
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/("""

            .jssorb05 .av """),format.raw/*152.27*/("""{"""),format.raw/*152.28*/("""
                background-position: -67px -7px;
            """),format.raw/*154.13*/("""}"""),format.raw/*154.14*/("""

            .jssorb05 .dn, .jssorb05 .dn:hover """),format.raw/*156.48*/("""{"""),format.raw/*156.49*/("""
                background-position: -97px -7px;
            """),format.raw/*158.13*/("""}"""),format.raw/*158.14*/("""
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
            .jssora12l, .jssora12r, .jssora12ldn, .jssora12rdn """),format.raw/*177.64*/("""{"""),format.raw/*177.65*/("""
                position: absolute;
                cursor: pointer;
                display: block;
                background: url("""),_display_(Seq[Any](/*181.34*/routes/*181.40*/.Assets.at("images/testSlider/a12.png"))),format.raw/*181.79*/(""") no-repeat;
                overflow: hidden;
            """),format.raw/*183.13*/("""}"""),format.raw/*183.14*/("""

            .jssora12l """),format.raw/*185.24*/("""{"""),format.raw/*185.25*/("""
                background-position: -16px -37px;
            """),format.raw/*187.13*/("""}"""),format.raw/*187.14*/("""

            .jssora12r """),format.raw/*189.24*/("""{"""),format.raw/*189.25*/("""
                background-position: -75px -37px;
            """),format.raw/*191.13*/("""}"""),format.raw/*191.14*/("""

            .jssora12l:hover """),format.raw/*193.30*/("""{"""),format.raw/*193.31*/("""
                background-position: -136px -37px;
            """),format.raw/*195.13*/("""}"""),format.raw/*195.14*/("""

            .jssora12r:hover """),format.raw/*197.30*/("""{"""),format.raw/*197.31*/("""
                background-position: -195px -37px;
            """),format.raw/*199.13*/("""}"""),format.raw/*199.14*/("""

            .jssora12ldn """),format.raw/*201.26*/("""{"""),format.raw/*201.27*/("""
                background-position: -256px -37px;
            """),format.raw/*203.13*/("""}"""),format.raw/*203.14*/("""

            .jssora12rdn """),format.raw/*205.26*/("""{"""),format.raw/*205.27*/("""
                background-position: -315px -37px;
            """),format.raw/*207.13*/("""}"""),format.raw/*207.14*/("""
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
                    DATE: Mon Dec 22 21:48:28 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/thumb.scala.html
                    HASH: b21aed45e08e2e968cce44c8f4439d332b88166e
                    MATRIX: 855->0|927->37|941->43|1014->95|1232->278|1246->284|1308->325|1396->378|1410->384|1479->432|1571->497|1599->498|1649->521|1677->522|4862->3679|4891->3680|6134->4895|6163->4896|6230->4935|6259->4936|6656->5305|6685->5306|6714->5307|6984->5549|7013->5550|7269->5779|7298->5780|7534->5989|7562->5990|8600->6992|8615->6998|8675->7036|8829->7154|8844->7160|8904->7198|9058->7316|9073->7322|9133->7360|9287->7478|9302->7484|9362->7522|9516->7640|9531->7646|9591->7684|9745->7802|9760->7808|9820->7846|9974->7964|9989->7970|10049->8008|10204->8126|10220->8132|10281->8170|10436->8288|10452->8294|10513->8332|10668->8450|10684->8456|10745->8494|10900->8612|10916->8618|10976->8655|11131->8773|11147->8779|11207->8816|11362->8934|11378->8940|11438->8977|11593->9095|11609->9101|11669->9138|11836->9268|11852->9274|11912->9311|12477->9847|12507->9848|12578->9882|12594->9888|12656->9927|12777->10019|12807->10020|12864->10048|12894->10049|12984->10110|13014->10111|13102->10170|13132->10171|13231->10241|13261->10242|13318->10270|13348->10271|13439->10333|13469->10334|13547->10383|13577->10384|13668->10446|13698->10447|14600->11320|14630->11321|14802->11456|14818->11462|14880->11501|14968->11560|14998->11561|15052->11586|15082->11587|15174->11650|15204->11651|15258->11676|15288->11677|15380->11740|15410->11741|15470->11772|15500->11773|15593->11837|15623->11838|15683->11869|15713->11870|15806->11934|15836->11935|15892->11962|15922->11963|16015->12027|16045->12028|16101->12055|16131->12056|16224->12120|16254->12121
                    LINES: 29->1|29->1|29->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|36->8|36->8|57->29|57->29|66->38|66->38|68->40|68->40|72->44|72->44|72->44|78->50|78->50|84->56|84->56|91->63|91->63|109->81|109->81|109->81|112->84|112->84|112->84|115->87|115->87|115->87|118->90|118->90|118->90|121->93|121->93|121->93|124->96|124->96|124->96|127->99|127->99|127->99|130->102|130->102|130->102|133->105|133->105|133->105|136->108|136->108|136->108|139->111|139->111|139->111|142->114|142->114|142->114|145->117|145->117|145->117|148->120|148->120|148->120|152->124|152->124|152->124|166->138|166->138|167->139|167->139|167->139|170->142|170->142|172->144|172->144|174->146|174->146|176->148|176->148|178->150|178->150|180->152|180->152|182->154|182->154|184->156|184->156|186->158|186->158|205->177|205->177|209->181|209->181|209->181|211->183|211->183|213->185|213->185|215->187|215->187|217->189|217->189|219->191|219->191|221->193|221->193|223->195|223->195|225->197|225->197|227->199|227->199|229->201|229->201|231->203|231->203|233->205|233->205|235->207|235->207
                    -- GENERATED --
                */
            