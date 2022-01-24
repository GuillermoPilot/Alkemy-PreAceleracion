package com.peliculas.Alkemy.Services;

import java.util.List;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
import com.peliculas.Alkemy.DTO.PeliculaDTO;

public interface PeliculaService {

	List<PeliculaBasicDTO> getAll();

	PeliculaDTO save(PeliculaDTO dto);

	PeliculaDTO edit(PeliculaDTO dto, String id);

	void delete(String id);

}
