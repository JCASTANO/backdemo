package com.demo.cinema.port;

import java.util.Collection;

import com.demo.cinema.entity.Pelicula;

/**
 * repository de Pelicula Model
 * 
 * @author jose.lozano
 *
 */
public interface PeliculaRepository {

	Collection<Pelicula> findAll();

}
