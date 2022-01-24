package com.peliculas.Alkemy.DTO;

import java.util.Set;

public class PersonajeFiltersDTO {

	private String nombre;
	private Integer edad;
	private Set<String> movies;

	public PersonajeFiltersDTO(String nombre, Integer edad, Set<String> movies) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.movies = movies;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Set<String> getMovies() {
		return movies;
	}

	public void setMovies(Set<String> movies) {
		this.movies = movies;
	}

}
