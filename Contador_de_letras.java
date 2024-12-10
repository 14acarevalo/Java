import java.util.Scanner;
public class Contador_de_letras {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        System.out.println(" Usuario dime una palabra y te mostraré las letras que contiene");
        String palabra = lector.nextLine();
        int contvocales = 0;
        

        for (int a = 0; a < palabra.length(); a++) {
            System.out.print(palabra.charAt (a) + " ");
            char letra = palabra.charAt(a);
        } 
            System.out.println();

    }
}
