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
public class Contacto implements Serializable {
    private int id_contacto;
    private String num_celular;
    private String num_celular_opcional;
    private String email;

    public Contacto() {
    }

    public Contacto(int id_contacto, String num_celular, String num_celular_opcional, String email) {
        this.id_contacto = id_contacto;
        this.num_celular = num_celular;
        this.num_celular_opcional = num_celular_opcional;
        this.email = email;
    }

    public Contacto(String num_celular, String num_celular_opcional, String email) {
        this.num_celular = num_celular;
        this.num_celular_opcional = num_celular_opcional;
        this.email = email;
    }

    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public String getNum_celular() {
        return num_celular;
    }

    public void setNum_celular(String num_celular) {
        this.num_celular = num_celular;
    }

    public String getNum_celular_opcional() {
        return num_celular_opcional;
    }

    public void setNum_celular_opcional(String num_celular_opcional) {
        this.num_celular_opcional = num_celular_opcional;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
