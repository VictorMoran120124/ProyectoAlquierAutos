/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.bean.TipoVehiculoLogica;
import com.entity.TipoVehiculo;
import com.util.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moran
 */
public class cTipoVehiculo implements Serializable{
    private TipoVehiculo reg;
    private List<TipoVehiculo> arreglo;
    
    public cTipoVehiculo() {
        reg = new TipoVehiculo();
        arreglo = new ArrayList<>();
    }

    public TipoVehiculo getReg() {
        return reg;
    }

    public void setReg(TipoVehiculo reg) {
        this.reg = reg;
    }

    public List<TipoVehiculo> getArreglo() {
        return arreglo;
    }

    public void setArreglo(List<TipoVehiculo> arreglo) {
        this.arreglo = arreglo;
    }
    
    public String doreg(){
        try {
            if (new TipoVehiculoLogica().Registrar(reg)){
            reg = new TipoVehiculo();
            Mensaje.js("Se guardo correctamente");
            }else{
                Mensaje.js("No se pudo registrar");
            }
        } catch (Exception e) {
            Mensaje.js("Error");
        }
        return null;
    }
}
