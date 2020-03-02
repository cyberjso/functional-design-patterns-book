package io.functional.patterns.tinyweb

trait Controller {
  
  def handleRequest(httpRequest: HttpRequest): HttpResponse
  
}

class FunctionController (view: View, doRequest: (HttpRequest) => Map[String, List[String]]) extends Controller  {

  def handleRequest(request: HttpRequest): HttpResponse = {
    var responseCode = 200
    var responseBody =  ""
    
    try {
      val model = doRequest(request)
      responseBody = view.render(model)
      
      HttpResponse(responseBody, responseCode)  
    } catch {
      case e: Exception =>       HttpResponse(responseBody, 500)
    }
  }
  
}