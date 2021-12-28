/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Logica;
import Datos.*;
import Datos.farmacia.*;

/**
 *
 * @author juan manuel
 */
public class pruebas2 {

    Medicamento med_prueba = new Medicamento ();
    static Hogar casita = new Hogar("12/02/23",true, true,"frotar con las manos", 10, "mayores de 10 anos no usar", "limpieza de camas", 0, "Fabuloso", "Bandamax", 30,"jabon limpiador de camas" );
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("El objeto" + casita.getNombre()+ "\n"+ casita);
        System.out.println("Logica.pruebas2.main()");
        System.out.println("Fecha de caduco: " + casita.getCaducidad());
    }
    
  
}
