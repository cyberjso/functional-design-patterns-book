package io.functional.patterns.tinyweb;

public interface Filter {
	public HttpRequest doFilter(HttpRequest request);
}
