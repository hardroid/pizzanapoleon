package com.pizza.pizzanapoleon.Repo;

import com.pizza.pizzanapoleon.Entidad.Clientes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClientesRepo extends CrudRepository <Clientes, Integer> {

    @Query("select c from Clientes c where c.rutCliente=:rut")
    Clientes findUserByRut(@Param("rut")String rut);
}
