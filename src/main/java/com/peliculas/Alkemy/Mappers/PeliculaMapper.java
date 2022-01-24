package com.peliculas.Alkemy.Mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
import com.peliculas.Alkemy.Entities.Pelicula;

@Component
public class PeliculaMapper {

	public PeliculaBasicDTO entity2DTOBasic(Pelicula movie) {
		PeliculaBasicDTO dto = new PeliculaBasicDTO();
		dto.setImagen(movie.getImagen());
		dto.setFechaCreacion(movie.getFechaCreacion());
		dto.setTitulo(movie.getTitulo());
		return dto;

	}

	public List<PeliculaBasicDTO> listEntity2DTOBasic(List<Pelicula> movies) {
		List<PeliculaBasicDTO> dtos = new ArrayList<PeliculaBasicDTO>();
		for (Pelicula movie : movies) {
			PeliculaBasicDTO dto = new PeliculaBasicDTO();
			dto = entity2DTOBasic(movie);
			dtos.add(dto);
		}

		return dtos;
	}
}
