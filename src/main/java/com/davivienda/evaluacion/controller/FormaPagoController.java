package com.davivienda.evaluacion.controller;

import com.davivienda.evaluacion.model.FormaPago;
import com.davivienda.evaluacion.service.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formasPago")
public class FormaPagoController {

    @Autowired
    private FormaPagoService formaPagoService;

    @GetMapping
    public ResponseEntity<List<FormaPago>> getAllFormasPago() {
        return ResponseEntity.ok(formaPagoService.findAll());
    }
}
