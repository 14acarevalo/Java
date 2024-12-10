import java.util.Scanner;
import java.io.File;

public class Fichero_ejercicio {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        File fichero = new File ("C://fichero.txt");
        String linea = "";
        /***  A LA HORA DE TRABAJAR CON FICHEROS, SERÍA CONVENIENTE INTRODUCIR EL TRY Y EL CATCH PARA EVITAR FALLOS
        COMO QUE EL NOMBRE DEL FICHERO ESTE MAL ***/
        Scanner f_file=null;
        try {
            f_file = new Scanner (fichero);
            linea= f_file.nextLine();
            System.out.println(linea);
            }
        catch(Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            f_file.close();
        }
    }
}
