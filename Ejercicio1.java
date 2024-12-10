import java.util.Scanner;

public class Ejercicio1 {

    public static void main (String[] arg) {

/**Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos 
 * introducidos por teclado. El programa terminará cuando el usuario introduzca un número primo. 
 * Este último número no se tendrá en cuenta en los cálculos. 
 * El programa debe indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).

 * 
 */
        Scanner lector = new Scanner(System.in);
        int media = 0;
        int max = 0;
        int numero;
        int min = 0;
        int contador =0;
        int par;
        int impar;


        System.out.println("Usuario, introduce una serie de numeros");
        numero = lector.nextInt();

            if (numero != 1 || numero !=2 || numero % 2 ==0 ) {
                System.out.println("El numero " +numero+ " no es primo");
                contador++;
                numero = lector.nextInt();
            } else {
                System.out.println("El programa termina aqui porque has introducido un número primo");
                contador++;
            }

            System.out.println ("En total has introduciedo " +contador+ " numeros");





    }
    
}
