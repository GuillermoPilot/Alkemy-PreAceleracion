package com.peliculas.Alkemy.Services.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculas.Alkemy.DTO.PersonajeBasicDTO;
import com.peliculas.Alkemy.DTO.PersonajeDTO;
import com.peliculas.Alkemy.DTO.PersonajeFiltersDTO;
import com.peliculas.Alkemy.Entities.Personaje;
import com.peliculas.Alkemy.Mappers.PersonajeMapper;
import com.peliculas.Alkemy.Repositories.PersonajeRepository;
import com.peliculas.Alkemy.Services.PersonajeService;

import specifications.PersonajeSpecification;

@Service
public class PersonajeServiceImpl implements PersonajeService {

	@Autowired
	private PersonajeRepository repo;

	@Autowired
	private PersonajeMapper mapper;

	@Autowired
	private PersonajeSpecification personajeSpecification;

	public List<PersonajeBasicDTO> getAll() {
		List<Personaje> personajes = repo.findAll();
		List<PersonajeBasicDTO> dtos = mapper.listEntity2ListDTOBasic(personajes);
		return dtos;
	}

	public PersonajeDTO save(PersonajeDTO dto) {
		Personaje entity = mapper.DTO2Entity(dto);
		Personaje entitySaved = repo.save(entity);
		PersonajeDTO result = mapper.Entity2DTO(entitySaved);
		return result;
	}

	public PersonajeDTO edit(PersonajeDTO dto, String id) {

		Optional<Personaje> opt = repo.findById(id);
		Personaje entity = new Personaje();
		PersonajeDTO result = new PersonajeDTO();
		if (opt.isPresent()) {
			entity = opt.get();
			String idBackup = entity.getId();
			entity = mapper.DTO2Entity(dto);
			entity.setId(idBackup);
			repo.save(entity);
		}

		result = mapper.Entity2DTO(entity);

		return result;
	}

	public void delete(String id) {
		repo.deleteById(id);

	}

	public List<PersonajeDTO> getByFilters(String nombre, Integer edad, Set<String> movies) {
		PersonajeFiltersDTO filtersDTO = new PersonajeFiltersDTO(nombre, edad, movies);
		List<Personaje> entities = repo.findAll(personajeSpecification.getByFilters(filtersDTO));
		List<PersonajeDTO> dtos = mapper.listEntity2ListDTO(entities);
		return dtos;
	}

	public List<PersonajeDTO> fullDetails() {
		List<PersonajeDTO> dtos = mapper.listEntity2ListDTO(repo.findAll());
		return dtos;
	}

}
