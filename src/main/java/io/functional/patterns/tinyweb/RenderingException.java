package io.functional.patterns.tinyweb;

public class RenderingException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RenderingException(Exception exception) {
		super(exception);
	}

}
