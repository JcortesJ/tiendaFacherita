
package Logica;

import Datos.*;

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
    public void AniadirCarro( Producto nuevo){
        
        
    }
}
