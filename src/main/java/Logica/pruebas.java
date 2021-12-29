
package Logica;

import Datos.*;
import Datos.comestibles.*;
import Datos.farmacia.*;
import Datos.Textil.*;
import UI.*;
import java.util.ArrayList;
import java.util.Scanner;
import Datos.Textil.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class pruebas {
    
    static Cliente cliente_actual = new Cliente(24344, "Pepito flores", (float) 104.000, new HashMap<Integer,Compra>());
    static Carrito carrito_actual = new Carrito(0, cliente_actual, new HashMap<Producto,Integer>());
    
    public static void main(String[] arqs){
        ArrayList<Cerveza> cervezas = Instancias.cervezas;
        Transacciones transaccion = new Transacciones();
        
        Scanner sc = new Scanner(System.in);
        Map<Producto, Integer> carritoCompra = new HashMap<Producto, Integer>();
        int seccion = 1;
        while(seccion != 0){
            MostrarMain();
            System.out.println("Ingrese la opción que desea:");
            seccion = sc.nextInt();
            int seccion2 = 1;
            if(seccion == 1){
                while (seccion2 != 0){
                    System.out.println(" ".repeat(30) + "/// SECCIÓN COMESTIBLES \\\\\\");
                    System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de comestible en específico ||");
                    System.out.println(" 1. Bebidas\n 2. Refrigerados \n 0. Volver");
                    System.out.println("Ingrese la opción que desea:");
                    seccion2 = sc.nextInt();
                    int seccion3 = 1;
                    if(seccion2 == 1){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// BEBIDAS \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de bebida en específico ||");
                            System.out.println(" 1. Cervezas\n 2. Bebidas calientes \n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CERVEZAS DISPONIBLES \\\\\\");
                                for (int i=0;i<cervezas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ cervezas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > cervezas.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(cervezas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(cervezas.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion4 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// BEBIDAS CLIENTES DISPONIBLES \\\\\\");
                                for (int i=0;i<chaquetas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ chaquetas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(chaquetas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    if(seccion4 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        carritoCompra.put(chaquetas.get(seccion4-1),cantidadProducto);
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion4 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 != 0){
                                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                            }
                        }
                    }else if(seccion2 == 2){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// REFRIGERADOS \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de refrigerado en específico ||");
                            System.out.println(" 1. Carnes\n 2. Lácteos \n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CARNES DISPONIBLES \\\\\\");
                                for (int i=0;i<chaquetas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ chaquetas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > chaquetas.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(chaquetas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        carritoCompra.put(chaquetas.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion4 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// LACTEOS DISPONIBLES \\\\\\");
                                for (int i=0;i<chaquetas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ chaquetas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(chaquetas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    if(seccion4 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        carritoCompra.put(chaquetas.get(seccion4-1),cantidadProducto);
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion4 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 != 0){
                                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                            }
                        }
                    }else if(seccion2 != 0){
                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                    }
                }
                
                
                
            } else if(seccion == 2){
                //hola
                
                
                
                //farmacia
            } else if(seccion == 3){
                System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Medicamento\n 2. Aseo");
            } else if(seccion == 4){
                
                System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                System.out.print("|| Ingrese el nombre del producto: ||");
            }else if(seccion == 5){
                
                
              int seccionX = 1;
               System.out.println("---------------------------------------");
               System.out.println("BIENVENIDO AL CARRITO DE COMPRA"+ cliente_actual.getNombre());
               System.out.println("Estos son los articulos que has seleccionado: ");
              while(seccionX!=0){
                   
          
                Set<Producto> llaves = carrito_actual.getBolsa().keySet();
                for(Producto p: llaves){
                    System.out.println("Nombre item: " + p.getNombre() + " Cantidad: "+ carrito_actual.getBolsa().get(p));
                }
                System.out.println("Eliminar item (2) Comprar (3) volver (0)");
                
                seccionX = sc.nextInt();
                if(seccionX==2){
                    System.out.println("Escribe el nombre del item a borrar");
                    Scanner sc_ = new Scanner(System.in);
                    String elimina = sc_.nextLine();
                    transaccion.EliminarCarro(elimina);
                    
                }
                if( seccionX==3){
                   transaccion.Comprar(cliente_actual, carrito_actual);
                }
              }
                
            }
            else if(seccion != 0){
                System.out.println(" ".repeat(30) + "---------- OPCIÓN NO DISPONIBLE --------------");
            }
            
           
            
               
            
            
           
        }
        System.out.println(" ".repeat(18) + "/// GRACIAS POR USAR NUESTROS SERVICIOS \\\\\\");

       // Menu interfaz = new Menu();    
        //interfaz.MostrarTipo("4");
       // ArrayList array = new ArrayList();
 
        //float num = 5.5f;
        
       // System.out.println(Instancias.yogurt.valorTotalProducto(14));
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

    private static void MostrarMain() {
        System.out.println(" ".repeat(18) + "/// BIENVENID@ A LA TIENDA ECOMUN \\\\\\");
        System.out.println("|| Por favor selecciona una de las siguientes opciones"
                + " para ir a una sección en el catálogo ||");
        System.out.println(" 1. Comestibles\n 2. Textiles\n 3. Farmacia\n 4. Buscar\n 5. Carrito de compra \n 0. Salir");
    }  
    
}
