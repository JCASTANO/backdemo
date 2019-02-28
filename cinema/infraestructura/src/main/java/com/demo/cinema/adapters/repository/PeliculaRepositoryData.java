package com.demo.cinema.adapters.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.cinema.adapters.entity.EntityPelicula;


/**
 * repository de Pelicula Model
 * 
 * @author jose.lozano
 *
 */
@Repository
public interface PeliculaRepositoryData extends CrudRepository<EntityPelicula, Integer> {

}
