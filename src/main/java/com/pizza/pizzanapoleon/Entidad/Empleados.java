package com.pizza.pizzanapoleon.Entidad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleados {

    @Id
    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
