/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;
import com.entity.Empresa;
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
public class EmpresaLogica extends AbstractLogica<Empresa> implements Serializable {
@Override
    public boolean Registrar(Empresa a) {
        boolean estado=false;
        Connection con;
        CallableStatement cl;        
        try{
            con=new ConexionBD().conectar();
            cl=con.prepareCall(" call sp_registrar_empresa(?,?,?,?,?,?,?,?)");           
            cl.setString(1,a.getContac().getNum_celular());
            cl.setString(2,a.getContac().getNum_celular_opcional());
            cl.setString(3,a.getContac().getEmail());
            cl.setString(4,a.getNombre());
            cl.setString(5,a.getRuc());
            cl.setString(6,a.getCiudad());
            cl.setString(7,a.getDireccion());            
            cl.registerOutParameter(8,OracleType.STYLE_INT);
            cl.execute();
            cl.close();
            estado=true;
        }catch(Exception e){
           System.out.print(e.getMessage());
        }
        return estado;
    }

    @Override
    public List<Empresa> Listar() {
        List<Empresa> arr=null;
        return arr;
    }
    

   
}
