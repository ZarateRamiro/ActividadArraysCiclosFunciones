package TrabajoPractico;
/*
Numero veces letra en texto
Escribe un programa que pida al usuario que introduzca un texto y una letra.
Después el programa tiene que calcular y presentar por pantalla, cuantas veces aparece la letra en el texto.
Pista: Un string es un array de caracteres. Para acceder a un elemento del string, usa la función chartAt(posición).
Por ejemplo. Si el string es “Hola Mundo”, con la sentencia text.charAt(3), recuperamos el carácter ‘a’. Recuerda que
las posiciones empiezan en 0.
 */
import java.util.Scanner;

public class EjDos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingese el texto que desesa calcular ");
        String texto= sc.next();
        System.out.println("ingrese la letra que desea buscar y analizar ");
        char letra = sc.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en el texto.");

    }//cierre main
}
