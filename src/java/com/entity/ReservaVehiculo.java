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
public class ReservaVehiculo implements Serializable{
    private int id_reserva_vehiculo;
    private int precio_actual;
    private int costo_pre;
    private Date fecha_inicio;
    private Date fecha_devolucion;
    private String estado;
    private Reserva reserva=new Reserva();
    private Vehiculo vehiculo= new Vehiculo();

    public ReservaVehiculo() {
    }

    public ReservaVehiculo(int id_reserva_vehiculo, int precio_actual, int costo_pre, Date fecha_inicio, Date fecha_devolucion, String estado) {
        this.id_reserva_vehiculo = id_reserva_vehiculo;
        this.precio_actual = precio_actual;
        this.costo_pre = costo_pre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
    }

    public ReservaVehiculo(int precio_actual, int costo_pre, Date fecha_inicio, Date fecha_devolucion, String estado) {
        this.precio_actual = precio_actual;
        this.costo_pre = costo_pre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
    }

    public int getId_reserva_vehiculo() {
        return id_reserva_vehiculo;
    }

    public void setId_reserva_vehiculo(int id_reserva_vehiculo) {
        this.id_reserva_vehiculo = id_reserva_vehiculo;
    }

    public int getPrecio_actual() {
        return precio_actual;
    }

    public void setPrecio_actual(int precio_actual) {
        this.precio_actual = precio_actual;
    }

    public int getCosto_pre() {
        return costo_pre;
    }

    public void setCosto_pre(int costo_pre) {
        this.costo_pre = costo_pre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
