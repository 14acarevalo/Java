/* import java.util.Scanner;
public class Dibujar_figuras_ejerciciosrepaso {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

         
        System.out.println("Usuario, vamos a dibujar un rectángulo");
        System.out.println("Para ello, necesito que me des la altura");
        int altura = lector.nextInt();
        System.out.println("Bien, ahora dame la base");
        int base = lector.nextInt();
        System.out.println("Bien, vamos a pintar el rectangulo con *");
        System.out.println("El resultado es:");

        for (int a = 0; a<altura; a++) {
            for (int b = 0; b<base; b++) {
                if (a == 0 || a == altura -1 || b == 0 || b == base -1) System.out.print("* ");
                else  System.out.print("  ");
                } System.out.println();
            } 

        /*** EN ESTE EJERCICIO VAMOS A REALIZAR UN TRIÁNGULO RECTÁNGULO 
        ESTARÁ COMPLETMENTE LLENO***/

 /*        

        System.out.println("Hola usuario, vamos a dibujar un triangulo rectángulo, para ello necesito que me des unos datos");
        System.out.println(" Necesito la altura del triangulo");
        int altura = lector.nextInt();

        System.out.println();
        for (int a = 0; a < altura; a++) {
            for (int b = 1; b<=a; b++) {
                for (int c = 1; c>=b; c--) {
                    System.out.println(" *");
                } System.out.println("* ");



                if (a == 0 || a == altura -1 || b == 1 || b == a) System.out.print("* ");
            else System.out.print("  ");}
        } System.out.print ("*");
     } System.out.println();
}
 */