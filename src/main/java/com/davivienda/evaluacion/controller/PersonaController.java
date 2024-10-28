package com.davivienda.evaluacion.controller;

import com.davivienda.evaluacion.model.Persona;
import com.davivienda.evaluacion.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;


    @GetMapping
    public ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(personaService.findAllPersonas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable Long id) {
        return personaService.findPersonaById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        Persona savedPersona = personaService.savePersona(persona);
        return ResponseEntity.ok(savedPersona);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        if (!id.equals(persona.getIdPersona())) {
            return ResponseEntity.badRequest().build();
        }
        Persona updatedPersona = personaService.update(persona);
        if (updatedPersona != null) {
            return ResponseEntity.ok(updatedPersona);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
