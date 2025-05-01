package trabajoPractico;

import java.util.Scanner;

public class EjNueve {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Conversor de Temperatura");
    System.out.println("1. Celsius a Fahrenheit");
    System.out.println("2. Fahrenheit a Celsius");
    System.out.print("Elegí una opción (1 o 2): ");
    int opcion = sc.nextInt();

    if (opcion == 1) {
      System.out.print("Ingresá la temperatura en Celsius: ");
      double celsius = sc.nextDouble();
      double fahrenheit = celsiusAFahrenheit(celsius);
      System.out.println("Equivale a " + fahrenheit + " °F");
    } else if (opcion == 2) {
      System.out.print("Ingresá la temperatura en Fahrenheit: ");
      double fahrenheit = sc.nextDouble();
      double celsius = fahrenheitACelsius(fahrenheit);
      System.out.println("Equivale a " + celsius + " °C");
    } else {
      System.out.println("Opción inválida.");
    }
  }

  // Función para convertir de Celsius a Fahrenheit
  public static double celsiusAFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  // Función para convertir de Fahrenheit a Celsius
  public static double fahrenheitACelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }
}

