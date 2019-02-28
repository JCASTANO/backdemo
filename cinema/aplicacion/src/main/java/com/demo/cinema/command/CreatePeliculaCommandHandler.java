package com.demo.cinema.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.port.PeliculaRepository;

@Component
public class CreatePeliculaCommandHandler {

	@Autowired
	private PeliculaRepository repository;
	
	public void handler(PeliculaCommand peliculaCommand) {
		this.repository.save(new Pelicula(peliculaCommand.getTitulo(), peliculaCommand.getFechaEstreno(), peliculaCommand.getGenero()));
	}
}
