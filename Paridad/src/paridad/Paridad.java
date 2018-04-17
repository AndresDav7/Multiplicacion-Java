package paridad;

import java.util.Scanner;

public class Paridad {

    public static void main(String[] args) {
                
        /*//double res = 5.0 / 2;
        
        int x=2+3;
        int y=3-5;
        
        double res = (double)x/y; //Casting explicito=transformamos en valor 
                                  //vuelve el valor en double siempre  

        System.out.println(res);
        */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();
        
        System.out.println("ingrese su sueldo: ");
        double sueldo = scan.nextDouble();
        
        
        System.out.println("Los datos son ");
        System.out.println(); //Espacio like Enter
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("sueldo: " + sueldo);
        
        System.out.println("Su nombre es "+nombre+" y tiene "+edad+
                " y gana "+ sueldo +" en Dolares");
     
    }
    
}
