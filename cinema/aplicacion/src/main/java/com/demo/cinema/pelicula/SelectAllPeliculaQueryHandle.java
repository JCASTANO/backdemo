package com.demo.cinema.pelicula;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.QueryHandleInterface;
import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.port.PeliculaRepository;

@Component
public class SelectAllPeliculaQueryHandle implements QueryHandleInterface<PeliculaQuery, Collection<Pelicula>> {

    @Autowired
    private PeliculaRepository repository;


    @Override
    public Collection<Pelicula> handle(PeliculaQuery query) {
    	return this.repository.findAll();
    }
}
