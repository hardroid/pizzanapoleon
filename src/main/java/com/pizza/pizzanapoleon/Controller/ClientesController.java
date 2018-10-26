package com.pizza.pizzanapoleon;

import com.pizza.pizzanapoleon.Entidad.Clientes;
import com.pizza.pizzanapoleon.Repo.ClienteRepo2;
import com.pizza.pizzanapoleon.Repo.ClientesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("pizzas")
public class ClientesController {

    @Autowired
    private
    ClientesRepo clientesRepo;

    @Autowired
    private
    ClienteRepo2 clienteRepo2;

    @GetMapping("/clientes/listar")
    public String clientes(Model model){
        model.addAttribute("clientes",clientesRepo.findAll());
        return "clientes";
    }

    @GetMapping ("/clientes/insertar")
    public String insertar(Model model){
        Clientes cliente = new Clientes();
        model.addAttribute("cliente",cliente);
        return "insertar-cliente";
    }

    @PostMapping ("/clientes/insertar")
    public String insertar2(Model model, @ModelAttribute Clientes cliente){
        cliente = getClientesRepo().save(cliente);
        return "redirect:/pizzas/clientes/listar";
    }

    public ClientesRepo getClientesRepo() {
        return clientesRepo;
    }

    public void setClientesRepo(ClientesRepo clientesRepo) {
        this.clientesRepo = clientesRepo;
    }

    public ClienteRepo2 getClienteRepo2() {
        return clienteRepo2;
    }

    public void setClienteRepo2(ClienteRepo2 clienteRepo2) {
        this.clienteRepo2 = clienteRepo2;
    }
}
