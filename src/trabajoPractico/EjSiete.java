package trabajoPractico;
/*
Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4)
 y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. Para simplificarlo vamos
  a suponer que febrero tiene 28 días.
 */

import java.util.Scanner;

public class EjSiete {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Vectores: nombres de los meses y días correspondientes
    String[] nombresMeses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    int[] diasMeses = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Pedir número de mes
    System.out.print("Ingresá un número de mes (1-12): ");
    int numeroMes = scanner.nextInt();

    // Validar el número ingresado
    if (numeroMes >= 1 && numeroMes <= 12) {
      int indice = numeroMes - 1; // Convertir a índice de array (0 a 11)
      System.out.println("Mes: " + nombresMeses[indice]);
      System.out.println("Días: " + diasMeses[indice]);
    } else {
      System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
    }
  }
}