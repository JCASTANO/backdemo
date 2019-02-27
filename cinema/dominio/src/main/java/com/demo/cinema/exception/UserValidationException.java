package com.demo.cinema.exception;

public class UserValidationException extends RuntimeException {
	private static final long serialVersionUID = -7381230398248793960L;

	public UserValidationException(final String message) {
		super(message);
	}
}
