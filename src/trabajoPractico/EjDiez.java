package trabajoPractico;

import java.util.Arrays;

public class EjDiez {

  public static void main(String[] args) {
    int[] numeros = {1, 2, 3, 4, 5};

    // Mostrar antes de rotar
    System.out.println("Array original: " + Arrays.toString(numeros));

    // Llamar a la función que rota a la derecha
    rotarDerecha(numeros);

    // Mostrar después de rotar
    System.out.println("Array rotado a la derecha: " + Arrays.toString(numeros));
  }

  // Función para rotar a la derecha
  public static void rotarDerecha(int[] array) {
    if (array.length == 0) return;

    int ultimo = array[array.length - 1];

    // Desplazar todos los elementos una posición a la derecha
    for (int i = array.length - 1; i > 0; i--) {
      array[i] = array[i - 1];
    }

    // Colocar el último elemento en la primera posición
    array[0] = ultimo;
  }
}

