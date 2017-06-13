
import com.bean.tipoDocumentoLogica;
import com.entity.TipoDocumento;
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
public class PruebaTipoDocumentoLogica {
    public void pruebaR() {
        TipoDocumento p=new TipoDocumento("Pasaporte");                
             if(new tipoDocumentoLogica().Registrar(p)){
            System.out.print("exito");
        }else{
            System.out.print("Error");
        }
    }
    public static void pruebaL(){
        JOptionPane.showMessageDialog(null, new tipoDocumentoLogica().Listar().size());
    }
    public static void main(String[] args) {
      pruebaL();
    }
}
