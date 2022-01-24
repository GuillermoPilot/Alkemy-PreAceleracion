package com.peliculas.Alkemy.Services;

import java.util.List;
import java.util.Set;

import com.peliculas.Alkemy.DTO.PersonajeBasicDTO;
import com.peliculas.Alkemy.DTO.PersonajeDTO;

public interface PersonajeService {

	List<PersonajeBasicDTO> getAll();

	PersonajeDTO save(PersonajeDTO dto);

	PersonajeDTO edit(PersonajeDTO dto, String id);

	List<PersonajeDTO> fullDetails();

	List<PersonajeDTO> getByFilters(String nombre, Integer edad, Set<String> movies);

	void delete(String id);

}
