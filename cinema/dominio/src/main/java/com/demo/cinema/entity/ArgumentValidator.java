package com.demo.cinema.entity;

import com.demo.cinema.exception.CinemaException;

public class ArgumentValidator {

	private ArgumentValidator() {}
	
	public static void validateRequired(Object value,String message) {
		if(value == null) {
			throw new CinemaException(message);
		}
	}
}
