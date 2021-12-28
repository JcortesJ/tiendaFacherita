
package Datos.comestibles;


final public class Calientes extends Bebida{
    
    private boolean tradicional;
    private float nivelAzucar;
    private boolean instantaneo;
    
    //GETTERS AND SETTERS

    public boolean isTradicional() {
        return tradicional;
    }

    public void setTradicional(boolean tradicional) {
        this.tradicional = tradicional;
    }

    public float getNivelAzucar() {
        return nivelAzucar;
    }

    public void setNivelAzucar(float nivelAzucar) {
        this.nivelAzucar = nivelAzucar;
    }

    public boolean isInstantaneo() {
        return instantaneo;
    }

    public void setInstantaneo(boolean instantaneo) {
        this.instantaneo = instantaneo;
    }
    
    //CONSTRUCTORES
    
    public Calientes(boolean tradicional, float nivelAzucar, boolean instantaneo,
        float contenido, String empaquetado, boolean origenNatural,String vencimiento, 
        float peso, int unidadesVenta, float calorias,int codigo, String nombre, 
        String empresa, float precio, String desp){     
        
        super(contenido, empaquetado, origenNatural, vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.tradicional = tradicional;
        this.nivelAzucar = nivelAzucar;
        this.instantaneo = instantaneo;
    }
    
    public Calientes(boolean tradicional, float nivelAzucar, boolean instantaneo){          
        super();
        this.tradicional = tradicional;
        this.nivelAzucar = nivelAzucar;
        this.instantaneo = instantaneo;
    }
    
    public Calientes(){
        this(true,0,true);
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += " Sabor Tradicional" + this.tradicional + "Nivel de azúcar: " + this.nivelAzucar+
                "Bebida instantanea: " + this.instantaneo;
        return cad;
        
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
