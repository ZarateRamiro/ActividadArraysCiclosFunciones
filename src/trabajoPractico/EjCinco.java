package trabajoPractico;
/*
Realizar un programa que defina un vector llamado “vectorNumeros” de 10 enteros, a continuación lo
inicialice con valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento del vector
junto con su cuadrado y su cubo.
 */

import java.util.Random;

public class EjCinco { public static void main(String[] args) {
  int[] vectorNumeros = new int[10]; //  Definir el vector de 10 enteros
  Random random = new Random(); // Generador de números aleatorios

  // Paso 2: Inicializar el vector con valores aleatorios del 1 al 10
  for (int i = 0; i < vectorNumeros.length; i++) {
    vectorNumeros[i] = random.nextInt(10) + 1; // random entre 1 y 10
  }

  for (int i = 0; i < vectorNumeros.length; i++) {
    int numero = vectorNumeros[i];
    int cuadrado = numero * numero;
    int cubo = numero * numero * numero;
    System.out.println("numero: " + numero + " caudrado: " + cuadrado + " cubo: " + cubo);
  }
}
}
