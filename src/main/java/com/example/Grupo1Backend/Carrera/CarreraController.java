package com.example.Grupo1Backend.Carrera;

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
@RequestMapping("api/carrera")
@CrossOrigin({"*"})
public class CarreraController {

    @Autowired
    private CarreraService carreraService;
    //Crear
    //Decoradores (Anotaciones)
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion {instrucciones / sentencias}
    @PostMapping("/")
    public Carrera save(@RequestBody Carrera entity)
    {

        return carreraService.save(entity);
    }
    //Read
    @GetMapping("/")
    public List<Carrera> findAll(){
        return carreraService.findAll();
    }

    @GetMapping("/{id}/")
    public Carrera findById(@PathVariable long id)
    {
        return carreraService.findById(id);
    }
    @PutMapping("/")
    public Carrera updateById(@RequestBody Carrera entity) 
    {
        return carreraService.save(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        carreraService.deleteById(id); 
    }
}