import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes operaciones utilizando Streams y Optionals:
 *
 * Filtra los empleados cuyo salario sea mayor a cierto valor específico.
 *
 * Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
 *
 * Encuentra al empleado con el salario más alto utilizando Optionals.
 *
 *
 *
 * */



public class Main {
    public static void main(String[] args) {
      // Creamos una lista de empleados.
        List<Empleado> empleados = List.of(
                new Empleado("Juan", 1454.25, Categoria.DESARROLLADOR),
                new Empleado("María", 2547.25, Categoria.ANALISTA),
                new Empleado("Carlos", 3541.45, Categoria.GERENTE),
                new Empleado("Laura", 2541.12, Categoria.DESARROLLADOR),
                new Empleado("Pedro", 1456.25, Categoria.ANALISTA),
                new Empleado("Ana", 5142.12, Categoria.GERENTE),
                new Empleado("David", 2213.21, Categoria.DESARROLLADOR),
                new Empleado("Isabel", 2310.21, Categoria.ANALISTA),
                new Empleado("Miguel", 3214.55, Categoria.GERENTE),
                new Empleado("Sofía", 2654.23, Categoria.DESARROLLADOR)
        );

        //Filtrar empleado por salario mayor
        System.out.println("-----Filtrar empleados por salario mayor a cierto valor-----");
        empleados.stream()
                .filter(empleado -> empleado.getSalario() > 2500)
                .forEach(empleado -> System.out.println(empleado));
        System.out.println("------------------------------------------------------------");
        System.out.println();

        // Agrupar empleados por categoria
        System.out.println("----------Agrupar empleados por categoria------------------");
        empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals(Categoria.DESARROLLADOR))
                .forEach(empleado -> System.out.println(empleado));
        System.out.println("------------------------------------------------------------");

        // Calcular el salario promedio para cada categoría.
        double promedioDesarrollador = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals(Categoria.DESARROLLADOR)).
                mapToDouble(empleado -> empleado.getSalario())
                .average().orElse(0.0);

        double promedioAnalista = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals(Categoria.ANALISTA)).
                mapToDouble(empleado -> empleado.getSalario())
                .average().orElse(0.0);

        double promedioGerente = empleados.stream()
                .filter(empleado -> empleado.getCategoria().equals(Categoria.GERENTE)).
                mapToDouble(empleado -> empleado.getSalario())
                .average().orElse(0.0);

        System.out.printf("El salario promedio para la categoría Desarrollador es: %.2f ", promedioDesarrollador);
        System.out.println();
        System.out.printf("El salario promedio para la categoría Desarrollador es: %.2f ", promedioAnalista);
        System.out.println();
        System.out.printf("El salario promedio para la categoría Desarrollador es: %.2f ", promedioGerente);
        System.out.println();

        // Encontrar el empleado con el salario más alto utilizando Optionals.
        System.out.println("------------El empleado con el salario más alto----------");
        Optional<Empleado> empleadoMayorSalario = empleados.stream()
               .max(Comparator.comparing(Empleado::getSalario));

        System.out.println("---------------------------------------------------------");
        System.out.println(empleadoMayorSalario.get());

    }
}