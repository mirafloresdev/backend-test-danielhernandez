package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.EstadoCivil;
import com.davivienda.evaluacion.model.Solicitud;
import com.davivienda.evaluacion.repository.EstadoCivilRepository;
import com.davivienda.evaluacion.repository.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoCivilServiceImpl implements EstadoCivilService {


    @Autowired
    private EstadoCivilRepository estadoCivilRepository;



    @Override
    public List<EstadoCivil> findAllEstadosCivil() {
        return estadoCivilRepository.findAll();
    }
}
