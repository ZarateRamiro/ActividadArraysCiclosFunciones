package trabajoPractico;
/*
Crear un programa que contenga una función que calcule el promedio de un array de notas
 de estudiantes y otra función que devuelva la nota más alta.
Cargar el array notas de forma manual con 5 valores. Mostrar en consola: el promedio
y la nota más alta.
 */

public class EjOcho {
  public static void main(String[] args) {
    // Array cargado manualmente con 5 notas
    double[] notas = {7.5, 8.0, 6.0, 9.2, 7.8};

    // Calcular y mostrar el promedio
    double promedio = calcularPromedio(notas);
    System.out.println("Promedio de notas: " + promedio);

    // Calcular y mostrar la nota más alta
    double notaMaxima = obtenerNotaMasAlta(notas);
    System.out.println("Nota más alta: " + notaMaxima);
  }

  // Función para calcular el promedio
  public static double calcularPromedio(double[] array) {
    double suma = 0;
    for (double nota : array) {
      suma += nota;
    }
    return suma / array.length;
  }

  // Función para obtener la nota más alta
  public static double obtenerNotaMasAlta(double[] array) {
    double max = array[0];
    for (double nota : array) {
      if (nota > max) {
        max = nota;
      }
    }
    return max;
  }
}

