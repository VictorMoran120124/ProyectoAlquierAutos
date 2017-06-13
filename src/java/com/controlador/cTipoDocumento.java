/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import com.bean.tipoDocumentoLogica;
import com.entity.TipoDocumento;
import com.util.Mensaje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author moran
 */
public class cTipoDocumento implements Serializable{
    private TipoDocumento reg;
    private List<TipoDocumento> arreglo;
    
    public cTipoDocumento() {
        reg = new TipoDocumento();
        arreglo = new ArrayList<>();
    }

    public TipoDocumento getReg() {
        return reg;
    }

    public void setReg(TipoDocumento reg) {
        this.reg = reg;
    }

    public List<TipoDocumento> getArreglo() {
        return arreglo;
    }

    public void setArreglo(List<TipoDocumento> arreglo) {
        this.arreglo = arreglo;
    }
    public String doreg(){
        try {
            if (new tipoDocumentoLogica().Registrar(reg)){
            reg = new TipoDocumento();
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
