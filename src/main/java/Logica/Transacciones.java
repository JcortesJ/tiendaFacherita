
package Logica;

import Datos.*;
import java.util.HashMap;
import java.util.Random;

public class Transacciones {
    
    private Compra compra_actual;
    private Cliente cliente_actual;
    private Carrito carrito_actual;
    
    // GETTERS NAD SETTERS jaja lo escribiò mal :v
    
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
        System.out.println("Producto añadido a la bolsa!");
    }
    
    public void EliminarCarro(String elimina){
        Carrito carrito = this.getCarrito_actual();
        HashMap <Producto, Integer> bolsa = carrito.getBolsa();
        bolsa.remove(elimina);
    }
    
    public void EliminarCompra(){
        Compra nuevaCompra = new Compra(1,"","",cliente_actual);
        setCompra_actual(nuevaCompra);
    }
    
    public Compra Comprar(Cliente cliente, Carrito carrito ){
        Compra generada = new Compra();
        float valor_compra = carrito.calcularCostoPedido();
        if(cliente.getDineroDisponible()<valor_compra){
            System.out.println("Compra rechazada");
        }
        else{
            Random xd = new Random();
            String factura = "\n"+" El cliente: " + cliente.getNombre() + "Ha gastado: " + valor_compra + "En: " + carrito.getBolsa().size() + " Objetos";
            System.out.println("Compra Exitosa");
            generada.setCodigo(xd.nextInt(1000));
            generada.setComprador(cliente);
            generada.setFactura(factura);
            generada.setFecha("28/12/21");
            System.out.println(factura);
            cliente.aniadirHistorial(generada, generada.getCodigo());
        
        }
        return generada;
    }
}
