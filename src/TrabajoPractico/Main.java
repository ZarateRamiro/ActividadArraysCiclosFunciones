package TrabajoPractico;
    /*
    Notas  de estudiantes
Crea un programa que muestre por pantalla la nota de un estudiante buscándola de entre una
 lista de estudiantes con sus respectivas notas. Estos datos estarían previamente cargados.
El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).
Usa dos arrays, uno para guardar los nombres de los estudiantes, y el otro para guardar las
notas de los mismos. Ambos tendrán 5 elementos. Puedes guardar la información relacionada en
ambos arrays con el mismo valor del índice. Por ejemplo el estudiante Pedro está en la posición
2 del array de estudiantes, su nota estaría en la posición 2 del array de notas. Para comparar el nombre
del estudiante introducido por teclado con los nombres de los estudiantes en el array de estudiantes, puedes usar
 el método equals de la Clase String.
     */
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final Logger LOG=Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        String[] nombres = {"Ramiro", "Luis", "Antonio", "Parker", "Pitter"};

        int[] notas={5,6,7,4,8};
        Scanner sc=new Scanner(System.in);
        mostrarMensjae(nombres,notas);

    }//cierre main
    static void mostrarMensjae(String[] nombres,int[] notas){
        System.out.println("ingrese el nombre del estudiante que desea saber la nota");
        System.out.println("(Ramiro\", \"Luis\", \"Antonio\", \"Parker\", \"Pitter)");
        Scanner sc=new Scanner(System.in);
        String busqueda= sc.next();
        switch (busqueda){
            case "Ramiro":
                System.out.printf("la nota del alumno" + nombres[0] + " es: " + notas[0]);
                break;
            case "Luis":
                System.out.println("la nota del alumno" + nombres[1] + " es: " + notas[1]);
                break;
            case "Antonio":
                System.out.println("la nota del alumno" + nombres[2] + " es: " + notas[2]);
                break;
            case "Parker":
                System.out.println("la nota del alumno" + nombres[3] + " es: " + notas[3]);
                break;
            case "Pitter":
                System.out.println("la nota del alumno" + nombres[4] + " es: " + notas[4]);
                break;
            default:
                LOG.warning("EL NOMBRE DEL ALUMNO NO ES VALIDO");
        }

    }
}