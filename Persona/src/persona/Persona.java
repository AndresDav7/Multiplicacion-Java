package persona;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private String apellido;//atributo
    private Date fechaNacimiento; //Alt + Enter (Date)
    
    
    public Persona(){
        this.nombre = "AnonimoU";
    }                           // constructor sin paranetros 
    
    public Persona(String nombre){ //constructor con1 parametro
        this.nombre = nombre;
    }
    public Persona(String nombre, String apellido){ // con 2 parametros
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre(){  //getters devuelve el valor de un atributo 
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    //setters no devuelve nada
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
     public void setApellido(String apellido){
        this.apellido = apellido;
    } 
     public void setFechaNacimiento(Date fechaNacimiento){
         this.fechaNacimiento = fechaNacimiento;
     }
   
    public static void main(String[] args) {
        
       Persona p = new Persona();   //Constructor de clase Persona
       
        System.out.println("el nombre es = "+ p.nombre);
       
       p.nombre = "Andrés";
       p.apellido = "Alvear";
       p.fechaNacimiento = new Date("1998/12/28"); //Constructor usa new de clase Date
       
        System.out.println("el nombre es == "+ p.nombre);
       
       Persona p1 = new Persona("David");
       
       System.out.println("el nombre es === "+ p1.nombre);
       
       p.nombre = p.nombre + " David";
        System.out.println("el nombre es )( " + p.nombre);
       
                
    }
    
}
