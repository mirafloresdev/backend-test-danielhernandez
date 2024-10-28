package com.davivienda.evaluacion.controller;

import com.davivienda.evaluacion.model.EstadoCivil;
import com.davivienda.evaluacion.model.Persona;
import com.davivienda.evaluacion.service.EstadoCivilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadoCivil")
public class EstadoCivilController {

    @Autowired
    private EstadoCivilService estadoCivilService;

    @GetMapping
    public ResponseEntity<List<EstadoCivil>> getAllEstadoCivil() {
        return ResponseEntity.ok(estadoCivilService.findAllEstadosCivil());
    }
}
