
package Logica;

import Datos.Producto;
import UI.*;
import java.util.ArrayList;
import java.util.Scanner;
import Datos.Textil.Chaqueta;
import java.util.HashMap;
import java.util.Map;

public class pruebas {
    
    public static void main(String[] arqs){
        ArrayList<Chaqueta> chaquetas = new ArrayList<>();
        Chaqueta chaquetaRoja = new Chaqueta("Ninguno",true,"de invierno","ffbacad",12,"1 año",43242,"Chaqueta Roja de invierno","Kenzo",190000,"Chaqueta de iniverno color rojo importada");
        Chaqueta chaquetaCuero = new Chaqueta("Capota",false,"de cuero","tgs353",6,"1 mes",43242,"Chaqueta negra de cuero","Colpub",300000,"Chaqueta de cuero color negra nacional");
        Chaqueta chaquetaLana = new Chaqueta("Bolsillos ocultos",false,"de lana","vsdgfs453",9,"Sin garantía",43242,"Chaqueta blanca de lana","Louvc",150000,"Chaqueta de lana color blanca estampada");
        chaquetas.add(chaquetaLana);
        chaquetas.add(chaquetaCuero);
        chaquetas.add(chaquetaRoja);
        Scanner sc = new Scanner(System.in);
        Map<Producto, Integer> carritoCompra = new HashMap<Producto, Integer>();
        int seccion = 1;
        while(seccion != 0){
            MostrarMain();
            System.out.println("Ingrese la opción que desea:");
            seccion = sc.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
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
            } else if(seccion == 3){
                System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Medicamento\n 2. Aseo");
            } else if(seccion == 4){
                System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                System.out.print("|| Ingrese el nombre del producto: ||");
            }else if(seccion == 5){
                System.out.println(" ".repeat(7) + "/// CARRITO DE COMPRAS \\\\\\");
                System.out.print(carritoCompra);
            }else if(seccion != 0){
                System.out.println(" ".repeat(30) + "---------- OPCIÓN NO DISPONIBLE --------------");
            }
        }
        System.out.println(" ".repeat(18) + "/// GRACIAS POR USAR NUESTROS SERVICIOS \\\\\\");
    }

    private static void MostrarMain() {
        System.out.println(" ".repeat(18) + "/// BIENVENID@ A LA TIENDA ECOMUN \\\\\\");
        System.out.println("|| Por favor selecciona una de las siguientes opciones"
                + " para ir a una sección en el catálogo ||");
        System.out.println(" 1. Comestibles\n 2. Textiles\n 3. Farmacia\n 4. Buscar\n 5. Carrito de compra \n 0. Salir");
    }  
    
}
