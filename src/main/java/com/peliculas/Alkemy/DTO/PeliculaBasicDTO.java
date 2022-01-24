package com.peliculas.Alkemy.DTO;

import java.util.Date;

import com.peliculas.Alkemy.Entities.Imagen;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeliculaBasicDTO {

	private Imagen imagen;
	private Date fechaCreacion;
	private String titulo;

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
