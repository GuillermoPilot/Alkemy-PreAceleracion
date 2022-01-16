package com.peliculas.Alkemy.Entities;

import java.util.Objects;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	private String usuario;
	private String clave;
	private String mail;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, mail, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id) && Objects.equals(mail, other.mail)
				&& Objects.equals(usuario, other.usuario);
	}
	
	
	
}
