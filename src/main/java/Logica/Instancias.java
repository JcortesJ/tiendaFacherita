
package Logica;

import Datos.comestibles.*;
public class Instancias {
    
    // CERVEZAS
    Cerveza laRoja = new Cerveza(5.5f, "Lúpulo, malta, agua, levadura", "Ale", 
    550f, "Vidrio", true, "No determina", 1f, 198, 43f, 1001, "LaRoja-Clasica", 
            "LaRoja", 7000, "Cerveza tipo red ALe con buen balance entre malta y lupulo, sabor intenso");
    
    Cerveza alternativa = new Cerveza(4.5f, "Malta tostada, lúpulo, agua, levadura",
    "Ale", 350f, "Vidrio", true, "No determina", 0.75f, 150, 40f, 1002, "Alternativa",
    "Cervecería alternativa", 6500, "Cerveza negra tipo ale, suave con un cuerpo fuerte");
    
    Cerveza laTrocha = new Cerveza(5.5f, "Lúpulo, malta tostada, caramelo, chocolate, agua",
    "Ale", 550f, "Vidrio", true, "No determina", 0.8f, 120, 45f, 1003, "Coromoro Ale Porter", 
    "La Trocha", 10900f, "Coromoro Ale Porter es una cerveza negra de un amargor medio con tintes a chocolate y a acaramelo");

    // BEBIDAS CALIENTES
    
    Calientes cafeParamillo = new Calientes(true, 0f, false, 2500f, "Bolsa", true, "No determina",
    1f, 90, 5f, 2001, "Cafe Paramillo", "Cooperativa Multiactiva emprendedores del campo Colombiano",
    35000f, "Cafe de grano 100% natural y con la calidad del campo Colombiano");
    
    Calientes cafeTercerAcuerdo = new Calientes(true, 0f, false, 2000f, "Bolsa", true, "No determina",
    0.8f, 110, 3f, 2002, "Cafe el Tercer Acuerdo", "ASOPEP",
    28000f, "El Tercer Acuerdo es el café de lo colectivo, del pacto local que hacen las antiguas FARC-EP y los indigenas Nasa en el corregimiento de Gaitana-Tolima");

    Calientes chocolateLaPaz = new Calientes(true, 48.5f, false, 1500f, "Bolsa",
    true, "12 meses", 1.5f, 60, 546f, 2003, "Chocolate La paz", "Cooperativa Fronteras del sur",
    45000f, "Café 100% natural proveniente del campo Colombiano, sabor amargo y placentero");
    
    // Carnes
    
    Carne carneBufalo = new Carne("Chuletón", false, "Carnes rojas", 1.5f, "Búfalo",
    30, "4 a 12 meses", 1.5f, 45, 99, 30001, "Chuletón de Búfalo", "Ecobúfalo", 30500f,
    "Carne de Búfalo proveniente del área de reincorporación San Francisco, ubicada en Yondó, Antioquia");

    Carne carneCerdo = new Carne("Lomo", false, "Carnes blancas", 2f, "Cerdo", 25,
    "4 a 12 meses", 1f, 34, 242, 3002, "Lomo de Cerdo", "Asopramas", 20800f, "Carne de cerdo proveniente de los Montes de María, Colosó, Sucre");

    Carne carneChivo = new Carne("Cadera", false, "Carnes rojas", 2f, "Chivo", 35,
    "4 a 12 meses", 1.5f, 45, 127, 3003, "Cadera de Chivo", "Cooperativa Multiactiva para la Paz de Colombia Coompazcol", 20000f,
    "Carne de Chivo proveniente de la Granja San Luis, municipio de Fonseca, La Guajira");
    
    // LACTEOS
    
    Lacteos lecheBufalo = new Lacteos(false, true, "Ninguno", 2f, "Búfalo", 
    60, "7 a 14 días", 0.25f, 80, 42, 4001, "Leche de Búfalo", "Ecobúfalo", 4500f,
    "Leche de Búfalo proveniente del área de reincorporación San Francisco, ubicada en Yondó, Antioquia");
    
    Lacteos quesoBufalo = new Lacteos(false, true, "Ninguno", 5f, "Búfalo", 
    90, "6 a 8 meses", 0.25f, 120, 402f, 4002, "Queso de Búfalo", "Ecobúfalo", 5500f,
    "Queso de Búfalo proveniente del área de reincorporación San Francisco, ubicada en Yondó, Antioquia");
    
    Lacteos yogurt = new Lacteos(true, true, "Ninguno", 4f, "Vaca", 90, "6 a 8 meses",
    0.25f, 78, 59, 4003, "Yogurt Artesanal", "Amasando Sueños", 5000f, "Yogurt creado por un grupo de mujeres luchadoras");
}
