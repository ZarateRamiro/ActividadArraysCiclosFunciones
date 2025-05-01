package trabajoPractico;
/*
Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el
teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.
 */
import java.util.Scanner;

public class EjSeis {public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String[] vectorOriginal = new String[5];   // Vector original
  String[] vectorInverso = new String[5];    // Vector para guardar en orden inverso

  // Paso 1: Leer datos del teclado e inicializar el vector original
  System.out.println("Ingresá 5 palabras:");
  for (int i = 0; i < vectorOriginal.length; i++) {
    System.out.print("Palabra " + (i + 1) + ": ");
    vectorOriginal[i] = scanner.nextLine();
  }

  // Paso 2: Copiar los elementos en orden inverso
  for (int i = 0; i < vectorOriginal.length; i++) {
    vectorInverso[i] = vectorOriginal[vectorOriginal.length - 1 - i];
  }

  // Paso 3: Mostrar el vector inverso
  System.out.println("\nVector en orden inverso:");
  for (String palabra : vectorInverso) {
    System.out.println(palabra);
  }
}
}
