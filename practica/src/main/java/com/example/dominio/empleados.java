package com.example.dominio;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.GeneratedValue;
@EntityScan
public class empleados {
    
    @Id
    @GeneratedValue(Strategy=GenerationType.IDENTITY)
    private int id_empleado;
    private String nombre_emp;
    private String apellido_emp;
    private int Edad_emp;
    private int telf_emp;
}
