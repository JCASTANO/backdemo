package com.demo.cinema.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.cinema.command.CreatePeliculaCommandHandler;
import com.demo.cinema.command.PeliculaCommand;
import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.query.SelectAllPeliculaQueryHandle;

/**
 * 
 * @author jose.lozano
 *
 */
@RestControllerAdvice
@RestController
@RequestMapping(value="/peliculas")
@CrossOrigin("*")
public class PeliculaController {

	@Autowired
	private SelectAllPeliculaQueryHandle queryHandler;
	
	@Autowired
	private CreatePeliculaCommandHandler commandHandler;
    
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Collection<Pelicula>> select() {
		return new ResponseEntity<>( queryHandler.handle() , HttpStatus.ACCEPTED);
	}	
	
	@PostMapping
	public void save(@RequestBody PeliculaCommand peliculaCommand) {
		this.commandHandler.handler(peliculaCommand);
	}	
}
