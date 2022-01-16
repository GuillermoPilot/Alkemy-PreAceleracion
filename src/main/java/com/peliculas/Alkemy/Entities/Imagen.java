package com.peliculas.Alkemy.Entities;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "imagen")
@Getter
@Setter
public class Imagen {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String nombre;
	private String mime;

	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] contenido;
	
}
