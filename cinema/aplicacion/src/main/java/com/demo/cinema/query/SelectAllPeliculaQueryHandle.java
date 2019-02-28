package com.demo.cinema.query;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.port.PeliculaRepository;

@Component
public class SelectAllPeliculaQueryHandle {

    @Autowired
    private PeliculaRepository repository;


    public Collection<Pelicula> handle() {
    	return this.repository.findAll();
    }
}
