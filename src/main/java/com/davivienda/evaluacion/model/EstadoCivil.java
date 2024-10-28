package com.davivienda.evaluacion.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "estado_civil")
@Getter
@Setter
public class EstadoCivil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstadoCivil;

    private String descripcion;

    @OneToMany(mappedBy = "estadoCivil")
    @JsonIgnore
    private List<Persona> personas;

}
