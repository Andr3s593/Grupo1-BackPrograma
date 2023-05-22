package com.example.Grupo1Backend.Actividad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadService {

    //Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo
    @Autowired
    private ActividadRepository actividadRepository;

    //Crud

    //Crear
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion
    public Actividad save(Actividad entity)
    {
        return actividadRepository.save(entity);
    }
    //Read
    public List<Actividad> findAll()
    {
        return actividadRepository.findAll();
    }
    public Actividad findById(long id)
    {
        return actividadRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        actividadRepository.deleteById(id);
    }
}
