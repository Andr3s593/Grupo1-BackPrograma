package com.example.Grupo1Backend.lineaInvestigacion;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LineaInvestigacionRepository extends CrudRepository <LineaInvestigacion, Long>{

    List<LineaInvestigacion> findAll();
    
}
