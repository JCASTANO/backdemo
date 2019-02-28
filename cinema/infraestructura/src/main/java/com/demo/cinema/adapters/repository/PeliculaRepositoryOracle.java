package com.demo.cinema.adapters.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.adapters.mapper.PeliculaMapper;
import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.port.PeliculaRepository;

@Component
public class PeliculaRepositoryOracle implements PeliculaRepository {
	
	@Autowired
	private PeliculaRepositoryData peliculaRepositoryData;
	
	@Autowired
	private PeliculaMapper peliculaMapper;

	@Override
	public Collection<Pelicula> findAll() {
		return this.peliculaMapper.mapDomain(peliculaRepositoryData.findAll());
	}

	@Override
	public void save(Pelicula pelicula) {
		this.peliculaRepositoryData.save(this.peliculaMapper.mapEntity(pelicula));
	}
}
