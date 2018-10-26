package com.pizza.pizzanapoleon.Repo;

import com.pizza.pizzanapoleon.Entidad.Clientes;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClienteRepo2 {

    @PersistenceContext
    EntityManager em;

    public int insertar(){
        int resultado=0;

        Clientes cliente = new Clientes();
        cliente.setRutCliente("5-K");
        cliente.setNombre("Maria");
        cliente.setDireccion("Pasaje");
        cliente.setTelefono(5555);
        em.persist(cliente);
        return resultado;
    }
}
