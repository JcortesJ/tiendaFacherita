
package Logica;
import Datos.Textil.Chaqueta;
import Datos.Textil.Morral;
import Datos.Textil.Sombrero;
import Datos.Textil.Tula;
import java.util.ArrayList;

public class Instancias {
    Chaqueta chaquetaRoja = new Chaqueta("Ninguno",true,"de invierno","ffbacad",12,"1 año",43242,"Chaqueta Roja de invierno","Kenzo",190000,"Chaqueta de iniverno color rojo importada");
    Chaqueta chaquetaCuero = new Chaqueta("Capota",false,"de cuero","tgs353",6,"1 mes",43242,"Chaqueta negra de cuero","Colpub",300000,"Chaqueta de cuero color negra nacional");
    Chaqueta chaquetaLana = new Chaqueta("Bolsillos ocultos",false,"de lana","vsdgfs453",9,"Sin garantía",43242,"Chaqueta blanca de lana","Louvc",150000,"Chaqueta de lana color blanca estampada");
    Tula tulaWayuu = new Tula("Media",false,1,"10X20X20 cm",false,2,42342,"Tula wayuu multicolor","Comunidad wayuu",120000,"Tula wayuu original de varios colores");
    Tula tulaGigante = new Tula("Baja",true,0,"40X40X40 cm",true,5,84564,"Tula Gigante negra","Totto",150000,"Tula gigante negra sin estampados");
    Tula tulaMini = new Tula("Alta",true,2,"10X30X10 cm",true,10,625432,"Tula Miniatura roja","Totto",70000,"Tula miniatura roja con cuadros negros");
    Sombrero sombreroVueltiao= new Sombrero(true,"Vueltiao","realizado por campesinos","FKAH430",10,"5 meses",543234,"Sombrero Vueltiao","Colsombreros",50000,"Sombrero vueltiao original");
    Sombrero sombreroFemenino= new Sombrero(false,"Femenino","tejido a mano","GAFV230",6,"3 meses",645673,"Sombrero Femenino","Hatisd",20000,"Sombrero femenino blanco");
    Sombrero sombreroLlanero= new Sombrero(true,"Llanero","realizado con 100% cuero","FAGR630",12,"1 mes",432453,"Sombrero Llanero","Llansom",150000,"Sombrero llanero original de cuero");
    Morral morralInfantil = new Morral(true, true, "cubos de colores", "20X40X40 cm",true,5,763543,"Morral para niños", "Totto",153000,"Morral para niños con diseño infantil");
    Morral morralAdulto = new Morral(false, true, "lineas", "50X80X80 cm",false,7,62543,"Morral para adultos", "Coonfanor",221000,"Morral para adultos con diseño único");
    Morral morralViajero = new Morral(false, false, "Ninguno", "90X100X90 cm",false,10,62622,"Morral para viajar", "Cooamacol",135000,"Morral para viajer de color negro sin diseño");
    
    
    
    ArrayList<Chaqueta> chaquetas = new ArrayList<>();
    chaquetas.add(chaquetaRoja);
}
