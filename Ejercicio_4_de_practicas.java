import java.util.Scanner;

public class Ejercicio_4_de_practicas {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Usuario, dime un número y calculamos su factorial");
        int num_a_añadir = lector.nextInt();
        int factorial = 1;
        int primer_numero = 1;


        if (num_a_añadir>0) {
        for (primer_numero = 1; primer_numero<=num_a_añadir; primer_numero ++) {
        factorial = factorial * primer_numero;       
        }
    }
        System.out.println("El factorial de " + num_a_añadir + " es igual a " +factorial);
        
    } 
}
