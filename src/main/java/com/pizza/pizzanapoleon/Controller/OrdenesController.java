package com.pizza.pizzanapoleon.Controller;

import com.pizza.pizzanapoleon.Entidad.*;
import com.pizza.pizzanapoleon.Repo.ClientesRepo;
import com.pizza.pizzanapoleon.Repo.EmpleadosRepo;
import com.pizza.pizzanapoleon.Repo.PizzasRepo;
import com.pizza.pizzanapoleon.repo.OrdenesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("pizzas")
public class OrdenesController {

    @Autowired
    private OrdenesRepo ordenesRepo;

    @Autowired
    private PizzasRepo pizzaRepo;

    @Autowired
    private EmpleadosRepo empleadosRepo;

    @Autowired
    private ClientesRepo clientesRepo;


    @GetMapping("/ordenar")
    public String getMapping(Model modelo){
        List<Pizzas> lista = pizzaRepo.listarPizzas();
        List<Clientes> clientes = (List<Clientes>) clientesRepo.findAll();
        List<Empleados> empleados = (List<Empleados>) empleadosRepo.findAll();
        modelo.addAttribute("listarPizzas",lista );
        modelo.addAttribute("listarClientes",clientes );
        modelo.addAttribute("listarEmpleados",empleados );
        modelo.addAttribute("orden", new OrdenResponse() );

        return "ordenar";
    }


    @PostMapping("/ordenar/ingresar")
    public String insertar( @ModelAttribute("orden") OrdenResponse orden, Model model){
        LocalDate fechaActual = LocalDate.now();
        try {
            Pizzas pizzas = pizzaRepo.findById(orden.getIdPizza()).get();
            Clientes clientes = clientesRepo.findUserByRut(orden.idCliente);
            Empleados empleados = empleadosRepo.findById(orden.getIdUsuario()).get();

            Ordenes ordenes = new Ordenes();
            ordenes.setCantidad(Integer.parseInt(orden.getCantidad()));
            ordenes.setFecha(fechaActual);
            ordenes.setIdPizza(pizzas);
            ordenes.setRutCliente(clientes);
            ordenes.setUsuario(empleados);

            ordenesRepo.save(ordenes);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/";
    }

}
