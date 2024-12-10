/* import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);

EJERCICIO 1 - REALIZAR LA DIVISIÓN DE 2 NÚMEROS CON TRY AND CATCH
       try {
        System.out.println("Usuario, dame números para calcular la división");
        System.out.println("Dame el primer número (dividendo)");
        int num1_dividendo = lector.nextInt();
        System.out.println("Bien, ahora dame el segundo número (divisor)");
        int num2_divisor =lector.nextInt();
        System.out.println("El resultado es igual a " + num1_dividendo/num2_divisor);

} catch (Exception e) {
    System.out.println("Error 404, no se puede dividir por 0");
}
    



 EJERCICIO 2CONVERJENCIA DE NÚMEROS STRING A INT 
try {
    System.out.println("Usuario, dame un número");
    String inpuString = lector.nextLine();

    int numero = Integer.parseInt(inpuString);
    System.out.println("El número es " + numero);
    } catch (NumberFormatException e) {
        System.out.println("No hemos podido conseguir ese número");
        
    } 

    /*EJERCICIO 3 INGRESAR INDICES DE NÚMEROS

    int [] numeros = {1,2,3,4,5,6,7};

    try {
        System.out.println("Usuario ingresa un indice");
        int indice = lector.nextInt();

        int valor = numeros [indice];
        System.out.println("El indice ingresado es válido");

    } catch (Exception e) {
        System.out.println("Error, ese número no vale");
    }
}

}
*/