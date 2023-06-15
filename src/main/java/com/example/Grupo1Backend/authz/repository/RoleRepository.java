package com.example.Grupo1Backend.authz.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Grupo1Backend.authz.entity.Role;




public interface RoleRepository extends CrudRepository <Role, Long> {

    List<Role> findAll();
    
}
