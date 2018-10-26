package com.pizza.pizzanapoleon.Repo;

import com.pizza.pizzanapoleon.Entidad.Pizzas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzasRepo extends CrudRepository<Pizzas,Integer> {

    @Query("select p from Pizzas p Order by p.titulo")  List<Pizzas> listarPizzas();

}