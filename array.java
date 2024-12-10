public class array {
    public static void main(String[] args) {
        
       
   
         int [] indice = {1,2,3,4,5,6,7,8,9,10};
         int suma  = 0;
try {
         for (int i = 0; i <= indice.length; i++) {
         
        suma = suma + indice [i];  }
         System.out.println("El resultado es igual a " +suma);

        } catch (Exception e) {
            System.out.println("Error en el programa");
        }

}
}
