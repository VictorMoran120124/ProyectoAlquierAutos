
import com.bean.clienteLogica;
import com.entity.Cliente;
import com.entity.Contacto;
import com.entity.TipoDocumento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moran
 */
public class pruebaClienteLogica {
    public static void main(String[] args) {
        Cliente p=new Cliente();
        p.setNombres("juan");        
        p.setApellidos("moran moran");
        p.setNum_documento("88888888");
        p.setDireccion("piura");
        p.setRuc("72345678973");
        p.setContac(new Contacto("123456789","987654321","moran_14"));
        p.setTipodoc(new TipoDocumento(1,null));       
        if(new clienteLogica().Registrar(p)){
            System.out.print("exito");
        
        } else {
        System.out.print("error");
        }
    }
    
    
}
