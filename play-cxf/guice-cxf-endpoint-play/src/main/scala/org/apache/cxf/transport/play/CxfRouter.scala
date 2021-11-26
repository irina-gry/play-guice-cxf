package org.apache.cxf.transport.play

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._

import javax.inject.Inject

class CxfRouter @Inject()(controller: CxfController) extends SimpleRouter {
  override def routes: Routes = {
    case GET(p"/$path") => controller.handleStrict(path)
    case POST(p"/$path") => controller.handleStrict(path)
  }
}
