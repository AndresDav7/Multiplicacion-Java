package estudiantes;


public class Principal {
    
     public static void main(String[] args) {
       
       Estudiantes[] estudiantes = new Estudiantes[5];
       
       estudiantes[1] = new Estudiantes("Ana","Castro","1289047895"); //3 materias
       estudiantes[2] = new Estudiantes("Pedro","Benitez","1230478945"); // 4 materia
       estudiantes[3] = new Estudiantes("David","Salvador","1012354789"); //3 materias
       estudiantes[4] = new Estudiantes("Jose","Martinez","0890478954"); //2 materias
       estudiantes[0] = new Estudiantes("Juan","Perez","1234567890"); //2 materias
       
       String[] m  = {"m1","m2"};
       String[] m1 = {"m2","m3","m4"};
       String[] m2 = {"m2","m3","m4","m5"};
       String[] m3 = {"m2","m3","m4"};
       String[] m4 = {"m1","m2"};         
           
        estudiantes[0].setMaterias(m);
        estudiantes[1].setMaterias(m1);
        estudiantes[2].setMaterias(m2);
        estudiantes[3].setMaterias(m3);
        estudiantes[4].setMaterias(m4);   
        
        System.out.println(" ****** Información ****** ");
        
        for(int i=0;i<5;i++){
            
         String [] materiasEstudiante = estudiantes[i].getMaterias();
           
         System.out.println(" ** Estudiante "+ (i+1));
         System.out.println(" Nombre Completo = " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido());
         System.out.println(" Cedula = " + estudiantes[i].getCedula());
         System.out.println(" Materia: ");
         for(int j=0;j <materiasEstudiante.length;j++){
            System.out.println(" " + materiasEstudiante[j]);
            }
        }
           System.out.println("\n");
        /*
         System.out.println(" Resumen Materias ");
         System.out.println(" M1 = " + );
         System.out.println(" M2 = " + );
         System.out.println(" M3 = " + );
         System.out.println(" M4 = " + );
         System.out.println(" M5 = " + );
         */
        
    }
    
}
