package com.peliculas.Alkemy.Mappers;

import org.springframework.stereotype.Component;

import com.peliculas.Alkemy.DTO.GeneroDTO;
import com.peliculas.Alkemy.Entities.Genero;

@Component
public class GeneroMapper {

	public Genero generoDTO2Entity(GeneroDTO dto) {

		Genero genero = new Genero();

		genero.setNombre(dto.getNombre());
		genero.setImagen(dto.getImagen());
		genero.setPeliculas(dto.getPeliculas());

		return genero;
	}

	public GeneroDTO GeneroEntity2DTO(Genero entity) {

		GeneroDTO dto = new GeneroDTO();

		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setImagen(entity.getImagen());
		dto.setPeliculas(entity.getPeliculas());
		return dto;
	}

}
