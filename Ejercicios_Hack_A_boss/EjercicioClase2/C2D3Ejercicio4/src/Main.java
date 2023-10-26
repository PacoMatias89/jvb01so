import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] teatro = new String[5][5];
        boolean exit = false;
        int filaSeleccionada = 0 ;
        int asientoSeleccionado = 0;

        // Rellenar la cuadrícula con "O"
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                teatro[fila][asiento] = "O";
            }
        }
        // Imprimir la cuadrícula actualizada
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("| " + teatro[fila][asiento] + " ");
            }
            System.out.println("|");
        }

        for (int asiento = 0; asiento < 5; asiento++) {
            System.out.print("+---");
        }
        System.out.println("+");

        Scanner scanner = new Scanner(System.in);

        // Bucle para seleccionar tanto filas como asientos
        while (!exit) {

            // Solicitar al usuario la fila y el asiento a marcar con "X"
            System.out.print("Ingresa la fila (0-4): ");
            filaSeleccionada = scanner.nextInt();

            System.out.print("Ingresa el asiento (0-4): ");
            asientoSeleccionado = scanner.nextInt();

            // Validar la entrada del usuario
            if (filaSeleccionada >= 0 && filaSeleccionada < 5 && asientoSeleccionado >= 0 && asientoSeleccionado < 5) {
                if (teatro[filaSeleccionada][asientoSeleccionado].equals("O")) {
                    teatro[filaSeleccionada][asientoSeleccionado] = "X";
                    System.out.println("¡Reserva exitosa!");
                } else {
                    System.out.println("El asiento seleccionado ya está ocupado. Elige otro asiento.");
                }
            } else {
                System.out.println("Entrada inválida. La fila y el asiento deben estar en el rango de 0 a 4.");
            }

            // Imprimimos los asientos finales
            // Imprimir la cuadrícula actualizada
            for (int fila = 0; fila < 5; fila++) {
                for (int asiento = 0; asiento < 5; asiento++) {
                    System.out.print("+---");
                }
                System.out.println("+");

                for (int asiento = 0; asiento < 5; asiento++) {
                    System.out.print("| " + teatro[fila][asiento] + " ");
                }
                System.out.println("|");
            }

            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("+---");
            }

            System.out.println();
            System.out.println("¿Quieres seguir eligiendo asientos? (si/no)");
            String continuar = scanner.next();

            if (continuar.equalsIgnoreCase("no")) {
                exit = true;

            }

        }
        // Imprimimos los asientos finales
        // Imprimir la cuadrícula actualizada
        for (int fila = 0; fila < 5; fila++) {
            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("+---");
            }
            System.out.println("+");

            for (int asiento = 0; asiento < 5; asiento++) {
                System.out.print("| " + teatro[fila][asiento] + " ");
            }
            System.out.println("|");
        }

        for (int asiento = 0; asiento < 5; asiento++) {
            System.out.print("+---");
        }
        System.out.println("+");
        System.out.println("¡Gracias por comprar!");
    }
}