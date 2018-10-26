package com.pizza.pizzanapoleon.controller;

import com.pizza.pizzanapoleon.Entidad.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/pizzas")
public class EmpleadosController {

    @GetMapping("/empleados/listar")
    public String listar(Model model){
        RestTemplate restTemplate = new RestTemplate();
        Empleados[] empleados = restTemplate.getForObject("http://localhost:8080/listar/",Empleados[].class);
        model.addAttribute("listar",empleados);
        return "nosotros";
    }

}
