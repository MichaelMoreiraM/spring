package com.example.practica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundo {
    @RequestMapping("/")
    public String hola(){
        return "hola mundo";
    }

}
