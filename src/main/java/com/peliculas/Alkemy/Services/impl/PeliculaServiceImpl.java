package com.peliculas.Alkemy.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
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

}
