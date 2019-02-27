package com.demo.cinema.exception;

public class UserAlreadyExistsException extends RuntimeException {
	private static final long serialVersionUID = -8658774596384384742L;

	public UserAlreadyExistsException(final String email) {
		super(email);
	}
}
