package com.example.Grupo1Backend.Programa;

    import com.example.Grupo1Backend.Carrera.Carrera;

import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
    
    @Data
    @Entity
    public class Programa {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String titulo;
        
        @ManyToOne
        private Carrera carrera;
    }