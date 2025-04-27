package TrabajoPractico;

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
