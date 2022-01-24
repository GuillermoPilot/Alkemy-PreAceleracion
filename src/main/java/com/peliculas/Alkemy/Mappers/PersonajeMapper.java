package com.peliculas.Alkemy.Mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import com.peliculas.Alkemy.DTO.PersonajeBasicDTO;
import com.peliculas.Alkemy.DTO.PersonajeDTO;
import com.peliculas.Alkemy.Entities.Personaje;

@Component
public class PersonajeMapper {

	public PersonajeDTO Entity2DTO(Personaje entity) {
		PersonajeDTO dto = new PersonajeDTO();
		dto.setId(entity.getId());
		dto.setHistoria(entity.getHistoria());
		dto.setEdad(entity.getEdad());
		dto.setPeso(entity.getPeso());
		dto.setPeliculas(entity.getPeliculas());
		dto.setImagen(entity.getImagen());
		dto.setNombre(entity.getNombre());
		return dto;
	}

	public Personaje DTO2Entity(PersonajeDTO dto) {
		Personaje entity = new Personaje();
		entity.setHistoria(dto.getHistoria());
		entity.setEdad(dto.getEdad());
		entity.setPeso(dto.getPeso());
		entity.setPeliculas(dto.getPeliculas());
		entity.setImagen(dto.getImagen());
		entity.setNombre(dto.getNombre());
		return entity;
	}

	public PersonajeBasicDTO Entity2DTOBasic(Personaje entity) {
		PersonajeBasicDTO dto = new PersonajeBasicDTO();
		dto.setImagen(entity.getImagen());
		dto.setNombre(entity.getNombre());
		return dto;
	}

	public List<PersonajeBasicDTO> listEntity2ListDTOBasic(List<Personaje> list) {
		List<PersonajeBasicDTO> dtos = new ArrayList<PersonajeBasicDTO>();
		for (Personaje character : list) {
			PersonajeBasicDTO dto = new PersonajeBasicDTO();
			dtos.add(Entity2DTOBasic(character));
		}
		return dtos;

	}

	public List<PersonajeDTO> listEntity2ListDTO(List<Personaje> list) {
		List<PersonajeDTO> dtos = new ArrayList<PersonajeDTO>();
		for (Personaje character : list) {
			dtos.add(Entity2DTO(character));
		}
		return dtos;

	}

}
