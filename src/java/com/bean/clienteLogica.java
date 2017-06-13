/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entity.Cliente;
import com.util.ConexionBD;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.List;
import oracle.jdbc.oracore.OracleType;

/**
 *
 * @author moran
 */
public class clienteLogica extends AbstractLogica<Cliente> implements Serializable{
    
    @Override
    public boolean Registrar(Cliente a) {
        boolean estado=false;
        Connection con;
        CallableStatement cl;        
        try{
            con=new ConexionBD().conectar();
            cl=con.prepareCall(" call sp_cliente(?,?,?,?,?,?,?,?,?,?)");
            
            cl.setString(1,a.getContac().getNum_celular());
            cl.setString(2,a.getContac().getNum_celular_opcional());
            cl.setString(3,a.getContac().getEmail());
            cl.setString(4,a.getNombres());
            cl.setString(5,a.getApellidos());
            cl.setString(6,a.getNum_documento());
            cl.setString(7,a.getDireccion()); 
            cl.setInt(8,a.getTipodoc().getId_tipo_documento());
            cl.setString(9,a.getRuc());       
            cl.registerOutParameter(10,OracleType.STYLE_INT);
            cl.execute();
            cl.close();
            estado=true;
        }catch(Exception e){
           System.out.print(e.getMessage());
        }
        return estado;
    }

    @Override
    public List<Cliente> Listar() {
        List<Cliente> arr=null;
        return arr;
    }
    
    
}
