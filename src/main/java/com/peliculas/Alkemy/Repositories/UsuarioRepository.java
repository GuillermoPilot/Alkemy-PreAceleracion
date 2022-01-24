package com.peliculas.Alkemy.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculas.Alkemy.Entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
