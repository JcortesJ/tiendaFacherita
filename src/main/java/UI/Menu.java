
package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public String BuscarCadena(String buscando, String recurso){
        char[] recursoArray = recurso.toCharArray();
     return "xd";
    }
    
    public String Buscar(String caracter, ArrayList<Object> repo){
        int i = 0;
        return "xd";
    }

    public void MostrarMain(){
        System.out.println(" ".repeat(18) + "/// BIENVENID@ A LA TIENDA ECOMUN \\\\\\");
        System.out.println("|| Por favor selecciona una de las siguientes opciones"
                + "para ir a una sección en el catálogo ||");
        System.out.println(" 0. Salir\n 1. Comestible\n 2. Textiles\n 3. Farmacia\n 4. Buscar");

    }

    public void MostrarTipo(String navegante){ 
        Scanner sc = new Scanner(System.in);
        int salir = 1;
        while(salir!=0){
            MostrarMain();
            System.out.println("Ingrese la opción que desea:");
            int bandera = sc.nextInt();
            int bandera2 = 1;
            if(bandera==1){
                while (bandera2!=0){
                    System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                    System.out.println(" 1. Bebidas\n 2. Refrigerados");
                    bandera2 = sc.nextInt();
                    if(bandera2==1){
                        System.out.println("Bebidas disponibles");
                    }
                }
            } else if(bandera == 2){
                System.out.println(" ".repeat(30) + "/// SECCIÓN TEXTILES \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Ropa\n 2. Morrales");
            } else if(bandera == 3){
                System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Medicamento\n 2. Aseo");
            } else if(bandera == 4){
                System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                System.out.print("|| Ingrese el nombre del producto: ||");
            }
            else if(bandera != 0){
                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
            }
        }
        System.out.println(" ".repeat(18) + "/// GRACIAS POR USAR NUESTROS SERVICIOS \\\\\\");
    }



}
