package com.peliculas.Alkemy.Repositories;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.peliculas.Alkemy.Entities.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, String>, JpaSpecificationExecutor<Personaje> {

	List<Personaje> findAll(Specification<Personaje> spec);

}
