package com.peliculas.Alkemy.Controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.Alkemy.DTO.PersonajeBasicDTO;
import com.peliculas.Alkemy.DTO.PersonajeDTO;
import com.peliculas.Alkemy.Services.PersonajeService;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

	@Autowired
	private PersonajeService service;

	@GetMapping
	public ResponseEntity<List<PersonajeBasicDTO>> getAll() {
		List<PersonajeBasicDTO> characters = service.getAll();
		return ResponseEntity.ok().body(characters);
	}

	@GetMapping
	public ResponseEntity<List<PersonajeDTO>> getDetailsbyFilters(@RequestParam(required = false) String nombre,
			@RequestParam(required = false) Integer edad, @RequestParam(required = false) Set<String> movies) {
		List<PersonajeDTO> characters = service.getByFilters(nombre, edad, movies);
		return ResponseEntity.ok().body(characters);

	}

	@GetMapping("/fullDetails")
	public ResponseEntity<List<PersonajeDTO>> getFullDetails() {
		List<PersonajeDTO> dtos = service.fullDetails();
		return ResponseEntity.ok().body(dtos);
	}

	@PostMapping("/save")
	public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO dto) {
		PersonajeDTO personajeSaved = service.save(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(personajeSaved);
	}

	@PutMapping("/edit/{id}")
	ResponseEntity<PersonajeDTO> edit(@RequestBody PersonajeDTO dto, String id) {
		PersonajeDTO personajeEdited = service.edit(dto, id);
		return ResponseEntity.ok().body(personajeEdited);
	}

}
