
package Logica;

import UI.*;
import java.util.ArrayList;

public class pruebas {
    
    public static void main(String[] arqs){
        Menu interfaz = new Menu();    
        //interfaz.MostrarTipo("4");
        ArrayList array = new ArrayList();
 
        float num = 5.5f;
        
        System.out.println(Instancias.yogurt.valorTotalProducto(14));
        //System.out.println(Instancias.cafeParamillo.valorTotalProducto(50));
        /*
        System.out.println(Instancias.laRoja.getPrecio());
        System.out.println("total 100 " + Instancias.laRoja.valorTotalProducto(100)); 
        System.out.println("total 60 " + Instancias.laRoja.valorTotalProducto(60)); 
        System.out.println(Instancias.laRoja.promocion(60)); 
        /*
        //System.out.println(Instancias.yogurt.toString());
        //System.out.println(array.getClass());
        /*String  buscando = "es";
        String recurso = "sapas";
        boolean bol = Menu.BuscarCadena(buscando, recurso);
        System.out.println(bol);
        System.out.println(buscando);
        System.out.println(recurso);*/
    }
    
    
    
}
