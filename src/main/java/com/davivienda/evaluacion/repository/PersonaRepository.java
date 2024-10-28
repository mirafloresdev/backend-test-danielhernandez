package com.davivienda.evaluacion.repository;

import com.davivienda.evaluacion.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
