import java.awt.*;
import java.time.LocalDate;

/**
 * Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
 *
 * Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
 *
 * Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
 *
 * Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.
 *
 *
 * */

public class Main {
    public static void main(String[] args) {

        //Agregar los coches al Inventario
        System.out.println("********Agregamos los coches al inventario*********");
        InventarioCoche<Coche> inventarioAuto = new InventarioCoche<>();
        inventarioAuto.agregarCoche(new Coche("Ford", "Focus", LocalDate.of(2019, 12, 12), 25599.99));
        inventarioAuto.agregarCoche(new Coche("Toyota", "Corolla", LocalDate.of(2022, 02, 05), 20199.99));
        inventarioAuto.agregarCoche( new Coche("Honda", "Civic", LocalDate.of(2021, 10, 15), 18999.99));
        inventarioAuto.agregarCoche(new Coche("Ford", "Fusion", LocalDate.of(2023, 4, 22), 22500.00));
        inventarioAuto.agregarCoche(new Coche("Chevrolet", "Malibu", LocalDate.of(2022, 8, 8), 21500.00));
        inventarioAuto.agregarCoche(new Coche("Nissan", "Altima", LocalDate.of(2022, 6, 30), 20500.00));
        inventarioAuto.agregarCoche(new Coche("Hyundai", "Elantra", LocalDate.of(2023, 1, 12), 19499.99));
        inventarioAuto.agregarCoche(new Coche("Volkswagen", "Jetta", LocalDate.of(2021, 12, 1), 19995.50));
        inventarioAuto.agregarCoche(new Coche("Mazda", "Mazda3", LocalDate.of(2022, 3, 18), 19800.00));
        inventarioAuto.agregarCoche(new Coche("Kia", "Forte", LocalDate.of(2023, 5, 9), 20300.00));
        inventarioAuto.agregarCoche(new Coche("Subaru", "Impreza", LocalDate.of(2022, 7, 11), 20750.00));
        System.out.println();


        // Buscamos los coches por Marca o Año
        System.out.println("********Buscamos los coches por Marca o Año*********");
        System.out.println(inventarioAuto.buscarCoche("Ford", LocalDate.of(2019, 12, 12)));
        System.out.println(inventarioAuto.buscarCoche("Toyota", LocalDate.of(2022, 02, 05)));
        System.out.println(inventarioAuto.buscarCoche("Honda", LocalDate.of(2021, 10, 15)));
        System.out.println(inventarioAuto.buscarCoche("Ford", LocalDate.of(2023, 4, 22)));
        System.out.println(inventarioAuto.buscarCoche("Chevrolet", LocalDate.of(2022, 8, 8)));

        //Calculamos el Valor Total del Inventario
        System.out.println("********Calculamos el Valor Total del Inventario*********");
        System.out.println(inventarioAuto.calcularValorTotal() + " €");



    }
}