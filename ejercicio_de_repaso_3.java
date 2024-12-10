import java.util.Scanner;

public class ejercicio_de_repaso_3 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Usuario, ¿Cuántos números vas a ingresar?");
        int numeros_a_ingresar = lector.nextInt();
        int suma = 0;
        float promedio = 0;
        int contador = 0;
        float media =0;
        

        while (contador < numeros_a_ingresar) {
            System.out.println("Usuario, dame el numero ");
            int num = lector.nextInt();
            contador ++;
              suma = suma + num;
              media = suma/numeros_a_ingresar;
              promedio = suma/2;
        }

      
            System.out.println("El resultado de la suma de los " + numeros_a_ingresar + " que has puesto, es igual a " +suma);
            System.out.println("La media es igual a " +media);
            System.out.println("El promedio de los " +numeros_a_ingresar+ " que has añadido es igual a "+ promedio);

    }
}
