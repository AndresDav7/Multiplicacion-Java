package personacedula07;

public class Principal {
    
    public static void main (String[] args){
    
    PersonaCedula07 p2 = new PersonaCedula07();    
    PersonaCedula07 p3 = p2;
    
        p2.setNombre("Andres");
        p3.setApellido("Alvear");
        
        System.out.println("P2 " + p2.getNombre());
        System.out.println("P3 " + p3.getNombre());
        
        System.out.println("P2 " + p2.getApellido());
        System.out.println("P3 " + p3.getApellido());
        
       String greeting = "Hello,World ";
       String greeting2 = greeting;
       
       greeting2.toUpperCase();
       
       String g3 = greeting2.toUpperCase();
       
       
        System.out.println(greeting2);
        System.out.println(g3);
        //System.out.println(42+7);
    }
}
