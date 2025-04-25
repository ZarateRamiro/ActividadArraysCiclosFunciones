package EjemploArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MetodoArrays {
    public static void main(String[] args) {
        int[] alfajores = {1, 2, 3, 3, 2, 1, 0, 10, 3, 5, 2, 5, 3, 1, 0, 10};
        //array.copyOf hace una copia del array
        int[] alfajoresPagos = Arrays.copyOf(alfajores, alfajores.length);
    //equals indica v o f comparando arrays por igualdad
        boolean sonIguales = Arrays.equals(alfajores, alfajoresPagos);
        System.out.println("los arrays on iguales " + sonIguales);
        //ordenar
        Arrays.sort(alfajoresPagos);
        boolean sonIguales2 = Arrays.equals(alfajores, alfajoresPagos);
        System.out.println("los arrays on iguales " + sonIguales2);

        for (int i = 0; i < alfajores.length; i++) {
            System.out.println("la posicion " + i + "es" + +alfajoresPagos[i]);
        }
        //copio un rango de valores de otro array
        int otros[] = Arrays.copyOfRange(alfajores, 2, 5);
        for (int i = 0; i < alfajores.length; i++) {
            System.out.println("la posicion otros " + i + "es" + +alfajoresPagos[i]);
        }
        //obtengo el array como string
        System.out.println(Arrays.toString(alfajores));
    }//cierre main
}
