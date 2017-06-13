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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

/**
 *
 * @author moran
 */
public class VehiculoLogica extends AbstractLogica<Vehiculo> implements Serializable  {
@Override
    public boolean Registrar(Vehiculo a) {
        boolean estado=false;
        Connection con;
        CallableStatement cl;        
        try{
            con=new ConexionBD().conectar();
            cl=con.prepareCall(" call sp_registrar_vehivulo(?,?,?,?,?,?,?,?,?,?,?,?,?)");           
            cl.setString(1,a.getMarca());
            cl.setInt(2,a.getCilindros());
            cl.setString(3,a.getColor());
            cl.setString(4,a.getModelo());
            cl.setString(5,a.getPlaca());
            cl.setDate(6,new java.sql.Date(a.getAño_fabrica().getTime()));
            cl.setString(7,a.getPotencia());
            cl.setString(8,a.getEstado());
            cl.setInt(9,a.getCosto_hora());
            cl.setInt(10,a.getCosto_dia());
            cl.setString(11,a.getDescripcion()); 
            cl.setInt(12,a.getTipovehiculo().getId_tipo_vehiculo());
            cl.registerOutParameter(13,OracleType.STYLE_INT);
            cl.execute();
            cl.close();
            estado=true;
        }catch(Exception e){
           System.out.print(e.getMessage());
        }
        return estado;
    }

    @Override
    public List<Vehiculo> Listar() {
        List<Vehiculo> arr=null;
          Connection cn;
        CallableStatement cl;
        try {
            
            cn = new ConexionBD().conectar();
            cl = cn.prepareCall("{ call CURSOR.sp_listar_vehiculo(?) }");
            cl.registerOutParameter(1, OracleTypes.CURSOR);
            cl.execute();
            ResultSet rs = (ResultSet) cl.getObject(1);
            
            if (rs.next()) {
                
                arr = new ArrayList<>();
                do {                    
                    Vehiculo p = new Vehiculo();
                    p.setId_vehiculo(rs.getInt("id_vehiculo"));
                    p.setMarca(rs.getString("marca"));
                    p.setColor(rs.getString("color"));
                    p.setCilindros(rs.getInt("cilindros"));
                    p.setModelo(rs.getString("modelo"));
                    p.setPlaca(rs.getString("placa"));
                    p.setAño_fabrica(rs.getDate("afabrica"));
                    p.setPotencia(rs.getString("potencia"));
                    p.setEstado(rs.getString("estado"));
                    p.setCosto_hora(rs.getInt("costo_hora"));
                    p.setCosto_dia(rs.getInt("costo_dia"));
                    p.setDescripcion(rs.getString("descripcion"));
        
                    p.setTipovehiculo(new TipoVehiculo(rs.getInt("id_tipo_vehiculo"),rs.getString("nom_tipo")));
                    
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
        

}
