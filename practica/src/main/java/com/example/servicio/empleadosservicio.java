package com.example.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class empleadosservicio {

 @Autowired
  private empleadosRepositorio repro;

  public List<empleadosservicio>listAll(){
      return repo.findAll();
  }
    
  public void Save(empleadosservicio std){
      repo.save(std);
  }

  public empleadosservicio get(long id){
      return repo.findById(id).get();
  }

  public void delete (long id){
      repo.deleteById(id);
  }

}
