package io.functional.patterns.tinyweb;

trait View {

  def render(render: Map[String, List[String]]): String
  
}

class FunctionView(viewRenderer: (Map[String, List[String]]) => String) extends View {
	
  
  def render(model: Map[String, List[String]]) =
    try 
      viewRenderer(model)
    catch {
      case e: Exception => throw new RuntimeException("Error when rendering view", e) 
    }
}