
package Datos.farmacia;


public class Aseo extends Farmacia {
    
       private String componentes;
    private String recomendaciones;
    private boolean corrosivo;
    

    public Aseo() {
        super();
        this.componentes = "ninguno";
        this.recomendaciones = "ninguna";
        this.corrosivo = false;
    }

    public Aseo(String componentes, String recomendaciones, boolean corrosivo, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.componentes = componentes;
        this.recomendaciones = recomendaciones;
        this.corrosivo = corrosivo;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public boolean isCorrosivo() {
        return corrosivo;
    }

    public void setCorrosivo(boolean corrosivo) {
        this.corrosivo = corrosivo;
    }
 
 
     @Override
    public String toString() {
        String gen = this.isCorrosivo()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_aseo = info_farmacia + " Componentes: " + this.getComponentes() + "\n" +
                 " Recomendaciones:" + this.getRecomendaciones()+ "\n" +
                "Es corrosivo: " + gen + "\n" ;
        return  info_aseo; 
    }
}
