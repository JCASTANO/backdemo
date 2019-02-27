package com.demo.cinema.port;

import java.util.Collection;
import java.util.Optional;

import com.demo.cinema.entity.Pelicula;


// podria ir a capa de infraestructura.

public interface PeliculaMapperInterface {

	public Optional<Collection<Pelicula>> toPelicula(Iterable<?> listaEntidad);
}