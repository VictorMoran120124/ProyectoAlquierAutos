/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador;

import java.io.Serializable;
public class cAdmin implements Serializable {
     public void iniciarSesion (){
         //Aqui se va a iniciar session el admin
        /*
        Admin obj=new Usuario();
        //Obtiene el objeto de una session exitosa o no
        obj= new UsuarioLogica().IniciarSesion(objAuthUsuario);
       
        //Evalua si el objeto no es nulo
        if(obj!=null){
            //Pasa el objeto para ser guardado en una variable de session
            new SessionLogica().nuevaSesion(obj);
            //Contruye un canal de socket para el usuario
            new cNotificacion().construirCanal();
            
        }else{
            //Mensaje erroneo
            System.out.println("Error de inicio de sesion");
            Mensaje.msg("Error", "Usuario y/o contraseña incorrectos"); 
        }
        */
    }
}
