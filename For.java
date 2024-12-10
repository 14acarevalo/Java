import java.util.Scanner;

public class For {
    public static void main(String[] args) {


/*         System.out.println("Empezamos con la estructura for");
        for (int i = 0; i<=10; i++) {
            System.out.println(i);
            if (i==4)
            continue ;
            System.out.println("Aqui termina una vuelta de " +i);
        }
    */



/*System.out.println("Empezamos con la estructura for");
        for (int i = 0; i<=10; i++) {
            System.out.println(i);
            if (i==4)
            break ;
            System.out.println("Aqui termina una vuelta de " +i);
        }
    }
}
*/

    Scanner lector = new Scanner (System.in);

    System.out.println ("Holaaaa!! Vamos a multiplicar los números, pero antes, para ello, dame un número");
    int num_multi = lector.nextInt();

    for (int a = 0; a<10; a=a+1) {
        System.out.println("La tabla de multiplicar de " +num_multi+ " es igual a " +num_multi* a);


    }

    }
}