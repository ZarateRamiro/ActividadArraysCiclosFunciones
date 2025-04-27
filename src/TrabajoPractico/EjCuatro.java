package TrabajoPractico;

import java.util.Scanner;

public class EjCuatro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] producto=new String[3];
        double [] precioProducto= new double[3];
        int [] cantidadProducto= new int[3];
        double [] totalProducto= new double[3];
        int total=0;
        for(int i=0; i<3; i++){
            System.out.println("Ingrese el nombre del producto Nº" + (i++) +" : ");
            producto[i]= sc.nextLine();
            System.out.println("Ingrese precio del producto: ");
            precioProducto[i]= sc.nextDouble();
            System.out.println("ingrese la cantidad de unidades: ");
            cantidadProducto[i]= sc.nextInt();
        }

    }
}
