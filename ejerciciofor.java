import java.util.Scanner;

public class ejerciciofor {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);


        System.out.println ("Holaaaa!! Vamos a multiplicar los números, pero antes, para ello, dame un número");
        int num_multi = lector.nextInt();
    
        for (int a = 0; a<10; a=a+1) {
            System.out.println("La tabla de multiplicar de " +num_multi+ " es igual a " +num_multi* a);
    
    
        }
        }
    }

    

