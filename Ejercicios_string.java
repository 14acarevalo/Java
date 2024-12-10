import java.util.Scanner;

public class Ejercicios_string {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);

        System.out.println("Usuario, dime una palabra y vamos a analizar cuantas letras tiene");
        String palabra = lector.nextLine();

        for (int i = 0; i < palabra.length(); i++) {   //CON LENGTH SE MIRA LA LONGITUD
        System.out.print( palabra.charAt(i) + " - ");  // CON CHARAT SE MIRA LETRA POR LETRA

        } System.out.println();
    }
}
