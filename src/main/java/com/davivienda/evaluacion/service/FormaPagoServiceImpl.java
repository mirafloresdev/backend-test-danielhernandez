package com.davivienda.evaluacion.service;

import com.davivienda.evaluacion.model.FormaPago;
import com.davivienda.evaluacion.repository.FormaPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoServiceImpl implements FormaPagoService {
    @Autowired
    private FormaPagoRepository formaPagoRepository;
    @Override
    public List<FormaPago> findAll() {
        return formaPagoRepository.findAll();
    }
}
