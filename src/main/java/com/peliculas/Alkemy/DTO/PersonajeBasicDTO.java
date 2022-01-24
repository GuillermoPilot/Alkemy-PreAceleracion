package com.peliculas.Alkemy.DTO;

import com.peliculas.Alkemy.Entities.Imagen;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeBasicDTO {

	private String nombre;
	private Imagen imagen;
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
	
	
}
