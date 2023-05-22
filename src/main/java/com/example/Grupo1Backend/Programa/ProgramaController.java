package com.example.Grupo1Backend.Programa;

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
@RequestMapping("api/programa")
@CrossOrigin({"*"})
public class ProgramaController {

    @Autowired
    private ProgramaService programaService;
    //Crear
    //Decoradores (Anotaciones)
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion {instrucciones / sentencias}
    @PostMapping("/")
    public Programa save(@RequestBody Programa entity)
    {

        return programaService.save(entity);
    }
    //Read
    @GetMapping("/")
    public List<Programa> findAll(){
        return programaService.findAll();
    }

    @GetMapping("/{id}/")
    public Programa findById(@PathVariable long id)
    {
        return programaService.findById(id);
    }
    @PutMapping("/")
    public Programa updateById(@RequestBody Programa entity) 
    {
        return programaService.save(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        programaService.deleteById(id); 
    }
}