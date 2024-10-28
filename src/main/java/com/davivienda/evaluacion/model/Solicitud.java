package com.davivienda.evaluacion.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "solicitud")
@Getter
@Setter
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSolicitud;

    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona persona;

    private LocalDate fechaCreacion;
    private BigDecimal monto;
    private Integer plazo;

    @ManyToOne
    @JoinColumn(name = "idFormaPago", nullable = false)
    private FormaPago formaPago;


}
