package TrabajoPractico;

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