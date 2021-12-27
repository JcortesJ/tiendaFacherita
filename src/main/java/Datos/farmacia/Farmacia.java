
package Datos.farmacia;
import Datos.*;

public  abstract class Farmacia extends Producto {

    
    
    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public float getContenidoMililitros() {
        return contenidoMililitros;
    }

    public void setContenidoMililitros(float contenidoMililitros) {
        this.contenidoMililitros = contenidoMililitros;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

 
    public Farmacia(){
        super();
        this.contenidoMililitros = 0;
        this.restricciones = "ninguna";
        this.uso = "ninguno";
    }
    
    public Farmacia(float contenido,String restr, String us0 ,int codigo, String nombre, String empresa, float precio, String desp){
        super(codigo,nombre,empresa,precio,desp);
        this.contenidoMililitros = contenido;
        this.restricciones = restr;
        this.uso = us0;
    }
    
    private String uso;
    private float contenidoMililitros;
    private String restricciones;

    @Override
    public String toString() {
        String info_producto = super.toString();
        String info_farmacia = info_producto+"\n"+" Uso: " + this.getUso() + "\n" 
                            + " Contenido (ml): " + this.getContenidoMililitros()+ "\n" +
                            "Restricciones: " + this.getRestricciones() + "\n";
                            
        
        return info_farmacia;  
    }
            

}
