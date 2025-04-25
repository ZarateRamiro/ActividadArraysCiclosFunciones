package EjemploArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class EjArrays {
    private static final Logger LOG = Logger.getLogger(EjArrays.class.getName());
    public static void main(String[] args) {
        String [] materias= new String[9];
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<materias.length; i++) {
            LOG.info("ingrese el nombre de la materia " + (i+1));
            materias[i]= sc.next();
        }
        Arrays.sort(materias);//ordenamos
        //obtengo un solo string y lo mustro
        LOG.info("las materias son: " + Arrays.toString(materias));

    }//cierre main
}
