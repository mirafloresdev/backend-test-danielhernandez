package com.davivienda.evaluacion.controller;

import com.davivienda.evaluacion.model.ActividadEconomica;
import com.davivienda.evaluacion.service.ActividadEconomicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actividades-economicas")
public class ActividadEconomicaController {
    @Autowired
    private ActividadEconomicaService actividadEconomicaService;

    @GetMapping
    public ResponseEntity<List<ActividadEconomica>> getAllActividadesEconomicas() {
        List<ActividadEconomica> actividades = actividadEconomicaService.findAll();
        return ResponseEntity.ok(actividades);
    }
}
