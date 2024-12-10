import java.util.Scanner;
public class Dibujar_figuras {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);

        System.out.println("Usuario, vamos a crear un ractangulo, para ello, necesito que me digas la base");
        int base = lector.nextInt();
        System.out.println("Ahora necesito que me digas la altura");
        int altura = lector.nextInt();

        for (int a = 0; a<altura; a++ ) {
            for (int b = 0; b<base; b++) {
                if ( a == 0 || a==altura-1 || b == 0 || b == base-1 ) System.out.print ("* ");
           else System.out.print("  ");       
        } System.out.println();
    }
        
    }
}
