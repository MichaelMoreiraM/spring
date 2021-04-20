package com.example.repositorio;

import com.example.dominio.empleados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadorepositorio extends JpaRepository<empleados, Long>{

} 
    

