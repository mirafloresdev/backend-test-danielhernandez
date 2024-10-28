package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.Persona;
import com.davivienda.evaluacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAllPersonas() {
        return personaRepository.findAll();
    }

    public Optional<Persona> findPersonaById(Long id) {
        return personaRepository.findById(id);
    }

    public Persona savePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona update(Persona persona) {
        if (persona != null && persona.getIdPersona() != null) {
            boolean exists = personaRepository.existsById(persona.getIdPersona());
            if (exists) {
                return personaRepository.save(persona);
            }
        }
        return null;
    }
}
