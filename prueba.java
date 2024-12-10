
public class prueba {
    
public static void main(String[] args) {
    
    String cadena = "CURSO java";
    String prueba = "Esta frase la vamos a alargar para ver como es la longitud";
    int longitud = prueba.length();
    String cadenaMAYUSCULAS = prueba.toUpperCase();
    String cadenaminusculas = prueba.toLowerCase ();
    String cogerparametros = prueba.substring(2,6);
    String remplazar = prueba.replace(cadenaminusculas, cogerparametros);


  System.out.println("La longitud de esta cadena es " +longitud);
  System.out.println ("La segunda letra es " + prueba.charAt(1));
  System.out.println ("La cadena en minusculas es " +cadena+ " y la cadena en mayúsculas es " +cadenaMAYUSCULAS);
  System.out.println ("La cadena en mayúsculas es " +cadenaMAYUSCULAS+ " y la cadena en minusculas es " + cadenaminusculas);
  System.out.println("Vamos a saltar en lineaLa cadena se corresponde con " +cogerparametros);
  System.out.println (remplazar);

  String nueva = """
      
  Con estas 3 comillas, lo que vas a poder hacer
  es escribir cadenas mucho más largas de texto
  como aprecias aqui, hay 3 frases seguidas
  donde no he puesto las comillas y funciona de verdad
  Por cierto, al finalizar el ; debe aparecer, aunque aqui lo ha generado sólo
      """;

System.out.println (nueva);
String texto = "\n\n Esto es un prueba para ver como salta, las n marcan el espacio y la t la tabulación \n\n";
System.out.println(texto);






  String nombre = "Alberto";
  String apellidos = "Campanero Arévalo";
  String nombrecompleto = nombre + apellidos;
  int longitud1 = nombre.length();
  int longitud2 = "245".length();
  char letra = apellidos.charAt(3);
  String cadena1 = nombrecompleto.substring(0,4);
  String cadena2= " Hola ". trim();
  String cadena3_1 = cadena1.substring (3,4);
  





}
    
}
