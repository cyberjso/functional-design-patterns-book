package io.functional.patterns.tinyweb;

public class ControllerException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private int statusCode;
	
	public ControllerException(Exception e) {
		super(e);
	}
	
	public int getStatusCode() {
		return statusCode;
	}

}
