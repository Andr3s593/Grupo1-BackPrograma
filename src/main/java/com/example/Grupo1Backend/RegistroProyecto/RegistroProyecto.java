package com.example.Grupo1Backend.RegistroProyecto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RegistroProyecto {
    //Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido;
    private String carrera;
    private String email;
    private Integer cedula;
    }