package com.peliculas.Alkemy.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculas.Alkemy.Entities.Imagen;

@Repository
public interface ImagenReposotory extends JpaRepository<Imagen, String>{

}
