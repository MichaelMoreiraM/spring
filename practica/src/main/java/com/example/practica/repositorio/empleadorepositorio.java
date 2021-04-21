package com.example.practica.repositorio;

import com.example.practica.dominio.empleados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadorepositorio extends JpaRepository<empleados, Integer>{


} 
    

