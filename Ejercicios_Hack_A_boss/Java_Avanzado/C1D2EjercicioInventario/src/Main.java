import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 *Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista. Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto, el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.
 *
 * Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada) o de utilizar los tipos correctos de excepción en cada caso.
 *
 * */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos una lista de productos
        List<Producto> productos = new ArrayList<>();
        boolean salir = false;

        do {
            try{
                System.out.println("--------------- Empresa: Locura Comercial: Donde tus Bolsillos Llorarán de Felicidad ---------------------------");
                System.out.println("----------------------------- Inventario de Bolsillos Llorarán de Felicidad ------------------------------------");
                System.out.println("Agrega el nombre del producto:");
                String nombre = sc.nextLine();


                // Verifica si el nombre está vacío

                Producto.validarNombre(nombre);

                System.out.println("Agrega el precio del producto (puedes usar comas o puntos para decimales):");
                String precioStr = sc.nextLine();

                // Verifica si el precio está vacío
                if (precioStr.isEmpty()) {
                    throw new DatosProductosInvalidoException("El precio del producto es requerido.");
                }

                double precio = Double.parseDouble(precioStr.replace(",", ".")); // Reemplaza comas por puntos
                Producto.validarPrecio(precio);

                System.out.println("Agrega la cantidad disponible del producto:");
                String cantidadDisponibleStr = sc.nextLine();
                if (cantidadDisponibleStr.isEmpty()){
                    throw new DatosProductosInvalidoException("La cantidad disponible del producto es requerida.");
                }
                int cantidadDisponible = Integer.parseInt(cantidadDisponibleStr);
                Producto.validarCantidadDisponible(cantidadDisponible);

                System.out.println("Quieres seguir agregando productos? (S/N)");
                String respuesta = sc.nextLine();
                if (respuesta.equalsIgnoreCase("N")) {
                    System.out.println("Gracias por usar el inventario.");
                    salir = true;
                }

                productos.add(new Producto(productos.size()+1, nombre, precio, cantidadDisponible));


            }catch (DatosProductosInvalidoException e){
                System.err.println("Error en el inventario: " +e.getMessage());

            }
        }while (!salir);

        System.out.println("------------------------------------------- Listado de producntos -----------------------------------------------------");
        for (Producto producto : productos) {
            System.out.println(producto);
            System.out.println("------------------");
        }


    }
}