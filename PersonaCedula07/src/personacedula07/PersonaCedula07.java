package personacedula07;

import java.util.Date;

 
public class PersonaCedula07 {
    
    private String nombre;
    private String apellido;//atributo
    private Date fechaNacimiento; //Alt + Enter (Date)
    private String cedula;
    
    public PersonaCedula07(){
        this.nombre = "AnonimoU";
    }                           // constructor sin paranetros 
    
    public PersonaCedula07(String nombre){ //constructor con1 parametro
        this.nombre = nombre;
    }
    public PersonaCedula07(String nombre, String apellido){ // con 2 parametros
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public PersonaCedula07(String nombre, String apellido, Date fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //getters devuelve el valor de un atributo (van al final get and set)
    
    public String getNombre(){   
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    //cedula *accesores/ getter ***************************************
    
    public String getCedula(){
        return this.cedula;
    }
    
    //setter * mutadores /cedula **************************************
    
    public void setCedula(String cedula){
        if(cedulaValida(cedula)){
            this.cedula = cedula;
        }else {
            System.out.println("Cédula no válida");
        }
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
    
    //Metodo de validacion privado **************************
     
    private boolean cedulaValida(String cedula){
        //TODO implementar algoritmo de validacion cedula
        
        return false;
    }
    
   
    public static void main(String[] args) {
        
       PersonaCedula07 p = new PersonaCedula07();   //Constructor de clase Persona
       
        System.out.println("el nombre es = "+ p.nombre);
       
       p.nombre = "Andrés";
       p.apellido = "Alvear";
       p.fechaNacimiento = new Date("1998/12/28"); //Constructor usa new de clase Date
       
        System.out.println("el nombre es == "+ p.nombre);
       
       PersonaCedula07 p1 = new PersonaCedula07("David");
       
       System.out.println("el nombre es === "+ p1.nombre);
       
       p.nombre = p.nombre + " David";
        System.out.println("el nombre es )( " + p.nombre);
       
       p.setCedula("1726547993");
       p.setCedula("2121212121");
       
    }
    
}
