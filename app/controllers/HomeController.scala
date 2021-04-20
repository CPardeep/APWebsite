package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def home = Action {
    Ok(views.html.home("Your new application is ready."))
  }

}
