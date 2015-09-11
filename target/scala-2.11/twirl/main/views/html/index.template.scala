
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/views/*1.7*/.html.mainTheme/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""

    """),format.raw/*3.5*/("""<div class="alert-message block-message info" style="margin: 0 10%;">
      <div class="dynamic-column-holder">

        <div class="flex3" style="line-height: 18px; text-align: justify; font-size: 16px; padding-right: 3%;">
          We're bringing <a href="http://ccl.northwestern.edu/netlogo/">NetLogo</a> back to the browser!  With NetLogo Web
          (formerly known as "Tortoise"), we intend to provide a proper replacement for NetLogo applets, which went out of vogue a
          couple of years ago (thanks to various Java security problems).  Like with the applets of yore, NetLogo Web models
          execute directly in the user's browser, which is great, because it allows the world to yet again use NetLogo in a way
          that makes it easy to share, embed, distribute, and leverage the near-limitless power that the web affords.
          <br><br>
          The biggest downside, however, is that NetLogo—a project with over 15 years of development
          history—must be entirely reimplemented on top of the JavaScript programming language.  Don't worry, though; we're
          dedicated to rolling out regular updates to make NetLogo Web the best we can.
          <br><br>
          In order to play with NetLogo Web, you can check it out <a href=""""),_display_(/*17.77*/routes/*17.83*/.Local.tortoise()),format.raw/*17.100*/("""">here</a>.  If you're
          interested in creating NetLogo Web activities that are especially easy to distribute, and that don't require any
          connections to our server, look no further than <a href=""""),_display_(/*19.69*/routes/*19.75*/.Local.createStandaloneTortoise()),format.raw/*19.108*/("""">the "Create
          Standalone" tool</a>, which yields webpages that can be saved through any browser's webpage-saving functionality
          (usually accessed through something like "File" => "Save page as...").
          <br><br>
          To share the saved model, simply distribute the HTML file via your favorite file distribution method (e.g. e-mail,
          web server, flash drive), and users can then open it directly with their browsers—even without an active internet
          connection!
          <br><br>
          The major caveat with this tool right now is that the savable pages lack a Command Center, but we plan to address
          that soon.
          <br><br><br><br>
          Please note: NetLogo Web is still very much an evolving software package that strives to live up to the legacy of
          NetLogo, while simultaneously growing in  its own direction.  Consequently, NetLogo Web currently lacks many of
          the features and language primitives that you would otherwise find in the desktop version of NetLogo.  We ask that
          you bear with us as we work to bring your favorite features into the browser.
          <br><br>
          Also, it is worth noting that the performance of NetLogo Web may vary across browsers.  If you are facing performance
          problems, the best solution for the time being might be to try running your model in a different browser.  We plan to
          eventually make NetLogo Web work great in <i>all</i> major browsers.  It's simply a matter of time and resources.
          <br><br>
          If you run into any problems with NetLogo Web, please feel free to
          <a href="https://github.com/NetLogo/Galapagos/issues/new">open a ticket with us on GitHub</a>.
          <br><br><br><br>
          <i>Much of the funding for NetLogo Web came from National Science Foundation grant number IIS-1147621. Furthermore, the
          CCL gratefully acknowledges two decades of generous support for our NetLogo work. Much of the support over the years came
          from the National Science Foundation -- grant numbers REC-9814682 and REC-0126227, with further support from REC-0003285,
          REC-0115699, DRL-0196044, CCF-ITR-0326542, DRL-REC/ROLE-0440113, SBE-0624318, EEC-0648316, IIS-0713619, DRL-RED-9552950,
          DRL-REC-9632612, DRL-DRK12-1020101, IIS-1441552, CNS-1441016, CNS-1441041, IIS-1438813, and REC-1343873. Yet more support
          was provided by the Spencer Foundation, Texas Instruments, the Brady Fund, and the Northwestern Institute on Complex
          Systems.
          <br><br>
          Any opinions, findings, and conclusions or recommendations expressed in this material are those of the author(s) and do
          not necessarily reflect the views of the National Science Foundation.</i>
        </div>

        <div class="rounded flex1" style="font-size: 20px;">
          <div class="spacious-entry" style="font-weight: bold; color: white; background-color: #343434; border: 3px solid #343434; border-bottom: 0; border-top-right-radius: 10px; border-top-left-radius: 10px;">Quick Links</div>
          <ul style="list-style-type: none; margin: -3px 0 0 0; padding-top: 8px; padding-bottom: 8px; color: #343434;
              border: 3px solid  #343434; border-bottom-right-radius: 10px; border-bottom-left-radius: 10px;">
            <li class="spacious-entry"><a href=""""),_display_(/*58.50*/routes/*58.56*/.Local.tortoise()),format.raw/*58.73*/("""">Tortoise</a></li>
            <li class="spacious-entry"><a href=""""),_display_(/*59.50*/routes/*59.56*/.Local.createStandaloneTortoise()),format.raw/*59.89*/("""">Savable Tortoise Page Generator</a></li>
          </ul>
        </div>

      </div>
    </div>

""")))}),format.raw/*66.2*/("""

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 06 15:48:04 UTC 2015
                  SOURCE: /home/ubuntu/TFIA/Galapagos/app/views/index.scala.html
                  HASH: df5e236bf165895dfd7d960d40fc8e2e98ff5a87
                  MATRIX: 580->1|592->6|615->21|654->23|686->29|1990->1306|2005->1312|2044->1329|2285->1543|2300->1549|2355->1582|5789->4989|5804->4995|5842->5012|5938->5081|5953->5087|6007->5120|6138->5221
                  LINES: 22->1|22->1|22->1|22->1|24->3|38->17|38->17|38->17|40->19|40->19|40->19|79->58|79->58|79->58|80->59|80->59|80->59|87->66
                  -- GENERATED --
              */
          