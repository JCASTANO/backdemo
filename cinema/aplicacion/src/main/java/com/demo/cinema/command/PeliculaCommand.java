
package com.demo.cinema.command;

import java.util.Date;


public class PeliculaCommand {

	private String titulo;
	private Date fechaEstreno;
	private String genero;

	public PeliculaCommand(String titulo, Date fechaEstreno, String genero) {
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.genero = genero;
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
