/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author moran
 */
public class Reserva implements Serializable {
    private int id_reserva;
    private int precio_total;
    private String estado;
    private Cliente cliente= new Cliente();
    private Empresa empresa = new Empresa();
    private String pagada;
    private Date fecha_emitida;

    public Reserva() {
    }

    public Reserva(int id_reserva, int precio_total, String estado, String pagada, Date fecha_emitida) {
        this.id_reserva = id_reserva;
        this.precio_total = precio_total;
        this.estado = estado;
        this.pagada = pagada;
        this.fecha_emitida = fecha_emitida;
    }

    public Reserva(int precio_total, String estado, String pagada, Date fecha_emitida) {
        this.precio_total = precio_total;
        this.estado = estado;
        this.pagada = pagada;
        this.fecha_emitida = fecha_emitida;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getPagada() {
        return pagada;
    }

    public void setPagada(String pagada) {
        this.pagada = pagada;
    }

    public Date getFecha_emitida() {
        return fecha_emitida;
    }

    public void setFecha_emitida(Date fecha_emitida) {
        this.fecha_emitida = fecha_emitida;
    }

    
}
