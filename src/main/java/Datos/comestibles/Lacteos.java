
package Datos.comestibles;


public class Lacteos extends Refrigerado{
    
    private boolean deslactosado;
    private boolean industrial;
    private String aditivos;
    
    //GETTERS AND SETTERS

    public boolean isDeslactosado() {
        return deslactosado;
    }

    public void setDeslactosado(boolean deslactosado) {
        this.deslactosado = deslactosado;
    }

    public boolean isIndustrial() {
        return industrial;
    }

    public void setIndustrial(boolean industrial) {
        this.industrial = industrial;
    }

    public String getAditivos() {
        return aditivos;
    }

    public void setAditivos(String aditivos) {
        this.aditivos = aditivos;
    }
    
    // CONSTRUCTORES
        
    public Lacteos(boolean deslactosado, boolean industrial, String aditivos, float temperatura, 
            String procedencia, int cadena,String vencimiento, float peso, int unidadesVenta,
            float calorias,int codigo, String nombre, String empresa, float precio, String desp){
        
        super(temperatura, procedencia, cadena,vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.deslactosado = deslactosado;
        this.industrial = industrial;
        this.aditivos = aditivos;
    }
    
    public Lacteos(boolean deslactosado, boolean industrial, String aditivos){
        super();
        this.deslactosado = deslactosado;
        this.industrial = industrial;
        this.aditivos = aditivos;
    }
       
    public Lacteos(){
        this(true, true, "Desconocidos");
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += " Deslactosada: " + this.deslactosado + " Producción industrial: "
                + this.industrial + " Aditivos del produtco: " + this.aditivos;
        return cad;
    }
}
