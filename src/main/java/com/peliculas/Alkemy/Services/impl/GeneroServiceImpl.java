package com.peliculas.Alkemy.Services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.peliculas.Alkemy.DTO.GeneroDTO;
import com.peliculas.Alkemy.Entities.Genero;
import com.peliculas.Alkemy.Mappers.GeneroMapper;
import com.peliculas.Alkemy.Repositories.GeneroRepository;
import com.peliculas.Alkemy.Services.GeneroService;

public class GeneroServiceImpl implements GeneroService{
	
	@Autowired
	private GeneroMapper mapper;
	
	@Autowired
	private GeneroRepository repo;
	
	public GeneroDTO save(GeneroDTO dto) {
		Genero genero = mapper.generoDTO2Entity(dto);	
		Genero generoSaved = repo.save(genero);		
		GeneroDTO result = mapper.GeneroEntity2DTO(generoSaved);
		return result;
	}

}
