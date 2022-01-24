package com.peliculas.Alkemy.Services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
import com.peliculas.Alkemy.DTO.PeliculaDTO;
import com.peliculas.Alkemy.DTO.PersonajeDTO;
import com.peliculas.Alkemy.Entities.Pelicula;
import com.peliculas.Alkemy.Entities.Personaje;
import com.peliculas.Alkemy.Mappers.PeliculaMapper;
import com.peliculas.Alkemy.Repositories.PeliculaRepository;
import com.peliculas.Alkemy.Services.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaRepository repo;

	@Autowired
	private PeliculaMapper mapper;

	public List<PeliculaBasicDTO> getAll() {
		List<PeliculaBasicDTO> dtos = mapper.listEntity2DTOBasic(repo.findAll());
		return dtos;
	}

	public PeliculaDTO save(PeliculaDTO dto) {
		Pelicula entity = mapper.DTO2Entity(dto);
		Pelicula entitySaved = repo.save(entity);
		PeliculaDTO result = mapper.entity2DTO(entitySaved);
		return result;
	}

	public void delete(String id) {
		repo.deleteById(id);

	}

	public PeliculaDTO edit(PeliculaDTO dto, String id) {

		Optional<Pelicula> opt = repo.findById(id);
		Pelicula entity = new Pelicula();
		PeliculaDTO result = new PeliculaDTO();
		if (opt.isPresent()) {
			entity = opt.get();
			entity = mapper.DTO2Entity(dto);
			repo.save(entity);
		}

		result = mapper.entity2DTO(entity);

		return result;
	}

}
