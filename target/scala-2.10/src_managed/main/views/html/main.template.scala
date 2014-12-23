
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(error: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap-theme.min.css"))),format.raw/*10.109*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-2.1.1.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery-2.1.1.min.map"))),format.raw/*13.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*14.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/main.js"))),format.raw/*15.62*/("""" type="text/javascript"></script>
    </head>
    <body>
    	"""),_display_(Seq[Any](/*18.7*/header())),format.raw/*18.15*/("""
    	"""),_display_(Seq[Any](/*19.7*/navigation())),format.raw/*19.19*/("""
    	"""),_display_(Seq[Any](/*20.7*/thumb())),format.raw/*20.14*/("""
    	"""),_display_(Seq[Any](/*21.7*/grid())),format.raw/*21.13*/("""
    	"""),_display_(Seq[Any](/*22.7*/error/*22.12*/ match/*22.18*/ {/*23.6*/case "Incorrect Username and Password Combination" =>/*23.59*/ {_display_(Seq[Any](format.raw/*23.61*/("""
			  	<script type="text/javascript">
				    $(window).load(function()"""),format.raw/*25.34*/("""{"""),format.raw/*25.35*/("""
				        $('#errormodal').modal('show');
				    """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""");
				</script>
			    <div id="errormodal" class="modal fade in" role="dialog" aria-labelledby="errorModal">  
					<div class="modal-dialog" style="width: 800px; margin-top: 125px">
				        <div class="modal-content">
						    <div class="modal-header">  
						    	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						    	<h3 class="loginh3">Elan Indulgence</h3>
						    </div>      
						    <div class="modal-body" id="errorBody">
						    	<div class="container" style="width:750px">
						    		<h4 class="centerh4">"""),_display_(Seq[Any](/*38.35*/error)),format.raw/*38.40*/("""</h4>
						    	</div>
						    </div>
						</div>
					</div>
				</div>
			  """)))}/*45.6*/case "" =>/*45.16*/ {_display_(Seq[Any](format.raw/*45.18*/("""
			  """)))}})),format.raw/*47.4*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,error:String): play.api.templates.HtmlFormat.Appendable = apply(title)(error)
    
    def f:((String) => (String) => play.api.templates.HtmlFormat.Appendable) = (title) => (error) => apply(title)(error)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 22 19:58:38 EST 2014
                    SOURCE: /home/swapna/git/ElanIndulgence/app/views/main.scala.html
                    HASH: 0e8cbe944ae8aecec0a30d6c7613fb044fdde8fb
                    MATRIX: 780->1|904->31|992->84|1018->89|1115->151|1129->157|1184->191|1275->247|1289->253|1354->296|1446->352|1461->358|1533->407|1630->468|1645->474|1699->506|1760->531|1775->537|1842->582|1935->639|1950->645|2018->691|2111->748|2126->754|2190->796|2283->853|2298->859|2353->892|2452->956|2482->964|2524->971|2558->983|2600->990|2629->997|2671->1004|2699->1010|2741->1017|2755->1022|2770->1028|2780->1036|2842->1089|2882->1091|2982->1163|3011->1164|3091->1217|3120->1218|3738->1800|3765->1805|3866->1894|3885->1904|3925->1906|3964->1917
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|46->18|46->18|47->19|47->19|48->20|48->20|49->21|49->21|50->22|50->22|50->22|50->23|50->23|50->23|52->25|52->25|54->27|54->27|65->38|65->38|71->45|71->45|71->45|72->47
                    -- GENERATED --
                */
            