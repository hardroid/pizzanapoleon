package com.pizza.pizzanapoleon.Entidad;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pizzas {

    @Id
    private int idPizza;
    private String titulo;
    private int precio;
    private String imagen;


    public int getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
