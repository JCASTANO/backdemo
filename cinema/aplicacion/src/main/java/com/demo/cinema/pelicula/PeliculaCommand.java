
package com.demo.cinema.pelicula;

import java.sql.Date;


public class PeliculaCommand {

	private String id;
	private String titulo;
	private Date fechaEstreno;
	private String genero;



	public PeliculaCommand(String id, String titulo, Date fechaEstreno, String genero) {
		this.id = id;
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.genero = genero;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
