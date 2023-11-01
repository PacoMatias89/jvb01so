import java.util.Scanner;

/**
 *
 * na web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.
 *
 * Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas las temperaturas,
 * deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
 *
 * */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] temperaturasMaximas = new double[7];
        double suma = 0;

        //Rellenamos el array con las temperaturas máximas
        for (int i = 0; i < temperaturasMaximas.length; i++) {
            System.out.println("Ingrese la temperatura máxima del día " + (i + 1) + ": ");
            temperaturasMaximas[i] = scanner.nextDouble();
            suma += temperaturasMaximas[i];
        }

        System.out.printf("La temperatura máxima promedio es: %.2f grados%n", suma / temperaturasMaximas.length);



    }
}