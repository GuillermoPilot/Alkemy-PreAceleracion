package com.peliculas.Alkemy.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculas.Alkemy.Entities.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, String>{

}
