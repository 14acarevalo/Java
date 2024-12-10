import java.util.Scanner;

public class BuclesWhile {
    public static void main(String[] args) {
       /*  Scanner lector = new Scanner(System.in);
        int num = 0;

        System.out.println("Usuario introduce un número diferente de 0 en este bucle, venga, vamos");
        num = lector.nextInt();
        int total = 0;
        while (num != 0) {
            System.out.println("Bien, el número introducido no es 0 para seguir en el bucle");
            num = lector.nextInt();
            total += num;
        } System.out.println(("Has introducido cero, hemos terminado"));
        System.out.println(("La suma de todos los números introducidos es igual a " +total));*/
    
    Scanner lector = new Scanner(System.in);
    
    System.out.println("Usuario, vamos a multiplicar el número que me has introducido por su tabla, hasta el número 10");
    int num_magico = lector.nextInt();
    int num = 1;
    
    while (num<=10) {
        int multi = num_magico * num;
       System.out.println("El resultado es " + num_magico + " x " + num + " = " +multi);
       num ++;
    }

    /*System.out.println("Usuario, dime un número y te calcularé el factorial");
    
    int factorial = 1;
    int inicio = 1;
    while (inicio<=5) {
       
        
        factorial= factorial * inicio;
         inicio ++;
       
    } */
    
    
}
}
            
            
    
    

