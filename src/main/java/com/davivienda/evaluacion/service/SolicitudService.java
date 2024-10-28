package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.Persona;
import com.davivienda.evaluacion.model.Solicitud;

import java.util.List;
import java.util.Optional;

public interface SolicitudService {
    List<Solicitud> findAllSolicitudes();
    Optional<Solicitud> findSolicitudById(Long id);
    Solicitud saveSolicitud(Solicitud solicitud);
    void deleteSolicitud(Long id);
    List<Solicitud> findSolicitudesByPersonaId(Long personaId);
}
