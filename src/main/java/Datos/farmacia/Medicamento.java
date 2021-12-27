/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos.farmacia;
import Datos.*;

/**
 *
 * @author juan manuel
 */
public class Medicamento extends Farmacia {

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public boolean isGenerica() {
        return generica;
    }

    public void setGenerica(boolean generica) {
        this.generica = generica;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    private String fechaVencimiento;
    private String contraindicaciones;
    private boolean generica;
    private String frecuencia;

    public Medicamento(String fechaVencimiento, String contraindicaciones, boolean generica, String frecuencia) {
        this.fechaVencimiento = fechaVencimiento;
        this.contraindicaciones = contraindicaciones;
        this.generica = generica;
        this.frecuencia = frecuencia;
    }

    public Medicamento(String fechaVencimiento, String contraindicaciones, boolean generica, String frecuencia, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.fechaVencimiento = fechaVencimiento;
        this.contraindicaciones = contraindicaciones;
        this.generica = generica;
        this.frecuencia = frecuencia;
    }
    
       

    @Override
    public String toString() {
        
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
