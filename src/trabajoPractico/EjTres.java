package trabajoPractico;
/*
Invertir valores array
Escribe un programa java que invierta el orden de los valores de un array. Al invertir el orden
de los valores de un array,  el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente.
El array está previamente  completo de valores enteros, que puede tener cualquier longitud.
El programa primero dibujara por pantalla los elementos del array en orden y luego los elementos del array invertido.
 */
public class EjTres {
    public static void main(String[] args) {
        int[] numOrdenados = {100, 250, 23, 1, 99, 69, 7777};
        int[] invertido = new int[numOrdenados.length];
        System.out.println("Array original:");
        for (int num : numOrdenados) {
            System.out.print(num + " ");}
        for(int i=0; i<numOrdenados.length;i++){
            invertido[i]=numOrdenados [numOrdenados.length-1 -i];
        }
        System.out.println();
            System.out.println("Array invertido:");
            for(int num2:invertido) {
                System.out.print(num2 + " ");
            }
        }

    }

