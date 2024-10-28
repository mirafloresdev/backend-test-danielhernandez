package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> findAllPersonas();
    Optional<Persona> findPersonaById(Long id);
    Persona savePersona(Persona persona);
    void deletePersona(Long id);
    Persona update(Persona persona);

}
