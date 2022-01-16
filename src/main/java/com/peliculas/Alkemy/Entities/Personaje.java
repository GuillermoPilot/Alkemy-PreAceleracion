package com.peliculas.Alkemy.Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personajes")
@Getter
@Setter
public class Personaje {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@OneToOne
	private Imagen imagen;
	
	private String nombre;
	private Integer edad;
	private Double peso;
	private String historia;
	
	@ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
	private List<Pelicula> peliculas = new ArrayList<>();

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	
}
