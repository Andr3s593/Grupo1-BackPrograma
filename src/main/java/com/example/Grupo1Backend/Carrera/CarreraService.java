package com.example.Grupo1Backend.Carrera;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {

    //Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo
    @Autowired
    private CarreraRepository carreraRepository;

    //Crud

    //Crear
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion
    public Carrera save(Carrera entity)
    {
        return carreraRepository.save(entity);
    }
    //Read
    public List<Carrera> findAll()
    {
        return carreraRepository.findAll();
    }
    public Carrera findById(long id)
    {
        return carreraRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        carreraRepository.deleteById(id);
    }
}