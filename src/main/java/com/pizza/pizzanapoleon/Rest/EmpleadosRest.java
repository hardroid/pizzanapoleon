package com.pizza.pizzanapoleon.Rest;

import com.pizza.pizzanapoleon.Entidad.Empleados;
import com.pizza.pizzanapoleon.Repo.EmpleadoRepo2;
import com.pizza.pizzanapoleon.Repo.EmpleadosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmpleadosRest {
    @Autowired
    private EmpleadosRepo empleadosRepo;

    @Autowired
    private EmpleadoRepo2 empleadoRepo2;


    @GetMapping("/listar")
    public List<Empleados> listar(){

        return (List<Empleados>) empleadosRepo.findAll();
    }

    @GetMapping("/listausuario/{usuario}")
    public List<Empleados> listarusuario(@PathVariable("usuario") String usuario ){


        return  empleadosRepo.listarusuario(usuario);
    }

    @GetMapping("/listausuario2/{usuario}")
    public List<Empleados> listarusuario2(@PathVariable("usuario") String usuario ){

        return  empleadoRepo2.listarUsuario(usuario);
    }

}
