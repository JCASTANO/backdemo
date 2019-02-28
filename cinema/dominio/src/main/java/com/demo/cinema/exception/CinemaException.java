package com.demo.cinema.exception;


public class CinemaException extends RuntimeException {
	private static final long serialVersionUID = 6759407566706191023L;
	
	public CinemaException(String mensaje) {
		super(mensaje);
	}
}
