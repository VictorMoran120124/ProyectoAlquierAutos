
import com.bean.EmpresaLogica;
import com.entity.Contacto;
import com.entity.Empresa;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moran
 */
public class PruebaEmpresaLogica {
    public static void main(String[] args) {
        Empresa p=new Empresa();
        p.setNombre("EUROANDINOS");        
        p.setRuc("98765432167");
        p.setCiudad("lima");
        p.setDireccion("callao");        
        p.setContac(new Contacto("777777777","999999999","moran_14"));
             
        if(new EmpresaLogica().Registrar(p)){
            System.out.print("exito");
        
        } else {
        System.out.print("error");
        }
    }
    
}
