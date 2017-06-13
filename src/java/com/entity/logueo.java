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
public class logueo implements Serializable {
    private int id_logueo;
    private String usuario;
    private String password;

    public logueo() {
    }

    public logueo(int id_logueo, String usuario, String password) {
        this.id_logueo = id_logueo;
        this.usuario = usuario;
        this.password = password;
    }

    public logueo(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public int getId_logueo() {
        return id_logueo;
    }

    public void setId_logueo(int id_logueo) {
        this.id_logueo = id_logueo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
