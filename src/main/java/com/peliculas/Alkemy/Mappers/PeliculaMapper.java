package com.peliculas.Alkemy.Mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
import com.peliculas.Alkemy.DTO.PeliculaDTO;
import com.peliculas.Alkemy.Entities.Pelicula;

@Component
public class PeliculaMapper {

	public PeliculaDTO entity2DTO(Pelicula movie) {
		PeliculaDTO dto = new PeliculaDTO();
		dto.setCalificacion(movie.getCalificacion());
		dto.setId(movie.getId());
		dto.setPersonajes(movie.getPersonajes());
		dto.setImagen(movie.getImagen());
		dto.setFechaCreacion(movie.getFechaCreacion());
		dto.setTitulo(movie.getTitulo());
		return dto;
	}

	public Pelicula DTO2Entity(PeliculaDTO dto) {
		Pelicula movie = new Pelicula();
		movie.setCalificacion(dto.getCalificacion());
		movie.setPersonajes(dto.getPersonajes());
		movie.setImagen(dto.getImagen());
		movie.setFechaCreacion(dto.getFechaCreacion());
		movie.setTitulo(dto.getTitulo());
		return movie;
	}

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
