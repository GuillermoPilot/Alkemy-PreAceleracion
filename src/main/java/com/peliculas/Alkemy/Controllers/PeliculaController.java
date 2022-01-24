package com.peliculas.Alkemy.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
import com.peliculas.Alkemy.Services.PeliculaService;

@RestController
@RequestMapping("movies")
public class PeliculaController {

	@Autowired
	private PeliculaService service;

	@GetMapping
	public ResponseEntity<List<PeliculaBasicDTO>> getAll() {
		List<PeliculaBasicDTO> dtos = service.getAll();
		return ResponseEntity.ok().body(dtos);
	}

}
