package com.demo.cinema.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.port.PeliculaRepository;

@Component
public class PeliculaRepositoryOracle implements PeliculaRepository {
	
	@Autowired
	private PeliculaRepositoryData peliculaRepositoryData;

	@Override
	public Iterable<?> findAll() {
		return peliculaRepositoryData.findAll();
	}

}
