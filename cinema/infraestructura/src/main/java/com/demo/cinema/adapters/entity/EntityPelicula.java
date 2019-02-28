package com.demo.cinema.adapters.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pelicula")
public class EntityPelicula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="titulo")
	private String titulo;

	@Column(name="genero")
	private String genero;

	@Column(name="fecha_estreno")
	private Timestamp fechaEstreno;

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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Timestamp getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(Timestamp fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

}