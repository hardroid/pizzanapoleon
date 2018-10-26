package com.pizza.pizzanapoleon.Repo;

import com.pizza.pizzanapoleon.Entidad.Empleados;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmpleadoRepo2 {

    @PersistenceContext
    EntityManager em;

    public List<Empleados> listarUsuario(@Param("var") String var){
        Query consulta=em
                .createQuery("select c from Empleados c where c.usuario = :var");
        consulta.setParameter("var",var);
        return consulta.getResultList();

    }
}
