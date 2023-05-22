package com.example.Grupo1Backend.lineaInvestigacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineaInvestigacionService {

    //Atributos: Delimitador de acceso, Tipo de dato, Nombre del atributo
    @Autowired
    private LineaInvestigacionRepository lineaInvestigacionRepository;

    //CRUD

    //CREAR
    //Metod: Delimitador de acceso, Tipo de dato que retorna, nombrre del metodo / funcion { instrucciones / sentencias }
    public LineaInvestigacion save(LineaInvestigacion entity){
        return lineaInvestigacionRepository.save(entity);
    }

    //Read
    public LineaInvestigacion findById(long id){
        return lineaInvestigacionRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        lineaInvestigacionRepository.deleteById(id);
    }

    public List<LineaInvestigacion> findAll(){
        return lineaInvestigacionRepository.findAll();
    }
}
