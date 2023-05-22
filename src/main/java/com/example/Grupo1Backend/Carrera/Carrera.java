package com.example.Grupo1Backend.Carrera;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Carrera {
    //Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    }
