package com.peliculas.Alkemy.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.peliculas.Alkemy.Entities.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, String>{

}
