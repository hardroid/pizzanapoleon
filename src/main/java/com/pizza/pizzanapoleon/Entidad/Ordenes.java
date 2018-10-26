package com.pizza.pizzanapoleon.Entidad;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
public class Ordenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrden;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idcliente")
    private Clientes rutCliente;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idpizza")
    private Pizzas idPizza;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario")
    private Empleados usuario;

    private LocalDate fecha;
    private Integer cantidad;


    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Clientes getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Clientes rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Pizzas getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Pizzas idPizza) {
        this.idPizza = idPizza;
    }

    public Empleados getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleados usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
