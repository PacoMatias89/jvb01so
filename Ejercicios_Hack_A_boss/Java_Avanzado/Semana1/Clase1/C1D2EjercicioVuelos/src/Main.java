import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Cliente> clientes = new ArrayList<>();
        int numeroAsientosDisponibles = 5; // Cantidad total de asientos disponibles

        while (true) {
            try {
                System.out.println("------------Aerolínea Air Fiasco Reserva de Vuelos------------");
                System.out.println("El número de asientos disponibles en el vuelo es: " + numeroAsientosDisponibles);
                System.out.println("Introduce el nombre del viajero:");
                String nombre = sc.nextLine();
                Cliente.validarNombre(nombre);
                System.out.println("Introduce un destino para el viaje:");
                String destino = sc.nextLine();
                Cliente.validarDestino(destino);
                System.out.println("Introduce la fecha del viaje (dd/MM/yyyy):");

                try {
                    String fechaStr = sc.nextLine();
                    Cliente.validarFecha(fechaStr);
                    LocalDate fechaViaje = LocalDate.parse(fechaStr, formatter);
                    System.out.println("Introduce el número de asientos deseados:");
                    int numeroAsientos = Integer.parseInt(sc.nextLine());
                    Cliente.validarNumeroAsientos(numeroAsientos);

                    if (numeroAsientos <= numeroAsientosDisponibles) {
                        Cliente nuevoCliente = new Cliente(nombre, destino, fechaViaje, numeroAsientos);
                        clientes.add(nuevoCliente);
                        numeroAsientosDisponibles -= numeroAsientos; // Restar asientos reservados
                        System.out.println("Reserva realizada con éxito.");
                    } else {
                        System.out.println("No hay suficientes asientos disponibles. Por favor, intenta con un número menor de asientos o espere al siguiene vuelo. Gracias.");
                    }

                } catch (DateTimeParseException e) {
                    throw new ReservaInvalidaException("El formato de la fecha no es válido. Utiliza el formato dd/MM/yyyy.");
                }


                System.out.println("¿Deseas hacer otra reserva? (s/n):");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("n")) {
                    break;
                }
            } catch (ReservaInvalidaException e) {
                System.err.println("Error en la reserva: " + e.getMessage());
            }
        }

        System.out.println("Reservas de vuelos realizadas con éxito");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
