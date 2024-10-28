package com.davivienda.evaluacion.controller;

import com.davivienda.evaluacion.model.Persona;
import com.davivienda.evaluacion.model.Solicitud;
import com.davivienda.evaluacion.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    public ResponseEntity<List<Solicitud>> getAllSolicitudes() {
        return ResponseEntity.ok(solicitudService.findAllSolicitudes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Solicitud> getSolicitudById(@PathVariable Long id) {
        return solicitudService.findSolicitudById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Solicitud> createSolicitud(@RequestBody Solicitud solicitud) {
        Solicitud savedSolicitud = solicitudService.saveSolicitud(solicitud);
        return ResponseEntity.ok(savedSolicitud);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSolicitud(@PathVariable Long id) {
        solicitudService.deleteSolicitud(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/byPersona/{personaId}")
    public ResponseEntity<List<Solicitud>> getSolicitudesByPersonaId(@PathVariable Long personaId) {
        List<Solicitud> solicitudes = solicitudService.findSolicitudesByPersonaId(personaId);
        if (solicitudes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(solicitudes);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Solicitud> updateSolicitud(@PathVariable Long id, @RequestBody Solicitud solicitud) {
        if (!id.equals(solicitud.getIdSolicitud())) {
            return ResponseEntity.badRequest().build();
        }
        Solicitud updateSolicitud = solicitudService.saveSolicitud(solicitud);
        if (updateSolicitud != null) {
            return ResponseEntity.ok(updateSolicitud);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
