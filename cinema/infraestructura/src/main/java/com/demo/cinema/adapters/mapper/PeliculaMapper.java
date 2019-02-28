package com.demo.cinema.adapters.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.cinema.adapters.entity.EntityPelicula;
import com.demo.cinema.entity.Pelicula;


@Component
public final class PeliculaMapper {

	public Collection<Pelicula> mapDomain(Iterable<EntityPelicula> listaEntidad) {
		
		List<Pelicula> listaPelicula = new ArrayList<>();
		
		listaEntidad.forEach(peliculaEntity -> {
			Pelicula pelicula = new Pelicula(peliculaEntity.getId(), 
											 peliculaEntity.getTitulo(), 
											 peliculaEntity.getFechaEstreno(), 
											 peliculaEntity.getGenero());
			
			listaPelicula.add(pelicula);
		});
		
		return listaPelicula;
	}
	
	public EntityPelicula mapEntity(Pelicula pelicula) {
		
		EntityPelicula entityPelicula = new EntityPelicula();
		entityPelicula.setGenero(pelicula.getGenero());
		entityPelicula.setTitulo(pelicula.getTitulo());
		return entityPelicula;
	}

}
