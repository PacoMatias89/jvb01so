# Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces - Grupal

## Enunciado 
Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.


a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.

b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben mostrar un mensaje de qué tipo de recarga están haciendo.

c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.

## Miembros del grupo
1. Ignacio Bacigalupi
2. José Del Palacio Casanova
3. Carlos J
4. Francisco Matías Molina Jurado

### Conclusión del ejercicio
En este ejercicio hemos creado una clase abstracta llamada Vehículo, en la cual hemos implementado un método para calcular
la antigüedad del vehículo

<pre>
abstract String calcularFechaAntiguedad();
</pre>

El cual nos calculará la edad de fabricación respecto a la fecha actual.
Un ejemplo de la clase Auto, ya que todas las clases comparten este método y es igual para todos 

<pre>
    @Override
    String calcularFechaAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(getFechaFabicacion(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad"; // calculamos la antiguedad del vehículo
    }
</pre>

En el Main creamos una lista de vehículos para mostrar a la postre todos los datos de los vehículos anteriormente 
creados.
