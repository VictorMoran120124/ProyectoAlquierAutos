/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;

/**
 *
 * @author moran
 */
public class Empresa implements Serializable{
    private int id_empresa;
    private String nombre;
    private String ruc;
    private String ciudad;
    private String direccion;
    private Contacto Contac = new Contacto();

    public Empresa() {
    }

    public Empresa(int id_empresa, String nombre, String ruc, String ciudad, String direccion) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.ruc = ruc;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Empresa(String nombre, String ruc, String ciudad, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Contacto getContac() {
        return Contac;
    }

    public void setContac(Contacto Contac) {
        this.Contac = Contac;
    }
    
    
}
