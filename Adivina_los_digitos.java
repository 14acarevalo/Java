import java.util.Scanner;

public class Adivina_los_digitos {
    public static void main(String[] args) {
        
      Scanner lector = new Scanner (System.in); 
      System.out.println("Usuario, introduce un número y vamos a adivinar sus digitos");
      int num = lector.nextInt();

      
    
        System.out.println("El número " +num+ " tiene " + ((num/10)+1) + " dígitos");
      
}

}