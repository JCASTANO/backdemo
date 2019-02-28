package com.demo.cinema.entity;

import org.junit.Test;

import com.demo.cinema.BasePrueba;
import com.demo.cinema.exception.CinemaException;
import com.demo.cinema.testdatabuilder.PeliculaTestDataBuilder;

public class PeliculaTest {

	@Test
	public void tituloObligatorio() {
		//Arrange
		PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder().withTitulo(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> peliculaTestDataBuilder.build(),CinemaException.class,"El titulo es obligatorio.");
	}
	
	@Test
	public void generoObligatorio() {
		//Arrange
		PeliculaTestDataBuilder peliculaTestDataBuilder = new PeliculaTestDataBuilder().withGenero(null);
		//Act - Assert
		BasePrueba.assertThrows(() -> peliculaTestDataBuilder.build(),CinemaException.class,"El genero es obligatorio.");
	}
}
