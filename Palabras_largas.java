import java.util.Scanner;

public class Palabras_largas {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        System.out.println("Usuario, vas a introducir 5 palabras y vamos a comprobar cual es la más larga, empezamos");
        String palabra = lector.nextLine();
        String palabra_de_mayor_longitud ="";

        for (int a = 1; a<5; a++) {
            System.out.println("introduce la siguiente palabra " +a);
            palabra = lector.nextLine();

            if (palabra.length()>palabra_de_mayor_longitud.length()) {
                palabra_de_mayor_longitud=palabra;
            }

        }

        System.out.println("La palabra de mayor longitud es " +palabra_de_mayor_longitud);
    }
}
