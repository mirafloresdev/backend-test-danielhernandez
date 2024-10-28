package com.davivienda.evaluacion.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String dui;
    private String nit;
    private String nombres;
    private String apellidos;
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "idActividadEconomica", nullable = false)
    private ActividadEconomica actividadEconomica;

    @ManyToOne
    @JoinColumn(name = "idEstadoCivil", nullable = false)
    private EstadoCivil estadoCivil;

}
