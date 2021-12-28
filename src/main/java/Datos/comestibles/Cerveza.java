
package Datos.comestibles;

public class Cerveza extends Bebida{
    
    private float gradoAlcohol;
    private String ingredientes;
    private String tipoFermentacion;
    
    //GETTERS AND SETTERS

    public float getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(float gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoFermentacion() {
        return tipoFermentacion;
    }

    public void setTipoFermentacion(String tipoFermentacion) {
        this.tipoFermentacion = tipoFermentacion;
    }
    
    //CONSTRUCTORES
    
    public Cerveza(float grado, String ingredientes, String fermentacion, 
           float contenido, String empaquetado, boolean origenNatural,String vencimiento, 
            float peso, int unidadesVenta, float calorias,int codigo, String nombre, 
            String empresa, float precio, String desp){
        
        super(contenido, empaquetado, origenNatural, vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.gradoAlcohol = grado;
        this.ingredientes = ingredientes;
        this.tipoFermentacion = fermentacion; 
    }
    
    
    public Cerveza(float grado, String ingredientes, String fermentacion){
        super();
        this.gradoAlcohol = grado;
        this.ingredientes = ingredientes;
        this.tipoFermentacion = fermentacion; 
    }
    
    public Cerveza(){
        this(0,"Desconocidos", "Desconocido");
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Grado alcohol: " + this.gradoAlcohol + " Ingredientes: " + 
                this.ingredientes + " Tipo de fermentación: "+ this.tipoFermentacion;
        return cad;
    }
    
}
