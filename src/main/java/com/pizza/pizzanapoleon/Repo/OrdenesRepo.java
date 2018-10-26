package com.pizza.pizzanapoleon.repo;

import com.pizza.pizzanapoleon.Entidad.Ordenes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdenesRepo extends CrudRepository<Ordenes, Integer> {

    @Query("select c from Ordenes c ")
    public List<Ordenes> listarOrdenes();

}
