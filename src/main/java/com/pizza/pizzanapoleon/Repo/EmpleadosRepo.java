package com.pizza.pizzanapoleon.Repo;


import com.pizza.pizzanapoleon.Entidad.Empleados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpleadosRepo extends CrudRepository<Empleados, String> {

    @Query("select c from Empleados c where c.usuario = :var")
    List<Empleados> listarusuario(@Param("var") String var);
}
