
package Logica;

import Datos.*;
import java.util.HashMap;
import java.util.Set;

public class Transacciones {
    
    private Compra compra_actual;
    private Cliente cliente_actual;
    private Carrito carrito_actual;
    
    // GETTERS NAD SETTERS
    
    public Compra getCompra_actual() {
        return compra_actual;
    }

    public void setCompra_actual(Compra compra_actual) {
        this.compra_actual = compra_actual;
    }

    public Cliente getCliente_actual() {
        return cliente_actual;
    }

    public void setCliente_actual(Cliente cliente_actual) {
        this.cliente_actual = cliente_actual;
    }

    public Carrito getCarrito_actual() {
        return carrito_actual;
    }

    public void setCarrito_actual(Carrito carrito_actual) {
        this.carrito_actual = carrito_actual;
    }
    
    // CONSTRUCTORES
    
    public Transacciones(Compra compra_actual, Cliente cliente_actual, Carrito carrito_actual) {
        this.compra_actual = compra_actual;
        this.cliente_actual = cliente_actual;
        this.carrito_actual = carrito_actual;
    }

    public Transacciones() {
        this(new Compra(), new Cliente(), new Carrito() );
    }
    
    // MÉTODOS
    public void AniadirCarro( Producto nuevo, int cantidad){
        
        Carrito carrito = this.getCarrito_actual();
        HashMap <Producto, Integer> bolsa = carrito.getBolsa();
        bolsa.put(nuevo, cantidad);
        carrito.setBolsa(bolsa);
        System.out.println("Producto añadido a la bolsa!");
    }
    
    public void EliminarCarro(String elimina){
        Carrito carrito = this.getCarrito_actual();
        HashMap <Producto, Integer> bolsa = carrito.getBolsa();
        
        Set<Producto> nombresProducto = bolsa.keySet();
        for(Producto producto : nombresProducto){
            if ( elimina.equals(producto.getNombre() ) ){
                bolsa.remove(producto);
                break;
            }
        carrito.setBolsa(bolsa);
        }
    }
    
    public void EliminarCompra(){
        Compra nuevaCompra = new Compra(1,"","",cliente_actual);
        setCompra_actual(nuevaCompra);
    }
}
