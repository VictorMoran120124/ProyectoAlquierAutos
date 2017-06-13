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
public class TipoDocumento implements Serializable {
     private int id_tipo_documento;
     private String nom_documento;

    public TipoDocumento() {
    }

    public TipoDocumento(int id_tipo_documento, String nom_documento) {
        this.id_tipo_documento = id_tipo_documento;
        this.nom_documento = nom_documento;
    }

    public TipoDocumento(String nom_documento) {
        this.nom_documento = nom_documento;
    }

    public int getId_tipo_documento() {
        return id_tipo_documento;
    }

    public void setId_tipo_documento(int id_tipo_documento) {
        this.id_tipo_documento = id_tipo_documento;
    }

    public String getNom_documento() {
        return nom_documento;
    }

    public void setNom_documento(String nom_documento) {
        this.nom_documento = nom_documento;
    }
     
     
    
    
}
