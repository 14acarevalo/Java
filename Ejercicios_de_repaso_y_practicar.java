import java.util.Scanner;

public class Ejercicios_de_repaso_y_practicar {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        int suma = 0;
        int num = 0;
        int num_acumulado = 0;
       
       
        do {
            System.out.println("Usuario, dame los números ");
            num = lector.nextInt();


           
               suma = suma +num;
               num_acumulado = num_acumulado +1;
                
            

        } while (num > 0 );

       System.out.println("El resultado es igual a la suma de los " +num_acumulado+ " numeros acumulados y como resultado obtenemos " +suma);
        suma = suma + num; 
        num_acumulado = num_acumulado +1;

    }
}
    


   
