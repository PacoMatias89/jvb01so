import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos los vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("Ford","Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford","Focus", 1200));
        vehiculos.add(new Vehiculo("Ford","Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat","Uno", 500));
        vehiculos.add(new Vehiculo("Fiat","Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino",1250));
        vehiculos.add(new Vehiculo("Chevrolet","Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin",2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla",1200));
        vehiculos.add(new Vehiculo("Toyota","Fortuner" ,3000));
        vehiculos.add(new Vehiculo("Renault","Logan" ,950));

        //Apartado 3
        /**
         * Haciendo uso del método sort en la lista de Vehículos con expresiones lambda,
         * obtén una lista de vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.
         *
         *
         * */


        System.out.println("*****Buscando por costo de menor a mayor*****");
        vehiculos.sort((vehiculo1, vehiculo2) -> {
            return Double.compare(vehiculo1.getCosto(), vehiculo2.getCosto());
        });
       vehiculos.forEach(System.out::println);
        System.out.println();

        //Apartado 4
        /**
         * De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
         * */

        System.out.println("*****Buscando por costo de mayor a menor*****");
        vehiculos.sort((vehiculo1, vehiculo2) -> {
            return Double.compare(vehiculo2.getCosto(), vehiculo1.getCosto());
        });
        vehiculos.forEach(System.out::println);
        System.out.println();

        //Apartado 5
        /**
         * Se desea extraer una lista de vehículos que con precio no mayor a 1000,
         * luego otra con precios mayor o igual 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.
         *
         *
         * */

        System.out.println("*****Buscando por precio mayor a 1000*****");
        vehiculos.stream()
                .filter(vehiculo -> vehiculo.getCosto() >= 1000)
                .forEach(System.out::println);

        System.out.println("*****Buscando por precio menor o igual a 1000*****");

        vehiculos.stream()
                .filter(vehiculo -> vehiculo.getCosto() < 1000)
                .forEach(System.out::println);

        System.out.println("*****Promedio total de todos los coches*****");
        double promedio = vehiculos.stream()
                .mapToDouble(vehiculo -> vehiculo.getCosto()).average().orElse(0.0);
        System.out.printf("El precio promedio de los productos es: %.2f ", promedio);



    }
}