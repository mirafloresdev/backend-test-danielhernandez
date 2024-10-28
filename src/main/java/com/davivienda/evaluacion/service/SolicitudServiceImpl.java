package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.Persona;
import com.davivienda.evaluacion.model.Solicitud;
import com.davivienda.evaluacion.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    public List<Solicitud> findAllSolicitudes() {
        return solicitudRepository.findAll();
    }

    public Optional<Solicitud> findSolicitudById(Long id) {
        return solicitudRepository.findById(id);
    }


    public Solicitud saveSolicitud(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    public void deleteSolicitud(Long id) {
        solicitudRepository.deleteById(id);
    }

    @Override
    public List<Solicitud> findSolicitudesByPersonaId(Long personaId) {
        return solicitudRepository.findByPersonaId(personaId);
    }

}
