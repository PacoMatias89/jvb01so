# Ejercicio N.º 2 - Manejo de Inventarios en un Comercio - Individual

Esta aplicación es un pequeño inventario trabajado con una lista simulando a una base de datos, em la cual vamos 
agregado los diversos datos que nos pide el ejercicio. Quedando algo parecido a esto:

<pre>
----------------------------- Inventario de Bolsillos Llorarán de Felicidad ------------------------------------
Agrega el nombre del producto:
Tijeras
Agrega el precio del producto (puedes usar comas o puntos para decimales):
1.60
Agrega la cantidad disponible del producto:
60
Quieres seguir agregando productos? (S/N)
n
Gracias por usar el inventario.
------------------------------------------- Listado de producntos -----------------------------------------------------
id: 1
nombre: Pilas
precio: 5.25
cantidad de producto disponible: 12
------------------
id: 2
nombre: Tijeras
precio: 1.6
cantidad de producto disponible: 60
------------------
</pre>

El funcionamiento es muy simple, vamos agregando campos y si por ejemplo no agregamos nada y le damos al ENTER puede
darse el caso siguiente:

<pre>
--------------- Empresa: Locura Comercial: Donde tus Bolsillos Llorarán de Felicidad ---------------------------
----------------------------- Inventario de Bolsillos Llorarán de Felicidad ------------------------------------
Agrega el nombre del producto:
Pilas
Agrega el precio del producto (puedes usar comas o puntos para decimales):
5.50
Agrega la cantidad disponible del producto:

Error en el inventario: La cantidad disponible del producto es requerida.
</pre>

Esto es un pequeño ejemplo de cómo va quedando los errores.

### Métodos de errores

<pre>
    public static void validarNombre(String nombre) throws DatosProductosInvalidoException {
        if (nombre == null || nombre.trim().isEmpty() || !nombre.matches("^[\\p{L}\\s]+$")) {
            throw new DatosProductosInvalidoException("El nombre del producto es requerido y debe contener letras, incluyendo acentos y espacios.");
        }
    }

    public static void validarPrecio(double precio) throws DatosProductosInvalidoException {
        if (precio <= 0) {
            throw new DatosProductosInvalidoException("El precio del producto debe ser mayor a 0.");
        }
    }

    public static void validarCantidadDisponible(int cantidadDisponible) throws DatosProductosInvalidoException {
        if (cantidadDisponible <= 0) {
            throw new DatosProductosInvalidoException("La cantidad de producto disponible debe ser mayor a 0.");
        }
    }
</pre>

Así quedaría todos los métodos de validación, los cuales los voy llamando en la clase Main: 

<pre>

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


</pre>