import java.util.Scanner;

public class Ejercicio_2_practica {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);

        System.out.println("Usuario, ¿cuántos números vas a introducir?");
        int num_usuario = lector.nextInt();
        int cont =0;
        int mayor =0;
        int menor = 0;

        while (cont<num_usuario){
        System.out.println("Usuario, dame un número");
        int num_introducir=lector.nextInt();
        cont = cont+1;
        

        if (mayor<num_introducir) {
            mayor = num_introducir;
        }
        menor = mayor;
        if (menor>num_introducir) {
            menor = num_introducir;
        } 
        
        


        }

System.out.println("El número más grande es " +mayor);
            
System.out.println("El número más pequeño es " +menor);



    }
}
