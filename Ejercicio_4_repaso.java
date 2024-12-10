import java.util.Scanner;

public class Ejercicio_4_repaso {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);

        System.out.println("Usuario, ¿cuántos números vas a introducir?");
        int num_nuevo = lector.nextInt();
        int cont = 0;
        int num_a_introducir =0;
        int par = 0 ;
        int impar = 0;

        while (cont<num_nuevo) {
            System.out.println("Usuario, dame el número " +(cont+1));
            num_a_introducir = lector.nextInt();
            cont++;

            if (num_a_introducir%2==0) {
                System.out.println("El número introducido " +num_a_introducir+ " es par");
                par ++;
                
            }

            if (num_a_introducir%2 !=0) {
                System.out.println("El número introducido " + num_a_introducir+ " es impar");
                impar ++;
                
            }
        }

        System.out.println("En total, de los " +num_nuevo+ " introducido, hay " + par + " pares y " +impar+ " impares");
        



    }
}
