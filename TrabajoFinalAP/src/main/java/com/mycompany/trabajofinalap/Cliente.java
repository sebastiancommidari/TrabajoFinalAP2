/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinalap;

/**
 * @author sebas
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    
    @Id
    private String dni_cliente;
    private String nombre;
    private String direccion;
    private String mail;

    public Cliente() {
    }

    public String getDni() {
        return dni_cliente;
    }

    public void setDni(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Cliente(String dni_cliente, String nombre, String direccion, String mail) {
        this.dni_cliente = dni_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.mail = mail;
    }

    
}
