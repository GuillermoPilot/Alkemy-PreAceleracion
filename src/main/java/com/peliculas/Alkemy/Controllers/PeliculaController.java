package com.peliculas.Alkemy.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.Alkemy.DTO.PeliculaBasicDTO;
import com.peliculas.Alkemy.DTO.PeliculaDTO;
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

	@PostMapping("/save")
	public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO dto) {
		PeliculaDTO peliculaSaved = service.save(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(peliculaSaved);
	}

	@PutMapping("/edit/{id}")
	ResponseEntity<PeliculaDTO> edit(@RequestBody PeliculaDTO dto, String id) {
		PeliculaDTO peliculaEdited = service.edit(dto, id);
		return ResponseEntity.ok().body(peliculaEdited);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
