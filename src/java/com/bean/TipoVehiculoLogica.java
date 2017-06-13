/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;


import com.entity.TipoVehiculo;
import com.entity.Vehiculo;
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
public class TipoVehiculoLogica extends AbstractLogica<TipoVehiculo> implements Serializable  {
@Override
    public boolean Registrar(TipoVehiculo a) {
        boolean estado=false;
        Connection con;
        CallableStatement cl;        
        try{
            con=new ConexionBD().conectar();
            cl=con.prepareCall("call sp_tipo_vehiculo(?,?)");           
            cl.setString(1, a.getNom_tipo()); 
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
    public List<TipoVehiculo> Listar() {
        List<TipoVehiculo> arr=null;
        Connection cn;
        CallableStatement cl;
        try {
            
            cn = new ConexionBD().conectar();
            cl = cn.prepareCall("{ call CURSOR.sp_listar_tipoVehiculo(?) }");
            cl.registerOutParameter(1, OracleTypes.CURSOR);
            cl.execute();
            ResultSet rs = (ResultSet) cl.getObject(1);
            
            if (rs.next()) {
                
                arr = new ArrayList<>();
                do {                    
                    TipoVehiculo p = new TipoVehiculo(rs.getInt("id_tipo_vehiculo"),rs.getString("nom_tipo"));
                    
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

    public boolean Registrar(Vehiculo a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

}
