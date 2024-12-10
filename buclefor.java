public class buclefor {
    public static void main(String[] args) {
        

        /*int a =4;
        int b = 3;

        for (int j = 0; j<4; j++) {
            for (int i =0; i < b; i++) {
                System.out.print(i);
            }
        }*/


        int cantidad =0;
        for (int a =0; a<=100; a = a+2) {
            for (int b = 0; b<10; b = b + 3) { /*ten en cuenta que por aqui pasará 10 veces, cada vuelta de la variable a*/
                cantidad ++;
            } cantidad ++; 
            System.out.println(cantidad);
        }
    }
}
