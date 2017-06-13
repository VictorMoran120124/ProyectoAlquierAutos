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
public class TipoVehiculo implements Serializable {
    private int id_tipo_vehiculo;
    private String nom_tipo;

    public TipoVehiculo() {
    }

    public TipoVehiculo(int id_tipo_vehiculo, String nom_tipo) {
        this.id_tipo_vehiculo = id_tipo_vehiculo;
        this.nom_tipo = nom_tipo;
    }

    public TipoVehiculo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    public int getId_tipo_vehiculo() {
        return id_tipo_vehiculo;
    }

    public void setId_tipo_vehiculo(int id_tipo_vehiculo) {
        this.id_tipo_vehiculo = id_tipo_vehiculo;
    }

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }
    
    
    
}
