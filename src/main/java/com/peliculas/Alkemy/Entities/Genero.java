package com.peliculas.Alkemy.Entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "genero")
@Getter
@Setter
public class Genero {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String nombre;
	
	@OneToOne
	private Imagen imagen;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "peliculas_id", insertable = false, updatable = false)
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
		Genero other = (Genero) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

	
}
