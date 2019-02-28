package com.demo.cinema.entity;

import java.util.Date;

public class Pelicula{

	private Integer id;
	private String titulo;
	private Date fechaEstreno;
	private String genero;

	public Pelicula(Integer id, String titulo, Date fechaEstreno, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.genero = genero;
	}

	public Integer getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public String getGenero() {
		return genero;
	}

	

}
