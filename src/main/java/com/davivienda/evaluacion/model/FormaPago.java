package com.davivienda.evaluacion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "forma_pago")
@Getter
@Setter
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormaPago;

    private String descripcion;

    @OneToMany(mappedBy = "formaPago")
    @JsonIgnore
    private List<Solicitud> solicitudes;

}