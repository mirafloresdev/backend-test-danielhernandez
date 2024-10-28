package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.ActividadEconomica;
import com.davivienda.evaluacion.repository.ActividadEconomicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadEconomicaServiceImpl implements ActividadEconomicaService {
    @Autowired
    private ActividadEconomicaRepository actividadEconomicaRepository;

    @Override
    public List<ActividadEconomica> findAll() {
        return actividadEconomicaRepository.findAll();
    }
}
