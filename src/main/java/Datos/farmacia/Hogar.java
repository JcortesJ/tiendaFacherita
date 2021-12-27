
package Datos.farmacia;


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

      @Override
    public String toString() {
        String gen = this.isQuimico()? "SI":"NO";
        String gen2 = this.isBiodegradable()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_hogar = info_farmacia + " Modo de uso: "  + this.getModoDeUso()+ "\n" +
                 "Es quimico: " + gen2 + "\n" 
                 + "Es biodegradable: " + gen + "\n" ;
        
        return  info_hogar; 

    }
    
    

}
