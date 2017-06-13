/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entity.ReservaVehiculo;
import com.util.ConexionBD;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.JDBCType;
import java.util.List;
import oracle.jdbc.oracore.OracleType;
/**
 *
 * @author moran
 */
public class ReservaVehiculoLogico extends AbstractLogica<ReservaVehiculo> implements Serializable {
@Override
    public boolean Registrar(ReservaVehiculo a) {
        boolean estado=false;
        Connection con;
        CallableStatement cl;        
        try{
            con=new ConexionBD().conectar();
            cl=con.prepareCall(" call sp_registraReserva(?,?,?,?,?,?,?,?,?,?,?,?,?)");           
            cl.setInt(1,a.getReserva().getPrecio_total());
            cl.setString(2,a.getReserva().getEstado());
            cl.setInt(3,a.getReserva().getCliente().getId_cliente());
            cl.setInt(4,a.getReserva().getEmpresa().getId_empresa());
            cl.setInt(5,a.getPrecio_actual());
            cl.setInt(6,a.getCosto_pre());
            cl.setDate(7,new java.sql.Date(a.getFecha_inicio().getTime()));
            cl.setDate(8,new java.sql.Date(a.getFecha_devolucion().getTime()));
            cl.setInt(9,a.getVehiculo().getId_vehiculo());
            cl.setString(10,a.getReserva().getPagada());
            cl.setDate(11,new java.sql.Date(a.getReserva().getFecha_emitida().getTime()));            
            cl.registerOutParameter(12,OracleType.STYLE_INT);
             cl.registerOutParameter(13,JDBCType.VARCHAR );
            cl.execute();
            cl.close();
            estado=true;
        }catch(Exception e){
           System.out.print(e.getMessage());
        }
        return estado;
    }

    @Override
    public List<ReservaVehiculo> Listar() {
        List<ReservaVehiculo> arr=null;
        return arr;
    }
            
    
}
