/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos.farmacia;

/**
 *
 * @author juan manuel
 */
public class Naturales extends Farmacia {

    public Naturales() {
        super();
        this.ingredientes = "ninguno";
        this.beneficios = "ninguno";
        this.origen = "ninguno";
    }

    public Naturales(String ingredientes, String beneficios, String origen, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.ingredientes = ingredientes;
        this.beneficios = beneficios;
        this.origen = origen;
    }
    
        private String ingredientes;
    private String beneficios;
    private String origen;
    

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

      @Override
    public String toString() {
     
        String info_farmacia = super.toString(); 
        String info_natu = info_farmacia + " Origen: " + this.getOrigen() + "\n" +
                 " Beneficios:" + this.getBeneficios()+ "\n" +
                " Ingredientes: " + this.getIngredientes() + "\n" ;
        return  info_natu; 
//To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
