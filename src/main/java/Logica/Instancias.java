
package Logica;
import Datos.farmacia.*;

public class Instancias {
    //objetos de farmacia del 500 al 1000
    //Aseo
    static Aseo aseo_1 = new Aseo("12/02/21", "Agua, glicerol, jabon", "No aplicar a los ojos", false, 500, "ninguna", "desinfeccion de superficies",567 , "Desinfetec", "E corp", (float) 23.440, "Producto autoctono usado para limpiar superficies");
    static Aseo aseo_2 = new Aseo("3/05/22", "Agua, NaClO, Blanqueador ", "No usar en ropa", true, 200, "No mezclar con alcohol", "desinfeccion para covid19", 570, "Clor-EP", "Aguas del oriente", (float)15.000, "Producto usado para limpiar y prevenir el covid en el hogar");
    static Aseo aseo_3 = new Aseo("Ninguna", "Agua, aromatizante, grasa no humana", "No dejar en el agua", false, 250, "ninguna", "aplique sobre manos y superficies", 580, "Jabon NaCl", "Limpio SA", (float)3.000, "Usese para limpiar y dejar un buen olor");
    //Hogar
     static Hogar hogar_1 = new Hogar("12/02/23",false, true,"Usar en el lavado de ropa", 1000, "menores de 10 anos no usar", "detergente para ropa", 590, "Fabuloso", "Bandamax", (float) 30.000,"jabon limpiador de ropa" );
    static Hogar hogar_2 = new Hogar("3/01/29", true, false, "Dejar en sitios donde haya roedores", 50, "Evite que menores lo usen", "Veneno para roedores", 599, "El-matador", "Limpio SA", (float)45.000, "Veneno para matar roedores");
    static Hogar hogar_3 = new Hogar("Ninguna", false, true, "Aplicar en zonas donde huela mal", 450, "no aplicar a ojos, inflamable", "Aromatiza el hogar", 600, "Huele-bien", "Olores del cielo SA", (float)10.000, "Aromatice su casa a un costo accequible");
    
    //Medicamento
    static Medicamento med_1 = new Medicamento("9/03/25", "Hipersensibilidad al paracetamol", true, "cada 8h", 40, "No usar personas con problemas renales", "medicamento paliativo", 620, "Dolex-EP", "Quimicos reinsertados SA", (float)2.500, "Usese para curar pequenios dolores");
    static Medicamento med_2 = new Medicamento("10/04/23", "Riesgo de  ataques cardiacos", false, "cada 12h", 30, "No usar si ha tenido un ataque cardiaco reciente", "medicamento paliativo", 605, "Ibuprofex", "Quimicos reinsertados SA", (float)5.000, "Usese para curar pequenios dolores");
    static Medicamento med_3 = new Medicamento("28/12/21", "Riesgo de ulceras", true, "cada 12h", 10, "No usar si es alegico, o hemofilico","medicamento anfiinflamatorio", 610, "Aspirin-LP", "Quimicos reinsertados SA", (float)9.000, "Usese como antiinflamatorio o anticoagulante");
    
    //Naturales
    static Naturales nat_1 = new Naturales("ninguna", "canabbis, hoja de coca, calendula", "alivia todo tipo de dolores", "selvas del cauca", 300, "ninguna", "aplique sobre el area inflamada", 630, "mariguanol", "aguas del oriente", (float)35.000, "Pomada caliente para calmar dolores");
    static Naturales nat_2 = new Naturales();
    static Naturales nat_3 = new Naturales("un dia despues de su venta","receta secreta del chaman", "relajacion instantanea", "selvas del yari", 450, "menores de 18 anios", "infusion en el agua", 640, "Te magico", "Te SA", (float)10.000, "Te de hierbas nativas para relajarse");
    
    //Personal
    
    static  Personal per_1 = new Personal("ninguna", 5, "boca", true, 50, "ninguna", "Limpieza bucal", 650, "Oral-F","Bandamax", (float)3.000, "Uselo para limpiar su boca");
    static  Personal per_2 = new Personal("ninguna", 15, "todo el cuerpo", true, 80, "ninguna", "limpieza del cuerpo", 655, "EsponjAAB", "Bandamax", (float)3.500, "Uselo para baniarse y limpiarse");
    static  Personal per_3 = new Personal("2025", 25, "zona intima", false, 110, "hipersensibilidad a las toallas", "toallas intimas", 670,"Klotex", "Bandamax", (float)4.000, "Toallas intimas");
    
    //Sinteticos
    
    static Sinteticos sin_1 = new Sinteticos("ninguna", "Jhonson&Jhonson", true,"2 minutos de aplicacion", 200,"sensibilidad al producto", "Aplique sobre cabello remojado y enjuage", 700, "Shampoo anticaida", "Internacional-Importaciones SA", (float)15.000, "Shampoo anti: caida,caspa,resequedad");
    static Sinteticos sin_2 = new Sinteticos("10/07/29", "Dago Garcia Aceites", false, "de 2 a 3 dias", 250, "ninguna", "Aplique sobre el area a masajear", 705, "Aceite masajeador", "DGA SA", (float) 45.000, "Aceite especial para masajes");
    static Sinteticos sin_3 = new Sinteticos("ninguna", "Aguas del oriente SA", true, "Hasta que desaparezcan las imperfecciones", 300, "ninguna", "Limpieza facial", 710, "Agua micelar", "E corp", (float)7.500, "Agua micelar para la cara");
}
