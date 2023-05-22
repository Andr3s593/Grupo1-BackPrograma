package com.example.Grupo1Backend.RegistroProyecto;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface RegistroProyectoRepository extends CrudRepository <RegistroProyecto, Long> 
{
    List<RegistroProyecto> findAll();
}