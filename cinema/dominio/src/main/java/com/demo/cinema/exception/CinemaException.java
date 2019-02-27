package com.demo.cinema.exception;

/**
 * Clase que administra las excepciones logicas que puedan suceder
 * 
 * The Class CreditoDigitalException.
 */
public class CinemaException extends RuntimeException {
	private static final long serialVersionUID = 6759407566706191023L;
	
	private DetailError detalleError;

	public DetailError getDetalleError() {
		return detalleError;
	}

}
