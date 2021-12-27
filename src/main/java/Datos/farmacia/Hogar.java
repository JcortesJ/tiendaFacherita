/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos.farmacia;

/**
 *
 * @author juan manuel
 */
public class Hogar extends Farmacia {

    public boolean isQuimico() {
        return quimico;
    }

    public void setQuimico(boolean quimico) {
        this.quimico = quimico;
    }

    public boolean isBiodegradable() {
        return biodegradable;
    }

    public void setBiodegradable(boolean biodegradable) {
        this.biodegradable = biodegradable;
    }

    public String getModoDeUso() {
        return modoDeUso;
    }

    public void setModoDeUso(String modoDeUso) {
        this.modoDeUso = modoDeUso;
    }

    public Hogar() {
        super();
        this.quimico = false;
        this.biodegradable = false;
        this.modoDeUso = " ni idea pai ";
    }

    public Hogar(boolean quimico, boolean biodegradable, String modoDeUso, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.quimico = quimico;
        this.biodegradable = biodegradable;
        this.modoDeUso = modoDeUso;
    }
   
    private boolean quimico;
    private boolean biodegradable;
    private String modoDeUso;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
