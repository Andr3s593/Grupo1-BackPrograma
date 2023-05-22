package com.example.Grupo1Backend.Programa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {

    //Atributos: Delimitador de Acceso, Tipo de Dato, Nombre del Atributo
    @Autowired
    private ProgramaRepository programaRepository;

    //Crud

    //Crear
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion
    public Programa save(Programa entity)
    {
        return programaRepository.save(entity);
    }
    //Read
    public List<Programa> findAll()
    {
        return programaRepository.findAll();
    }
    public Programa findById(long id)
    {
        return programaRepository.findById(id).orElse(null);
    }
    public void deleteById(long id)
    {
        programaRepository.deleteById(id);
    }
}