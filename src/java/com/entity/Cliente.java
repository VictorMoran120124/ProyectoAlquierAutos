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
public class Cliente implements Serializable {
    private int id_cliente;
    private String nombres;
    private String apellidos;
    private String num_documento;
    private String direccion;
    private Contacto contac = new Contacto();
    private TipoDocumento tipodoc = new TipoDocumento();
    private String ruc;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombres, String apellidos, String num_documento, String direccion, String ruc) {
        this.id_cliente = id_cliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.ruc = ruc;
    }

    public Cliente(String nombres, String apellidos, String num_documento, String direccion, String ruc) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.ruc = ruc;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Contacto getContac() {
        return contac;
    }

    public void setContac(Contacto contac) {
        this.contac = contac;
    }

    public TipoDocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(TipoDocumento tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
    
}
