package com.demo.cinema.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


/**
 * The Class ApiExceptionHandle.
 *
 * @version 1.0
 * @since 1.0.0
 */
@ControllerAdvice
public class ApiExceptionHandle {

	/**
	 * Handler generic exception.
	 *
	 */
	@ExceptionHandler(CinemaException.class)
	public final ResponseEntity<Object> handlerGenericException( final CinemaException exception, final WebRequest request ) {
		return new ResponseEntity<>( exception.getMessage(), HttpStatus.NOT_ACCEPTABLE); 
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handlerGenericException( final Exception exception, final WebRequest request ) {
		return new ResponseEntity<>( "Ocurrió un error interno", HttpStatus.INTERNAL_SERVER_ERROR); 
	}
}