package Funciones;

import java.util.logging.Logger;

public class EjFunciones {
    //tipoDeRetorno \ nombre funcion \ (tipo de marametro)
    public static String tema = "funcion o metodo";
    public static final Logger LOGGER = Logger.getLogger(EjFunciones.class.getName());

    public static void main(String[] args) {
        double x = 10.5;
        double suma = sumarDosNros(5, x);
        mostrarMensaje(suma);
        mostrarMensasjeBienvenida("luis");
        mostrarMensasjeBienvenida("luis", "zarate");
        LOGGER.info(tema);
        System.out.printf(mostarMensajeBienvenida("Ramiro", 5));
        mostarNumeroDecreciente(3);
        String [] nombres={"juan","luis","anuel"};
        maostrarNombressArray(nombres);

    }//cierre main

    static double sumarDosNros(int nro1, double nro2) {
        double resultado = nro1 + nro2;
        nro2 = 10;
        return resultado;
    }// cierre funcion: sumarDosNumeros

    static void mostrarMensaje(double resultado) {
        System.out.println("el resultado de la suma es  " + resultado);
    }//cierre funcion: mostrarMensaje

    static void mostrarMensasjeBienvenida(String nombre) {
        System.out.println("BIENVENIDO A LA CLASE DOS DE FUNCIONES!!!" + nombre);
    }//cierre funcion: mostrarMensasjeBienvenida

    static void mostrarMensasjeBienvenida(String nombre, String apellido) {
        System.out.println("BIENVENIDO A LA CLASE DOS DE FUNCIONES!!!" + nombre + apellido);
    }//cierre funcion: mostrarMensasjeBienvenida

    static String mostarMensajeBienvenida(String nombre, int curso) {
        return "BIENVENIDO A LA CLASE DOS " + nombre + " curso: " + curso;
    }
    static void mostarNumeroDecreciente (int nro) {
        if (nro > 0) {
            nro--;
            System.out.println("el nro es: " + nro);
            mostarNumeroDecreciente(nro);
        }
    }
    static void maostrarNombressArray(String[] nombres){
        String texto="los asistentes al curso son: ";
        for(int i=0; i<nombres.length;i++){
            texto=texto + nombres[i] +" ";
        }
        System.out.println(texto);
    }
}
