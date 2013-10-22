package controllers

import akka.actor._

import play.api._
import play.api.mvc._
import play.api.libs.json._

import play.api.Play.current

object Application extends Controller {
  def main(url: String) = Action {
    Ok(views.html.templates.main(play.api.templates.Html("")))
  }

  def index = Action {
    Ok(views.html.index())
  }

  def viewNotFound(url: String) = Action {
    NotFound
  }

  def apiNotFound(url: String) = Action {
    NotFound
  }
}