import java.util.Scanner;

public class switch {
    
    
    public static void main(String[] args) {
       
        Scanner lector = new Scanner (System.in);

       /*  System.out.println("Usuario, dame un número");
        int x = lector.nextInt();

        switch (x) {
            case 1:
            case 2:
            case 3:
            System.out.println("El valor de x es igual a 1, 2 o 3");
            break;

            case 4:
            System.out.println(("El valor de x es igual a 4"));
                break;
            
            case 5:
            System.out.println("El valor de x es igual a 5");
            break;

            default:
            System.out.println("El valor de x es 0 o superior a 5");
                break;
        }*/
    
       /*System.out.println("Usuario, dime un día de la semana");
       String dia_de_la_semana = lector.nextLine();

        
            switch (dia_de_la_semana) {
                case "lunes":
                System.out.println("Bien, has introducido el lunes, por lo tanto es el primer día de la semana");
                    break;
            
                case "martes":
                System.out.println("Bien, has introducido martes, es el segundo dia");
                    break;

                case "miercoles":
                System.out.println("Bien, has introducido miércoles, el tercer día de la semana");
                    break;

                case "jueves":
                System.out.println("Bien, has introducido el jueves, el cuarto día de la semana");
                    break;

                case "viernes":
                System.out.println("Bien, has introducido vienres, nos encontramos ante el quinto día");
                break;
                
                case "sabado":
                System.out.println("Bien, has introducido sábado, ya está aqui el fin de semana");
                    break;

                case "domingo":
                System.out.println("Ale ricón, a descansar");
                    break;

                
                default:
                System.out.println("Bien, ya sabes en que día te encuentras, no?");
                    break;
            }
        }
    
    
    
    }

*/
    String signos = "putas";
    System.out.println("Usuario, dime que en que mes naciste y te diré tu simbolo del zodiaco");
    String mes_de_nacimiento = lector.nextLine ();
    switch (mes_de_nacimiento) {
        case "enero":
                signos = "Capricornio y acuario";

        System.out.println("Eres capricornio y acuario");
        break;
        case "febrero":
        System.out.println("Eres acuario y piscis");
            break;
        case "marzo":
        System.out.println("Eres piscis y aries");
        break;
        case "abril":
        System.out.println("Eres aries y tauro");
        break;
        case "mayo":
        System.out.println("Eres tauro y geminis");
        break;
        case "junio":
        System.out.println("Eres geminis y cáncer");
        break;
        case "julio":
        System.out.println("Eres cáncer y leo");
        case "agosto":
        System.out.println("Eres leo y virgo");
        break;
        case "septiembre":
        System.out.println("Eres virgo y libra");
        break;
        case "octubre":
        System.out.println("Eres libra y escorpio");
        break;
        case "noviembre":
        System.out.println("Eres escorpio y sagitario");
        break;
        case "diciembre":
        System.out.println("Eres sagitario y acuario");
        break;
        default:
            break;
    
        }
        System.out.println("Ahora bien, para determinar que simbolo del zodiaco eres, permiteme que te pida el día en el que naciste");
        int dia_de_nacimiento = lector.nextInt();
        int divisor_signos = signos.indexOf("y");
        //signos = signos.substring(0, num);
        if (dia_de_nacimiento<=20) {    
            
            System.out.println("Tu simbolo del zodiaco se corresponde con el primer simbolo de la respuesta anterior, por ser el " +dia_de_nacimiento + " de " + mes_de_nacimiento + " "+signos);
        } else {
            if (dia_de_nacimiento>20) {
                System.out.println ("Tu simbolo del zodiaco se corresponde con el segundo simbolo de la respuesta anterior, por ser el " +dia_de_nacimiento + " de " + mes_de_nacimiento);
            }
        }


        }

    }

