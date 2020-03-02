package io.functional.patterns.tinyweb.greetingapp;

import io.functional.patterns.tinyweb.Filter;
import io.functional.patterns.tinyweb.HttpRequest;

public class LoggingFilter implements Filter {

	@Override
	public HttpRequest doFilter(HttpRequest request) {
		System.out.println("In Logging Filter - request for path: " + request.getPath());
		
		return request;

	}

}
