package com.example.Grupo1Backend.RegistroProyecto;

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
@RequestMapping("api/registroproyecto")
@CrossOrigin({"*"})
public class RegistroProyectoController {

    @Autowired
    private RegistroProyectoService registroproyectoService;
    //Crear
    //Decoradores (Anotaciones)
    //Method: Delimitador de acceso, Tipo de dato que retorna, nombre metodo/ funcion {instrucciones / sentencias}
    @PostMapping("/")
    public RegistroProyecto save(@RequestBody RegistroProyecto entity)
    {

        return registroproyectoService.save(entity);
    }
    //Read
    @GetMapping("/")
    public List<RegistroProyecto> findAll(){
        return registroproyectoService.findAll();
    }

    @GetMapping("/{id}/")
    public RegistroProyecto findById(@PathVariable long id)
    {
        return registroproyectoService.findById(id);
    }
    @PutMapping("/")
    public RegistroProyecto updateById(@RequestBody RegistroProyecto entity) 
    {
        return registroproyectoService.save(entity);
    }
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id)
    {
        registroproyectoService.deleteById(id); 
    }
}