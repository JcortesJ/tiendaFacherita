
package Datos.farmacia;


final public class Naturales extends Farmacia {

    public Naturales() {
        super();
        this.ingredientes = "ninguno";
        this.beneficios = "ninguno";
        this.origen = "ninguno";
    }

    public Naturales(String caducidad ,String ingredientes, String beneficios, String origen, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(caducidad, contenido, restr, us0, codigo, nombre, empresa, precio, desp);
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
