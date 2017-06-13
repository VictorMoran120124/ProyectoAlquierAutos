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
public class Vehiculo implements Serializable{
    private int id_vehiculo;
    private String marca;
    private int cilindros;
    private String color;
    private String modelo;
    private String placa;
    private Date año_fabrica;
    private String potencia;
    private String estado;
    private int costo_hora;
    private int costo_dia;
    private TipoVehiculo tipovehiculo = new TipoVehiculo();
    private String descripcion;

    public Vehiculo() {
    }

    public Vehiculo(int id_vehiculo, String marca, int cilindros, String color, String modelo, String placa, Date año_fabrica, String potencia, String estado, int costo_hora, int costo_dia, String descripcion) {
        this.id_vehiculo = id_vehiculo;
        this.marca = marca;
        this.cilindros = cilindros;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.año_fabrica = año_fabrica;
        this.potencia = potencia;
        this.estado = estado;
        this.costo_hora = costo_hora;
        this.costo_dia = costo_dia;
        this.descripcion = descripcion;
    }

    public Vehiculo(String marca, int cilindros, String color, String modelo, String placa, Date año_fabrica, String potencia, String estado, int costo_hora, int costo_dia, String descripcion) {
        this.marca = marca;
        this.cilindros = cilindros;
        this.color = color;
        this.modelo = modelo;
        this.placa = placa;
        this.año_fabrica = año_fabrica;
        this.potencia = potencia;
        this.estado = estado;
        this.costo_hora = costo_hora;
        this.costo_dia = costo_dia;
        this.descripcion = descripcion;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAño_fabrica() {
        return año_fabrica;
    }

    public void setAño_fabrica(Date año_fabrica) {
        this.año_fabrica = año_fabrica;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCosto_hora() {
        return costo_hora;
    }

    public void setCosto_hora(int costo_hora) {
        this.costo_hora = costo_hora;
    }

    public int getCosto_dia() {
        return costo_dia;
    }

    public void setCosto_dia(int costo_dia) {
        this.costo_dia = costo_dia;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
