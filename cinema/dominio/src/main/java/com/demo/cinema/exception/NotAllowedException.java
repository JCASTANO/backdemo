package com.demo.cinema.exception;

public class NotAllowedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public NotAllowedException(final String message) {
		super(message);
	}
}
