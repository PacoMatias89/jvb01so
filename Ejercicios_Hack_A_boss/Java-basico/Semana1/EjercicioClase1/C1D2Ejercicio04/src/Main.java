import java.util.Scanner;

/*
* Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división.
* Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

Sugerencia: Compara los resultados que obtengas con otros compañeros.
* Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.

Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora…
* ¿De qué manera tratarías de evitar esta situación?*/

public class Main {
    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        int num1, num2, res1, res2, res3, res4;

        //HABILITAR LA ENTREADA DE DATOS
        Scanner scanner = new Scanner(System.in);

        //PREGUNTAR Al USUARIO Y ASIGNAR VALORES
        System.out.println("Por favor ingrese un número entero: ");
        num1 = scanner.nextInt();

        System.out.println("Por favor ingrese otro número entero: ");
        num2 = scanner.nextInt();

        //CALCULOS
        res1 = num1 + num2;
        res2 = num1 - num2;
        res3 = num1 * num2;
        res4 = num1 / num2;

        //MOSTRAR RESULTADOS
        System.out.println("La suma es: " + res1);
        System.out.println("La resta es: " + res2);
        System.out.println("La multiplicación es: " + res3);
        System.out.println("La división es: " + res4);
    }
}