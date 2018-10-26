package com.pizza.pizzanapoleon.Controller;

import com.pizza.pizzanapoleon.Entidad.Pizzas;
import com.pizza.pizzanapoleon.Repo.PizzasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pizzas")
public class PizzasController {

    @Autowired
    private PizzasRepo pizzasRepo;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Pizzas> listado= (List<Pizzas>) pizzasRepo.findAll();
        model.addAttribute("listado", listado);
        return "listado";
    }
}


