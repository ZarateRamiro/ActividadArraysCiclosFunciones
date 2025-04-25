package EjemploArrays;

public class Main {
    public static void main(String[] args) {

        //tipoDato[] nombreArray = new TipoDato [tamaño]

        //creamos el array
        String [] asistencia;
        //asignamos valores
        asistencia= new String[3];//tamaño
        asistencia[0]="ramiroU";
        asistencia[1]="ramiroD";
        asistencia[2]="ramiroT";
        int notas []= {6,8,9,10,5};//tamaño 5

        //atributo que poseen los arreglos que indica su longitud.
        // Se utiliza el identificador del arreglo seguido de “.length”.

        for(int i=0; i<asistencia.length -1; i++){
            System.out.printf("El alumno" + asistencia[i]);
        }
        double sumaNotas=0;
        for(int j=0; j<notas.length -1; j++){
            sumaNotas+=notas[j];
        }
        System.out.printf("el promedio de notas es " + sumaNotas/notas.length);

    }//cierre main
}