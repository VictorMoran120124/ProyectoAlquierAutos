/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entity.Cliente;
import com.entity.TipoDocumento;
import com.util.ConexionBD;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

/**
 *
 * @author moran
 */
public class tipoDocumentoLogica extends AbstractLogica<TipoDocumento> implements Serializable{
    @Override
    public boolean Registrar(TipoDocumento a) {
        boolean estado=false;
        Connection con;
        CallableStatement cl;        
        try{
            con=new ConexionBD().conectar();
            cl=con.prepareCall("call sp_tipo_documento(?,?)");           
            cl.setString(1, a.getNom_documento()); 
            cl.registerOutParameter(2, OracleType.STYLE_INT);
            cl.execute();
            cl.close();
            estado=true;
        }catch(Exception e){
           System.out.print(e.getMessage());
        }
        return estado;
    }
    @Override
    public List<TipoDocumento> Listar() {
        List<TipoDocumento> arr=null;
        
        Connection cn;
        CallableStatement cl;
        try {
            
            cn = new ConexionBD().conectar();
            cl = cn.prepareCall("{ call CURSOR.sp_listar_tipoDoc(?) }");
            cl.registerOutParameter(1, OracleTypes.CURSOR);
            cl.execute();
            ResultSet rs = (ResultSet) cl.getObject(1);
            
            if (rs.next()) {
                
                arr = new ArrayList<>();
                do {                    
                    TipoDocumento p = new TipoDocumento(rs.getInt("id_tipo_documento"),rs.getString("nom_documento"));
                    
                    arr.add(p); //Agregar al listado
                    
                } while (rs.next());
            }
            cl.close();
            rs.close();
            cn.close();
            
        } catch (Exception e) {
            
            System.out.print(e.getMessage());
        }
        return arr;
    }

    public boolean Registrar(Cliente a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
