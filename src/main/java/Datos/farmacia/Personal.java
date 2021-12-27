
package Datos.farmacia;


public class Personal extends Farmacia {

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getZonaCuerpo() {
        return zonaCuerpo;
    }

    public void setZonaCuerpo(String zonaCuerpo) {
        this.zonaCuerpo = zonaCuerpo;
    }

    public boolean isUnisex() {
        return unisex;
    }

    public void setUnisex(boolean unisex) {
        this.unisex = unisex;
    }

    public Personal() {
        super();
        this.edadRecomendada = 0;
        this.zonaCuerpo = "ninguna";
        this.unisex = false;
    }

    public Personal(int edadRecomendada, String zonaCuerpo, boolean unisex, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.edadRecomendada = edadRecomendada;
        this.zonaCuerpo = zonaCuerpo;
        this.unisex = unisex;
    }
    
    private int edadRecomendada;
    private String zonaCuerpo;
    private boolean unisex;
    
        @Override
    public String toString() {
        String gen = this.isUnisex()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_per = info_farmacia + "Edad recomendada: " + this.getEdadRecomendada()+ "\n" +
                 "Zona del cuerpo:" + this.getZonaCuerpo()+ "\n" +
                "Es unisex: " + gen + "\n" ;
        return  info_per; 

    }

   
}
