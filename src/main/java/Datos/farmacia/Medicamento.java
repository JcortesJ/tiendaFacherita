
package Datos.farmacia;
import Datos.*;



final public class Medicamento extends Farmacia {

    private String fechaVencimiento;
    private String contraindicaciones;
    private boolean generica;
    private String frecuencia;
    
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
    
 

    public Medicamento() {
        super();
        this.fechaVencimiento = "13/13/2013";
        this.contraindicaciones = "ninguna";
        this.generica = false;
        this.frecuencia = "ninguna";
    }

    public Medicamento(String caducidad ,String fechaVencimiento, String contraindicaciones, boolean generica, String frecuencia, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(caducidad ,contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.fechaVencimiento = fechaVencimiento;
        this.contraindicaciones = contraindicaciones;
        this.generica = generica;
        this.frecuencia = frecuencia;
    }
    
       

    @Override
    public String toString() {
        String gen = this.isGenerica()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_medicamento = info_farmacia + "Fecha vencimiento: " + this.getFechaVencimiento() + "\n" +
                 "Contraindicaciones:" + this.getContraindicaciones()+ "\n" +
                 "Frecuencia:  " + this.getFrecuencia()+ "\n" +
                 "Fecha vencimiento " + this.getFechaVencimiento() + "\n" +
                "Es generico: " + gen + "\n" ;
        return  info_medicamento; 
    }
    
    @Override
    public final float valorTotalProducto(int cantidad){
       return 0;
    }
    
    @Override
    public final float promocion(int cantidad){
        return 0;
    }
    
    
    


}
