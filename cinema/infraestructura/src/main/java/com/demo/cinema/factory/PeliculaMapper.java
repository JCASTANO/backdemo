package com.demo.cinema.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.demo.cinema.entity.ModelPelicula;
import com.demo.cinema.entity.Pelicula;
import com.demo.cinema.port.PeliculaMapperInterface;


@Component
public final class PeliculaMapper implements PeliculaMapperInterface {

	@Override
	public Optional<Collection<Pelicula>> toPelicula(Iterable<?> listaEntidad) {
		
		List<Pelicula> listaPelicula = new ArrayList<>();
		
		listaEntidad.forEach(peliculaEntity -> {
			Pelicula pelicula = new Pelicula();
			pelicula.setId(((ModelPelicula)peliculaEntity).getId());
			pelicula.setTitulo(((ModelPelicula)peliculaEntity).getTitulo());
			pelicula.setGenero(((ModelPelicula)peliculaEntity).getGenero());
			pelicula.setFechaEstreno(((ModelPelicula)peliculaEntity).getFechaEstreno());
			
			listaPelicula.add(pelicula);
		});
		
		return Optional.of(listaPelicula);
	}

}
