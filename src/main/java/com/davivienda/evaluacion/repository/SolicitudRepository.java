package com.davivienda.evaluacion.repository;

import com.davivienda.evaluacion.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {

    @Query("SELECT s FROM Solicitud s WHERE s.persona.idPersona = :personaId")
    List<Solicitud> findByPersonaId(Long personaId);
}
