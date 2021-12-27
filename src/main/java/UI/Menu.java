
package UI;

public class Menu {

/*    
public String Buscar(String busque, String clase){
    
}*/

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
        
        System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
        System.out.print("|| Ingrese el nombre del producto: ||");
    } /*else{
        System.out.println("OPCIÓN INVÁLIDA INTENTE DE NUEVO");
    }*/
}

}
