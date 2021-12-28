
package Datos.farmacia;


final public class Sinteticos extends Farmacia {

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public String getDuracionTratamiento() {
        return duracionTratamiento;
    }

    public void setDuracionTratamiento(String duracionTratamiento) {
        this.duracionTratamiento = duracionTratamiento;
    }

    public Sinteticos() {
        super();
        this.fabricante = "ninguno";
        this.importado = false;
        this.duracionTratamiento = "0 meses";
    }

    public Sinteticos(String caducidad ,String fabricante, boolean importado, String duracionTratamiento, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super( caducidad, contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.fabricante = fabricante;
        this.importado = importado;
        this.duracionTratamiento = duracionTratamiento;
    }
    
    private String fabricante;
    private boolean importado;
    private String duracionTratamiento;

    
      @Override
    public String toString() {
        String gen = this.isImportado()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_sint = info_farmacia + "Fabricante " + this.getFabricante() + "\n" +
                 "Duracion tratamiento:" + this.getDuracionTratamiento()+ "\n" +
                "Es importado: " + gen + "\n" ;
        return  info_sint; 

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
