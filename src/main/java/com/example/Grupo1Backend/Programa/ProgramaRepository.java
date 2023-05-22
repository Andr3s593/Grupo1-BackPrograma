package com.example.Grupo1Backend.Programa;

  import org.springframework.data.repository.CrudRepository;
 
     import java.util.List;
     
     public interface ProgramaRepository extends CrudRepository<Programa, Long> {
     
         List<Programa> findAll();
              
     }

 
