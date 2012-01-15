package code
package snippet

import net.liftweb._
import util._
import Helpers._
import http._
import js.JsCmds._

object SayHello {
  def render = {

    "button [onclick]" #> 
    SHtml.ajaxInvoke(() => {
      Alert("Hello World")
    })
  }
}
