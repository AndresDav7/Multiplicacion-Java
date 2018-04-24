package clasestring;

public class ClaseString {

       public static void main(String[] args) {
           
       String cadena = "La palabra está en la posición 3";
       
           System.out.println(cadena.toUpperCase()); //mayusculas
           System.out.println(cadena.toLowerCase()); //minusculas
           System.out.println(cadena.replaceAll("a", "x").replace('á','x')); //todas las a por x
           //System.out.println(cadena.replace('á','x'));
           System.out.println(cadena.replaceFirst("a", "x")); //primera a por x              
           System.out.println(cadena.indexOf("alab")); //encontrar la posicion donde empieza
           System.out.println(cadena.substring(16, 30)); //extraer la subcadena desde posicion inicial hasta la pos final
           
       
    }
    
}
