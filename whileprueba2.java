import java.util.Scanner;

public class whileprueba2 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);

        //EJERCICIO 1//

        /*System.out.println("Usuario dame un número y vamos a calcular su factorial");
        int numero_mayor = lector.nextInt();
        int numero_inicial=1;
        int factorial = 1;
        while (numero_inicial<=numero_mayor) {
            System.out.println("El factorial de " + numero_mayor+ " es igual a " +factorial);
            numero_inicial++;
            factorial = factorial*numero_inicial;
        }
*/

        //EJERCICIO 2//

       /* System.out.println("Usuario, vamos a jugar a las adivinanzas, eres capaz de encontrar el número que pienso. Este será del 1 al 100");
        int numero_magico = lector.nextInt();

        int numero_comienzo = 1;
        int numero_final =100;
        int numero_secreto = 14;

        while (numero_comienzo<numero_final) {
            if (numero_magico < numero_secreto)  {
                System.out.println("Usuario, el número es más bajo, prueba otra vez");
                numero_magico=lector.nextInt();
            } else {
                if (numero_magico > numero_secreto) {
                    System.out.println("El número es más grande, error!, prueba otra vez");
                    numero_magico=lector.nextInt();
                }
            } if (numero_magico == numero_secreto) {
                System.out.println("Premio");
                numero_magico = lector.nextInt();
            }
        }
        */

        //EJERCICIO 3//
        System.out.println("Usuario, vamos a calcular la tabla de multiplicar del número que tú me digas, vamos allá!");
        int numero_usuario = lector.nextInt();
        int numero_comienzo = 1;
        int numero_final = 10;
        int multiplicación = 1;

        while (numero_comienzo<=numero_final) {
        
        
            System.out.println("La tabla de multiplicar del número " + numero_usuario + " x " + numero_comienzo + " es igual a " +multiplicación);
        numero_comienzo ++;
        multiplicación = numero_usuario * numero_comienzo;

        
    }
}
}

