package com.example.Grupo1Backend.RegistroProyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroProyectoService {

    //Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo
    @Autowired
    private RegistroProyectoRepository registroproyectoRepository;

    //Crud

    //Crear
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion
    public RegistroProyecto save(RegistroProyecto entity)
    {
        return registroproyectoRepository.save(entity);
    }
    //Read
    public List<RegistroProyecto> findAll()
    {
        return registroproyectoRepository.findAll();
    }
    public RegistroProyecto findById(long id)
    {
        return registroproyectoRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        registroproyectoRepository.deleteById(id);
    }
}