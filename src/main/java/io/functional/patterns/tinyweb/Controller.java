package io.functional.patterns.tinyweb;

public interface Controller {
	public HttpResponse handleRequest(HttpRequest httpRequest);
}
