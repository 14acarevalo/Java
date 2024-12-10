import java.util.Scanner;

public class contar_vocales {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String palabra = "";
        String palabra_muy_larga = "";

        for (int a = 0; a < 5; a++) {
            System.out.println("Usuario, introduce la palabra número " +a );
            palabra = lector.nextLine();

            if (palabra.length()>palabra_muy_larga.length()) {
            palabra_muy_larga=palabra;
            }

        } 
        System.out.println("La palabra más larga es " +palabra_muy_larga);






        /* 
        System.out.println("Usuario, vamos a contar las vocales de la palabra que me introduzcas, dime una palabra");
        String palabra = lector.nextLine();
        int cont = 0;

//CONTAR VOCALES MEDIANTE CHAR
        for (int i =0 ; i<palabra.length(); i ++) {
            System.out.print(palabra.charAt(i) + " ");

            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o'|| palabra.charAt(i) == 'u') {
            cont++;
            System.out.print("// vocal = "+ palabra.charAt(i) +"// ");
            }
        }
        System.out.println();
        System.out.println("En total, la palabra " +palabra+ " tiene " + cont + " vocales");



        //Pablo - esto sirviría para conocer las letras, la longitud!
        System.out.println("El número de letras de la palabra escrita es: " + palabra.length()); */
    
    
    }
}
