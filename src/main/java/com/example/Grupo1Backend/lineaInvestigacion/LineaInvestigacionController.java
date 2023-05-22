package com.example.Grupo1Backend.lineaInvestigacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/lineaInvestigacion")
@CrossOrigin({"*"})
public class LineaInvestigacionController {

    @ Autowired
    private LineaInvestigacionService lineaInvestigacionService;

    //CREAR
    //Decoradores (Anotaciones)
    //Metod: Delimitador de acceso, Tipo de dato que retorna, nombrre del metodo / funcion
    @PostMapping("/")
    public LineaInvestigacion save(@RequestBody LineaInvestigacion entity){
        return lineaInvestigacionService.save(entity);

    }
    //Read
    @GetMapping("/{id}/")
    public LineaInvestigacion findById(@PathVariable long id){
        return lineaInvestigacionService.findById(id);
    }

    @GetMapping("/")
    public List<LineaInvestigacion> findAll(){
        return lineaInvestigacionService.findAll();
    }

    @PutMapping("/")
    public LineaInvestigacion update(@RequestBody LineaInvestigacion entity){
        return lineaInvestigacionService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        lineaInvestigacionService.deleteById(id);
    }
}
