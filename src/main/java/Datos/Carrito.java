/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos;

import java.util.HashMap;

public class Carrito {
    
    private int cantidad;
    private Cliente user;
    private HashMap<Producto, Integer> bolsa;
    

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

    public HashMap<Producto, Integer> getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(HashMap<Producto,Integer> bolsa) {
        this.bolsa = bolsa;
    }

   
  
    public Carrito(){
        this(0,new Cliente(),new HashMap<Producto, Integer>());
    }
    
    public Carrito(int cantidad, Cliente user, HashMap<Producto,Integer> bolsa){
        this.cantidad = cantidad;
        this.user = user;
        this.bolsa = bolsa;
             
    }
}
