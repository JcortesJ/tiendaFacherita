
package Datos.Textil;

public class Morral extends Maletin{
    private boolean ruedas;
    private boolean rigida;
    private String disenios;

    public boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    public boolean getRigida() {
        return rigida;
    }

    public void setRigida(boolean rigida) {
        this.rigida = rigida;
    }

    public String getDisenios() {
        return disenios;
    }

    public void setDisenios(String disenios) {
        this.disenios = disenios;
    }

    public Morral(boolean ruedas, boolean rigida, String disenios) {
        this(false,false,"","",false,0,0, "Desconocido", "Desconocida", 0, "");
    }

    public Morral(boolean ruedas, boolean rigida, String disenios, String medidas, boolean personalizable, int bolsillos, int codigo, String nombre, String empresa, float precio, String desp) {
        super(medidas, personalizable, bolsillos, codigo, nombre, empresa, precio, desp);
        this.ruedas = ruedas;
        this.rigida = rigida;
        this.disenios = disenios;
    }
    
    
    
}
