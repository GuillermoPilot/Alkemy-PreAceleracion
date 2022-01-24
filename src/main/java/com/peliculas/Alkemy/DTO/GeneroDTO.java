package com.peliculas.Alkemy.DTO;

import java.util.List;

import com.peliculas.Alkemy.Entities.Imagen;
import com.peliculas.Alkemy.Entities.Pelicula;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneroDTO {

	private String id;
	private String nombre;
	private Imagen imagen;
	private List<Pelicula> peliculas;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}
