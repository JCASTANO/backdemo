package com.demo.cinema.adapters.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.cinema.adapters.entity.EntityPelicula;
import com.demo.cinema.entity.Pelicula;


@Component
public final class PeliculaMapper {

	public Collection<Pelicula> toPelicula(Iterable<EntityPelicula> listaEntidad) {
		
		List<Pelicula> listaPelicula = new ArrayList<>();
		
		listaEntidad.forEach(peliculaEntity -> {
			Pelicula pelicula = new Pelicula();
			pelicula.setId(((EntityPelicula)peliculaEntity).getId());
			pelicula.setTitulo(((EntityPelicula)peliculaEntity).getTitulo());
			pelicula.setGenero(((EntityPelicula)peliculaEntity).getGenero());
			pelicula.setFechaEstreno(((EntityPelicula)peliculaEntity).getFechaEstreno());
			
			listaPelicula.add(pelicula);
		});
		
		return listaPelicula;
	}

}
