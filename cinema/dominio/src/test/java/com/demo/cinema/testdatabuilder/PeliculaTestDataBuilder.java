package com.demo.cinema.testdatabuilder;

import com.demo.cinema.entity.Pelicula;

public class PeliculaTestDataBuilder{

	private String titulo;
	private String genero;

	public PeliculaTestDataBuilder() {
		this.titulo = "Hulk";
		this.genero = "drama";
	}
	
	public PeliculaTestDataBuilder withTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public PeliculaTestDataBuilder withGenero(String genero) {
		this.genero = genero;
		return this;
	}
	
	public Pelicula build() {
		return new Pelicula(titulo, genero);
	}
}
