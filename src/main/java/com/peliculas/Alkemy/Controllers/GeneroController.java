package com.peliculas.Alkemy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.Alkemy.DTO.GeneroDTO;
import com.peliculas.Alkemy.Services.GeneroService;

@RestController
@RequestMapping("/genero")
public class GeneroController {

	@Autowired
	private GeneroService service;
	
	@PostMapping("/save")
	public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero) {
		GeneroDTO generoGuardado = service.save(genero);
		return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
	}
	
}
