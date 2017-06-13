/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author moran
 */
public class ConexionBD {
    Connection cn=null;
    public Connection conectar(){
        
        try{
        String url="jdbc:oracle:thin:@localhost:1521:ORCL";
        String user="victorm";
        String pass="1234";
        Class.forName("oracle.jdbc.OracleDriver");
        cn=DriverManager.getConnection(url,user,pass);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }        
    return cn;
    }
    public static void main(String[] args) {
        if (new ConexionBD().conectar()!=null) {
        System.out.print("ok");
        }
    }
}