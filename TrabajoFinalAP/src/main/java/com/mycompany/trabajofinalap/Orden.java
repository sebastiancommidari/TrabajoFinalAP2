/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinalap;

/**
 *
 * @author sebas
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orden")
public class Orden implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden")
    private int id_orden;

    @Column(name = "descripcion_orden")
    private String descripcionOrden;

    @Column(name = "costo")
    private double costo;

    @Column(name = "fecha_orden")
    private Date fecha_orden;

    @Column(name = "estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "dni_cliente")
    private Cliente dni_cliente;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria id_categoria;

    @ManyToOne
    @JoinColumn(name = "id_tecnico")
    private Tecnico id_tecnico;


    // Constructor vacío necesario para Hibernate
    public Orden() {
    }

    // Constructor con todos los campos
    public Orden(String descripcionOrden, double costo, Date fechaOrden, String estado, Cliente cliente, Categoria categoria, Tecnico tecnico) {
        this.descripcionOrden = descripcionOrden;
        this.costo = costo;
        this.fecha_orden = fechaOrden;
        this.estado = estado;
        this.dni_cliente = cliente;
        this.id_categoria = categoria;
        this.id_tecnico = tecnico;
    }

    public int getIdOrden() {
        return id_orden;
    }

    public void setIdOrden(int idOrden) {
        this.id_orden = idOrden;
    }

    public String getDescripcionOrden() {
        return descripcionOrden;
    }

    public void setDescripcionOrden(String descripcionOrden) {
        this.descripcionOrden = descripcionOrden;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechaOrden() {
        return fecha_orden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fecha_orden = fechaOrden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(Cliente dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Tecnico getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Tecnico id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    void setCategoria(int idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

/*

@Entity
public class Orden {
    @Id
    private int id_orden;
    private String descripcion_orden;
    private double costo;
    private Date fecha_orden;
    private String estado;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Tecnico tecnico;

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public String getDescripcion_orden() {
        return descripcion_orden;
    }

    public void setDescripcion_orden(String descripcion_orden) {
        this.descripcion_orden = descripcion_orden;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFecha_orden() {
        return fecha_orden;
    }

    public void setFecha_orden(Date fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    

}

*/