
package Datos;

import java.util.HashMap;


public class Carrito {
    
    private int cantidad;
    private Cliente user;
    private HashMap<String, Integer> bolsa;
    

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getUser() {
        return this.user;
    }

    public void setUser(Cliente user) {
        this.user = user;
    }

    public HashMap<String, Integer> getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(HashMap<String,Integer> bolsa) {
        this.bolsa = bolsa;
    }

   
  
    public Carrito(){
        this(0,new Cliente(),new HashMap<String, Integer>());
    }
    
    public Carrito(int cantidad, Cliente user, HashMap<String,Integer> bolsa){
        this.cantidad = cantidad;
        this.user = user;
        this.bolsa = bolsa;
             
    }
}
