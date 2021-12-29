
package Logica;

import Datos.Producto;
import Datos.comestibles.*;
import Datos.farmacia.*;
import Datos.Textil.*;
import UI.*;
import java.util.ArrayList;
import java.util.Scanner;
import Datos.Textil.*;
import java.util.HashMap;
import java.util.Map;

public class pruebas {
    
    public static void main(String[] arqs){
        ArrayList<Chaqueta> chaquetas = Instancias.chaquetas;
        ArrayList<Sombrero> sombreros = Instancias.sombreros;
        ArrayList<Morral> morrales = Instancias.morrales;
        ArrayList<Tula> tulas = Instancias.tulas;
        ArrayList<Cerveza> cervezas = Instancias.cervezas;
        ArrayList<Calientes> calientes = Instancias.bebidasCalientes;
        ArrayList<Carne> carnes = Instancias.carnes;
        ArrayList<Lacteos> lacteos = Instancias.bebidasLacteas;
        ArrayList<Producto> productos = Instancias.CrearMegaArreglo(Instancias.todosProductos);
        
        Transacciones transaccion = new Transacciones();
        
        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
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
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > cervezas.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
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
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// BEBIDAS CALIENTES DISPONIBLES \\\\\\");
                                for (int i=0;i<calientes.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ calientes.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > calientes.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(calientes.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(calientes.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
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
                            + " para ir a un tipo de refrigeraod en específico ||");
                            System.out.println(" 1. Carnes\n 2. Lacteos \n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CARNES DISPONIBLES \\\\\\");
                                for (int i=0;i<carnes.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ carnes.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > carnes.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(carnes.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(carnes.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// LACTEOS DISPONIBLES \\\\\\");
                                for (int i=0;i<lacteos.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ lacteos.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > lacteos.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(lacteos.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(lacteos.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
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
                while (seccion2 != 0){
                    System.out.println(" ".repeat(30) + "/// SECCIÓN TEXTILES \\\\\\");
                    System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de textil en específico ||");
                    System.out.println(" 1. Ropa \n 2. Maletines \n 0. Volver");
                    System.out.println("Ingrese la opción que desea:");
                    seccion2 = sc.nextInt();
                    int seccion3 = 1;
                    if(seccion2 == 1){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// ROPA \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de bebida en específico ||");
                            System.out.println(" 1. Chaquetas\n 2. SOmbreros\n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CHAQUETAS DISPONIBLES \\\\\\");
                                for (int i=0;i<cervezas.size();i++){
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
                                        transaccion.AniadirCarro(chaquetas.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// SOMBREROS DISPONIBLES \\\\\\");
                                for (int i=0;i<sombreros.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ sombreros.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(sombreros.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    if(seccion4 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(sombreros.get(seccion4-1),cantidadProducto);
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
                            System.out.println(" ".repeat(30) + "/// MALETINES \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de refrigerado en específico ||");
                            System.out.println(" 1. Morrales\n 2. Tulas\n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// MORRALES DISPONIBLES \\\\\\");
                                for (int i=0;i<chaquetas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ morrales.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > morrales.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(morrales.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(morrales.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// TULAS DISPONIBLES \\\\\\");
                                for (int i=0;i<tulas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ tulas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(tulas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    if(seccion4 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(tulas.get(seccion4-1),cantidadProducto);
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
            } else if(seccion == 3){
                System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Medicamento\n 2. Aseo");
            } else if(seccion == 4){
                int seleccionado = 1;
                while(seleccionado != 0){
                    System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                    System.out.print("|| Ingrese el nombre del producto: ||\n");
                    String buscador = sx.nextLine();
                    Menu menu = new Menu();
                    ArrayList<String> resultados = menu.Buscar(buscador, productos);
                    System.out.print("Los resultados que coinciden con su busqueda son:\n");
                    for(String cad : resultados){
                        System.out.println(cad);
                    }
                    System.out.println("0. Salir\n");
                    
                    
                    int seccion3 = 1;
                    while(seccion3 != 0 && seleccionado > 0){
                        System.out.print("Por favor escriba el número del producto del cual quiere más información: \n");
                        seleccionado = sc.nextInt();
                        System.out.println(productos.get(seleccionado-1).toString());
                        System.out.println(" 1. Comprar\n 0. Volver");
                        int accion = sc.nextInt();
                        if(accion == 1){
                            System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                            int cantidadProducto = sc.nextInt();
                            transaccion.AniadirCarro(productos.get(seleccionado-1),cantidadProducto);
                            seleccionado = 0;
                            seccion3=0;
                            System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                        }else if (accion != 0){
                            System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                        }
                    }
                }
            }else if(seccion == 5){
                System.out.println(" ".repeat(7) + "/// CARRITO DE COMPRAS \\\\\\");
                System.out.print(carritoCompra);
                System.out.println(" 1. Terminar compra\n 2. Eliminar producto\n 0. Volver");
            }else if(seccion != 0){
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
