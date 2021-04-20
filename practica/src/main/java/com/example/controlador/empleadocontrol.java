package com.example.controlador;

import java.util.List;

import com.example.servicio.empleadosservicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class empleadocontrol {
    
@Autowired
private empleadosservicio service;

@GetMapping("/")
public String viewHomePage (Model modelo){
    List<empleadosservicio> listEmpleados =service.listAll();
    modelo.addAttribute("ListaEmpleados",listEmpleados);
    System.out.println("Get /");
    return "index";
}

@GetMapping("/new")
public String add(Modelo model){
    model.addAttribute("Empleados",new Empleados());
    return "new";
}

@RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveempleado(@ModelAttribute("empleados") Empleados stq){
    service.Save(std);
    return "redirect:/";
}

@RequestMapping("/edit/{id}")
public ModelAndView showEditEmpleadoPAge(@PathVariable(name="id")int id){
    ModelAndView mav=new ModelAndView("new");
    Empleados std =service.get(id);
    mav.addObject("empleados", std);
    return mav;
}

@RequestMapping("/delete/{id}")
public String deleteempleado(@PathVariable(name="id")int id){
    service.delete(id);
    return "redirect:/";
}

}
