import java.util.Scanner;

public class try_and_catch {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        int divisor =0;
        int dividendo = 0;
        boolean repetir = true;

        do {
        try {
            repetir = false;
        System.out.println("Usuario, vamos a calcular los datos de una división");
        System.out.println("Usuario, dame el dividiendo");
        dividendo = lector.nextInt();
        System.out.println("Ahora dame el divisor");
        divisor = lector.nextInt();

        System.out.println("El resultado de esta división es igual a " +dividendo/divisor);
    

/* } catch (InputMismatchException e) {
    repetir = true;
    System.out.println("Usuario, te estoy pidiendo un número, si me pones algo diferente, no podemos avanzar");
    lector.nextLine();

} catch (ArithmeticException e1) {
    repetir = true;
    System.out.println("Usuario, el número que me has dado no me vale para nada");
}*/

        } catch (Exception e) {
            repetir = true;
            System.out.println("Se esta produciendo un fallo en el programa");
            lector.nextInt();
        } 
} while (repetir); {}
}
}