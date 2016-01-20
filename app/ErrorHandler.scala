import play.api._
import play.api.http.HttpErrorHandler
import play.api.libs.json._
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent.Future

class ErrorHandler extends HttpErrorHandler {

  def onClientError(request: RequestHeader, statusCode: Int, message: String) = {
    if(statusCode == play.api.http.Status.NOT_FOUND) {
      Future.successful(NotFound(views.html.notfoundpage()))
    }
    else{
      Future.successful(
        Status(statusCode)("A client error occurred: " + message)
      )
    }
  }

  def onServerError(request: RequestHeader, exception: Throwable) = {
    Future.successful(
      InternalServerError("Ooups! A server error occurred: " + exception.getMessage)
    )
  }
}
