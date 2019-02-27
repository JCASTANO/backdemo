package com.demo.cinema.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author jose.lozano
 *
 */
public class Pelicula implements Serializable {
	
	
	// TODO : dejar solo get - mirar el tema de seriablizable
	
	private static final long serialVersionUID = 2790704236408771530L;

	private Integer id;

	private String titulo;

	private Date fechaEstreno;

	private String genero;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
