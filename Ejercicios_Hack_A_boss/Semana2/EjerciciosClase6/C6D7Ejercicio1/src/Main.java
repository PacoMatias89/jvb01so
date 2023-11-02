import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Coches eléctricos
        Auto cocheElectrico1 = new Auto(1, "1234FJH", "Ford", "Mondeo", 2010, 30000.00, 56, 400);
        Auto cocheElectrico2 = new Auto(2, "5678GRE", "Opel", "Astra", 2019, 35000.00, 60, 200);

        //Camionetas
        Camioneta camioneta1 = new Camioneta(1, "7894EDR", "Toyota", "Hilux", 2020, 55000.00, 75 , 6.6);
        Camioneta camioneta2 = new Camioneta(2, "8522DER", "Ford", "Ranger", 2023, 85000.00, 80, 8.6);

        //Motos
        Moto moto1 = new Moto(1, "4567KOI", "Honda", "VFR800", 2020, 24999.99,800, "Cuatro tiempos");
        Moto moto2 = new Moto(2, "2342ERW", "Aprilia", "RS", 1997, 14990.99, 250, "Dos tiempos");

        // Lista de vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(cocheElectrico1);
        vehiculos.add(cocheElectrico2);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);
        vehiculos.add(moto1);
        vehiculos.add(moto2);

        System.out.println("-----------Información de los vehículos-----------");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);

            if (vehiculo instanceof Electrico) {
                System.out.println(((Electrico) vehiculo).cargarEnergia());
            } else if (vehiculo instanceof Combustion) {
                System.out.println(((Combustion) vehiculo).recargarCombustible());
            }

            System.out.println("----------------------------------------------------");
        }
    }
}
