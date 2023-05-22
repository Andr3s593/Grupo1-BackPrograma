package com.example.Grupo1Backend.Carrera;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CarreraRepository extends CrudRepository <Carrera, Long> 
{
    List<Carrera> findAll();
}