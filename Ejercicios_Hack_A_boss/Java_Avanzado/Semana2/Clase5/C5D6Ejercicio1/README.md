# Ejercicio N.º 1 - Empleados - Individual
Esta aplicación es muy parecida al ejercicio 2, a diferencia de que tenemos que crear promedio de los salarios para cada una de las categorías.

+ Filtra los empleados cuyo salario sea mayor a cierto valor específico.
+ Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
+ Encuentra al empleado con el salario más alto utilizando Optionals.

#### Filtra los empleados cuyo salario sea mayor a cierto valor específico.

En este apartado lo que vamos a realizar es asignar un valor específico de salario para que nos de una lista
con todos estos empleados que estén por debajo del valor agregado: 

<pre>
 //Filtrar empleado por salario mayor
        System.out.println("-----Filtrar empleados por salario mayor a cierto valor-----");
        empleados.stream()
                .filter(empleado -> empleado.getSalario() > 2500)
                .forEach(empleado -> System.out.println(empleado));
        System.out.println("------------------------------------------------------------");
        System.out.println();
</pre>

Como podremos observar lo que hacemos es hacer un flujo de datos con el método stream , luego hacer un filtro con el método filter de los 
el cual nos va a devolver una cantidad de empleados que estén por debajo de 2500 y por último con un forEach recorremos la lista para mostrarla.


#### Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
En este apartado lo que tendremos que hacer es muy parecido que en el apartado anterior, ya que lo que tendremos es que recorrer una lista 
en función de la categoría seleccionada y a parte tendremos que posteriormente calculara el promedio del salario de salarios por cada categoría.

El buscar los empleados por categiorías es muy similiar al de arriba, la única diferencia es que en vez de buscar por salario, buscaremos por categoría
y le diremos qué categoría queremos buscar:

<pre>
 empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals(Categoria.DESARROLLADOR))
                .forEach(empleado -> System.out.println(empleado));
</pre>

Posteriormente lo que haremos es obtener el promedio de los salarios por categorías:

_Dejo un sólo método porque son todos iguales, lo único que cambia es la categoría:_ 
<pre>
      // Calcular el salario promedio para cada categoría.
        double promedioDesarrollador = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals(Categoria.DESARROLLADOR)).
                mapToDouble(empleado -> empleado.getSalario())
                .average().orElse(0.0);
</pre>

#### Encuentra al empleado con el salario más alto utilizando Optionals.
En este apartado lo que vamos a usar en un Optionals y la clase Comparator, esta última lo que va hacer es comparar uno por uno los salarios y buscará el máximo, ya que estamos usando
el método max de la interface Optional.

<pre>
 // Encontrar el empleado con el salario más alto utilizando Optionals.
        System.out.println("------------El empleado con el salario más alto----------");
        Optional<Empleado> empleadoMayorSalario = empleados.stream()
               .max(Comparator.comparing(Empleado::getSalario));

        System.out.println("---------------------------------------------------------");
        System.out.println(empleadoMayorSalario.get());

</pre>