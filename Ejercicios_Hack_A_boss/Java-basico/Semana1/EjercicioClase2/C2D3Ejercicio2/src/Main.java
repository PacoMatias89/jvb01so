import java.util.Scanner;

public class Main {
/**
 *
 *
 *  Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
 *
 *
 * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
 *
 * Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador (cuando sabemos un número exacto de productos por ejemplo) u por centinela (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”.
 * Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
 *
 *
 *
 * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double price = 0;
        double totalPrice = 0;
        boolean exit = false;
        int products = 0;



        while (!exit) {
            System.out.println("Ingrese el precio del producto: ");
            price = scanner.nextDouble();

            //total de la compra
            totalPrice = totalPrice + price;

            System.out.println("¿Desea continuar comprando? (S/N)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("N")) {
                exit = true;
            }

            //cantidad de productos
            products++;


        }

        System.out.println("Has comprado " + products + " productos");
        System.out.println("El total de la compra es: " + totalPrice);



    }
}