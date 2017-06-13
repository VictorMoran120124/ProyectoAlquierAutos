
import com.bean.TipoVehiculoLogica;
import com.entity.TipoVehiculo;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moran
 */
public class PruebaTipoVehiculoLogica { 
    public void pruebaR(){
        TipoVehiculo p=new TipoVehiculo("deportivos");        
        if (new TipoVehiculoLogica().Registrar(p)){
            System.out.print("OK");
        }else{
            System.out.print("Error");
        }
    }
               public static void pruebaL(){
        JOptionPane.showMessageDialog(null, new TipoVehiculoLogica().Listar().size());
    }
    public static void main(String[] args) {
      pruebaL();
    }
}
