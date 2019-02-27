package com.demo.cinema.pelicula;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.QueryHandleInterface;
import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.port.PeliculaMapperInterface;
import com.demo.cinema.port.PeliculaRepository;

@Component
public class SelectAllPeliculaQueryHandle implements QueryHandleInterface<PeliculaQuery, Collection<Pelicula>> {

    @Autowired
    private PeliculaRepository repository;
    
    @Autowired
    private PeliculaMapperInterface peliculaMapperInterface;


    @Override
    public Collection<Pelicula> handle(PeliculaQuery query) {

    	Optional<Collection<Pelicula>> listaPelicula = peliculaMapperInterface.toPelicula(this.repository.findAll());
    	
        return listaPelicula.orElse(Collections.emptyList());

    }
}
