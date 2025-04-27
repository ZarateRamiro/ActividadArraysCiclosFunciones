package TrabajoPractico;

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
        System.out.println("");
            System.out.println("Array invertido:");
            for(int num2:invertido) {
                System.out.print(num2 + " ");
            }
        }

    }

