
package UI;

import java.util.ArrayList;
import Datos.Producto;

public class Menu {

    public boolean BuscarCadena(String buscando, String recurso){
        char[] recursoArray = recurso.toCharArray();
        char[] buscandoArray = buscando.toCharArray();
        
        int limit = recursoArray.length -buscandoArray.length;
        int i = 0;
        boolean bandera = false;
        
        while( (i <= limit) && !bandera ){
            int j = 0;        
            while( j< buscandoArray.length && !bandera ){            
                if( buscandoArray[j] != recursoArray[j+i] ){
                    bandera = true;                 
                }
                j ++;
            }    
            bandera = !bandera;
            i ++;
        }
     return bandera;
    }
    
    public ArrayList<String> Buscar(String caracter, ArrayList<Producto> repo){
        ArrayList<String> productos = new ArrayList();
        int n = repo.size();
        for(int i=0; i<n; i++){
            Producto producto = repo.get(i);
            if( BuscarCadena(caracter, producto.getNombre()) ){
                productos.add(i + ". " + producto.getNombre());
            }
        }
        
        return productos;
    }

    public void MostrarMain(){
        System.out.println(" ".repeat(18) + "/// BIENVENIDO A LA TIENDA ECOMUN \\\\\\");
        System.out.println("|| Por favor selecciona una de las siguientes opciones"
                + "para ir a una sección en el catálogo ||");
        System.out.println(" 1. Comestible\n 2. Textiles\n 3. Farmacia\n 4. Buscar");

    }

    public void MostrarTipo(String navegante){   

        if( navegante.equals("1") ){
            System.out.println(" ".repeat(30) + "/// SECCIÓN COMESTIBLES \\\\\\");
            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                    + "para ir a un tipo de producto en específico ||");
            System.out.println(" 1. Bebidas\n 2. Refrigerados");
        } else if( navegante.equals("2") ){

            System.out.println(" ".repeat(30) + "/// SECCIÓN TEXTILES \\\\\\");
            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                    + "para ir a un tipo de producto en específico ||");
            System.out.println(" 1. Ropa\n 2. Morrales");
        } else if( navegante.equals("3") ){

            System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                    + "para ir a un tipo de producto en específico ||");
            System.out.println(" 1. Medicamento\n 2. Aseo");
        } else if( navegante.equals("4") ){

            System.out.println(" ".repeat(20) + "/// BUSQUEDA \\\\\\");
            System.out.print("|| Ingrese la palabra o palabras relacionadas con su busqueda: ||");
        } /*else{
            System.out.println("OPCIÓN INVÁLIDA INTENTE DE NUEVO");
        }*/
    }



}
