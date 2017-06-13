/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.bean.EmpresaLogica;
import com.entity.Empresa;
import com.util.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moran
 */
public class cEmpresa  implements Serializable{
    private Empresa reg;
    private List<Empresa> arreglo;
    
    public cEmpresa() {
        reg = new Empresa();
        arreglo = new ArrayList<>();
    }

    public Empresa getReg() {
        return reg;
    }

    public void setReg(Empresa reg) {
        this.reg = reg;
    }

    public List<Empresa> getArreglo() {
        return arreglo;
    }

    public void setArreglo(List<Empresa> arreglo) {
        this.arreglo = arreglo;
    }
    
     public String doreg(){
        try {
            if (new EmpresaLogica().Registrar(reg)){
            reg = new Empresa();
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
