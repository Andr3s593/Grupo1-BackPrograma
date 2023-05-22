package com.example.Grupo1Backend.Actividad;

import com.example.Grupo1Backend.Carrera.Carrera;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Actividad {
    // Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;    
    private String fechainicio;
    private String fechafin;

    @ManyToOne
    private Carrera carrera;
}
