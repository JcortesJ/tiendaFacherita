/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos.Textil;

public class Sombrero extends Ropa{
    private boolean tradicional;
    private String tipo;
    private String proceso;

    public boolean getTradicional() {
        return tradicional;
    }

    public void setTradicional(boolean tradicional) {
        this.tradicional = tradicional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public Sombrero(boolean tradicional, String tipo, String proceso) {
        this(false,"","","",0,"-",0, "Desconocido", "Desconocida", 0, "");
    }

    public Sombrero(boolean tradicional, String tipo, String proceso, String etiqueta, int talla, String garantia, int codigo, String nombre, String empresa, float precio, String desp) {
        super(etiqueta, talla, garantia, codigo, nombre, empresa, precio, desp);
        this.tradicional = tradicional;
        this.tipo = tipo;
        this.proceso = proceso;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return (cadena + "tradicional=" + tradicional + ", tipo=" + tipo + ", proceso=" + proceso);
    }
    
}
