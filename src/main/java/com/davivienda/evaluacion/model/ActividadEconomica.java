package com.davivienda.evaluacion.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "actividades_economicas")
@Getter
@Setter
public class ActividadEconomica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActividadEconomica;

    private String descripcion;

    @OneToMany(mappedBy = "actividadEconomica")
    @JsonIgnore
    private List<Persona> personas;

}