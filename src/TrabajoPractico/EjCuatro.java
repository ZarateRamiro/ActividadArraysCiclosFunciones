package TrabajoPractico;
/*
 Cargar Ticket
Escribe un programa que pida al usuario que introduzca los datos de un ticket y luego los presente por pantalla.
El Ticket tendrá tres partes. La cabecera, el listado de productos con sus datos, y el pie con el total .
La cabecera tendrá la siguiente información: Producto, unidades, precio/unidad y total.
Le pediremos al usuario que introduzca los datos anteriores para tres productos. Por lo que el cuerpo de la
factura tendrá 3 líneas.
Calcular y Mostrar el Total del ticket
 */
import java.util.Scanner;

public class EjCuatro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] producto=new String[3];
        double [] precioProducto= new double[3];
        int [] cantidadProducto= new int[3];
        double [] totalProducto= new double[3];
        double total=0;
        for(int i=0; i< 3; i++){
            System.out.println("Ingrese el nombre del producto Nº" + (i+ 1) +" : ");
            producto[i]= sc.nextLine();
            System.out.println("Ingrese precio del producto: ");
            precioProducto[i]= sc.nextDouble();
            System.out.println("ingrese la cantidad de unidades: ");
            cantidadProducto[i]= sc.nextInt();
            sc.nextLine();
            totalProducto[i]=precioProducto[i]*cantidadProducto[i];
            total+=totalProducto[i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-10d $%-14.2f $%.2f\n", producto[i], cantidadProducto[i], precioProducto[i], totalProducto[i]);
        }
        System.out.printf("TOTAL A PAGAR: $" + total);
    }
}
