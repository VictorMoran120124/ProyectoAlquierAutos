/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.bean.TipoVehiculoLogica;
import com.bean.VehiculoLogica;
import com.entity.TipoVehiculo;
import com.entity.Vehiculo;
import com.util.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moran
 */
public class cVehiculo implements Serializable{
    private Vehiculo reg;
    private List<Vehiculo> arreglo;

     public cVehiculo() {
        reg = new Vehiculo();
        arreglo = new ArrayList<>();
    }

    public Vehiculo getReg() {
        return reg;
    }
    
    public List<TipoVehiculo> cargarTipoVehiculo() {
        return new TipoVehiculoLogica().Listar();
    }
    public void setReg(Vehiculo reg) {
        this.reg = reg;
    }

    public List<Vehiculo> getArreglo() {
        return arreglo;
    }

    public void setArreglo(List<Vehiculo> arreglo) {
        this.arreglo = arreglo;
    }
    
    public void doNuevo() {
        try {
        reg = new Vehiculo();
                
         } catch (Exception e) {
            Mensaje.js(e.getMessage());
        }
    }
    public String doreg(){
        try {
            if (new VehiculoLogica().Registrar(reg)){
            reg = new Vehiculo();
            Mensaje.js("Se guardo correctamente");
            }else{
                Mensaje.js("No se pudo registrar");
            }
        } catch (Exception e) {
            Mensaje.js("Error");
        }
        return null;
    }
    
    public void doCargar() {
        this.arreglo = new VehiculoLogica().Listar();
    }
    
}
