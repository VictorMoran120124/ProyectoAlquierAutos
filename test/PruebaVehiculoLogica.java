import com.bean.VehiculoLogica;
import com.entity.TipoVehiculo;
import com.entity.Vehiculo;
import java.util.Date;
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
public class PruebaVehiculoLogica {
  public void pruebaR(){ 
        Vehiculo p=new Vehiculo("hiunday",18,"rojo y blanco","4x4","VBG123",new Date(),"5 caballos de fuerza","0",50,300,"muy bueno");        
        p.setTipovehiculo(new TipoVehiculo(164,null));             
        if(new VehiculoLogica().Registrar(p)){
            System.out.print("exito");
        
        } else {
        System.out.print("error");
        }
    }
     public static void pruebaL(){
        JOptionPane.showMessageDialog(null, new VehiculoLogica().Listar().size());
    }
    public static void main(String[] args) {
      pruebaL();
    }
}
