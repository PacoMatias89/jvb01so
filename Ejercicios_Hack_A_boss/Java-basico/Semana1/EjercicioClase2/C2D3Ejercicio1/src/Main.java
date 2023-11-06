import java.util.Scanner;
/*
*
*  Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
* El programa debe mostrar (según cada caso) un mensaje informando la situación.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad, para el concierto: ");

        // Ingreso de datos
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes entrar al evento. Eres mayor de edad");
        }else {
            System.out.println("No puedes entrar al evento. Eres menor de edad");
        }

    }
}