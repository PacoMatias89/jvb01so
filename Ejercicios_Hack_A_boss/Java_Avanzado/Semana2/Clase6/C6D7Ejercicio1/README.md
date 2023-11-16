# Ejercicio 1: Concesionaria de Autos

Esta aplicación hace una pequeña simulación de un inventario de in concesionario.

Los puntos a tener en cuenta para la creación de esta pequeña app son:

+ Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
+ Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
+ Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.

#### Apartado 1
Lo primero que tenemos que tener creado es la clase coche y nuestra clase InventarioCoche la cual a a devolver un 
dato genérico.

<pre>
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InventarioCoche <T extends Coche>{

    //Creamos una lista vacía para almacenar los autos.
    private List<T> coche;

    public InventarioCoche() {
        this.coche = new ArrayList<T>();
    }

    public void agregarCoche(T coche) {
        this.coche.add(coche);
        System.out.println("El coche " + coche.getMarca() + " "+ coche.getModelo() + " ha sido agregado");
    }

    // buscamos un auto por su marca o año.
    public T buscarCoche(String marca, LocalDate fechaFabricacion) {
        for (T coche : this.coche) {
            if (coche.getMarca().equals(marca) && coche.getFechaFabricacion().equals(fechaFabricacion)) {
                return  coche;
            }
        }
        return null;
    }

    // calculamos el valor total del inventario.
    public Double calcularValorTotal() {
        Double valorTotalInventario = 0.0;
        for (T coche : this.coche) {
            valorTotalInventario += coche.getPrecio();
        }
        return valorTotalInventario;
    }

}
</pre>
Y que extienda de nuestra clase Coche
Lo siguiente que tenemos que hacer es con el método de agregar coches ir agregando coches en nuestra clase Main
<pre>
        System.out.println("********Agregamos los coches al inventario*********");
        InventarioCoche<Coche> inventarioAuto = new InventarioCoche<>();
        inventarioAuto.agregarCoche(new Coche("Ford", "Focus", LocalDate.of(2019, 12, 12), 25599.99));
        inventarioAuto.agregarCoche(new Coche("Toyota", "Corolla", LocalDate.of(2022, 02, 05), 20199.99));
        inventarioAuto.agregarCoche( new Coche("Honda", "Civic", LocalDate.of(2021, 10, 15), 18999.99));
        inventarioAuto.agregarCoche(new Coche("Ford", "Fusion", LocalDate.of(2023, 4, 22), 22500.00));
        inventarioAuto.agregarCoche(new Coche("Chevrolet", "Malibu", LocalDate.of(2022, 8, 8), 21500.00));
</pre>

#### Apartado 2
En este apartado como podremos ver nos piden que busquemos los coches por marca y modelo. En la clase InventarioCoche
tenemos un método que hace esa función, es el llamado _buscarCoche()_, en este método le agrego dos parámetros, 1 es la marca y el segundo 
parámetro en la fecha de fabricación

<pre>
   // buscamos un auto por su marca o año.
    public T buscarCoche(String marca, LocalDate fechaFabricacion) {
        Optional<T> cocheEncontrado = coches.stream()
                .filter(coche -> coche.getMarca().equals(marca) && coche.getFechaFabricacion().equals(fechaFabricacion))
                .findFirst();

        return cocheEncontrado.orElse(null);
    }
</pre>

#### Apartado 3

En este apartado lo que haremos es calcular el total del valor de nuestro inventario, también hemos creado un método para tal fin en la clase
_InventarioCoche_, el cual es: _calculaValorTotal()_.
Este método no tiene parámetros y devuelve el valor total del inventario

<pre>
    // calculamos el valor total del inventario.
    public Double calcularValorTotal() {
        Double valorTotalInventario = 0.0;
        for (T coche : this.coche) {
            valorTotalInventario += coche.getPrecio();
        }
        return valorTotalInventario;
    }

</pre>

#### Salidas del programa

<pre>

********Agregamos los coches al inventario*********
El coche Ford Focus ha sido agregado
El coche Toyota Corolla ha sido agregado
El coche Honda Civic ha sido agregado
El coche Ford Fusion ha sido agregado
El coche Chevrolet Malibu ha sido agregado
El coche Nissan Altima ha sido agregado
El coche Hyundai Elantra ha sido agregado
El coche Volkswagen Jetta ha sido agregado
El coche Mazda Mazda3 ha sido agregado
El coche Kia Forte ha sido agregado
El coche Subaru Impreza ha sido agregado

********Buscamos los coches por Marca o Año*********
Marca: 'Ford
Modelo: Focus
Fecha de fabricación: 2019-12-12
Precio: 25599.99 €

Marca: 'Toyota
Modelo: Corolla
Fecha de fabricación: 2022-02-05
Precio: 20199.99 €

Marca: 'Honda
Modelo: Civic
Fecha de fabricación: 2021-10-15
Precio: 18999.99 €

Marca: 'Ford
Modelo: Fusion
Fecha de fabricación: 2023-04-22
Precio: 22500.0 €

Marca: 'Chevrolet
Modelo: Malibu
Fecha de fabricación: 2022-08-08
Precio: 21500.0 €

********Calculamos el Valor Total del Inventario*********
229645.46 €
</pre>