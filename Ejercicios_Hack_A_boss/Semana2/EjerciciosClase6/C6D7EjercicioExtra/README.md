# Ejercicio Nº 2 - Collections - Individual (Extra/Opcional)

## Enunciado
Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario. Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

A partir de esto, realizar las siguientes acciones en el programa desarrollado:

a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).

b) Guardar estos objetos creados en un ArrayList.

c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.

d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.

e) Borrar el producto que se encuentre en la posición 5 del ArrayList.

f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.

g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.


### Creación del ejericio
En este ejercicio creamos una clase producto, en la cual crearemos los atributos que nos piden en el ejercicio.
Una vez creado toda la clase Producto en la clase empezaremos a implementar la lógica para la creación de los ejercicio que nos vamos solicitando.


#### Apartado A

En esta parte nos creamos 10 objetos de tipo Productos con sus respectivos atributos:

<pre>
        Producto producto1 = new Producto(1,"Laptop", "Asus", 800.00, 1499.99, 50);
        Producto producto2 = new Producto(2,"Teléfono", "Samsumg", 750.99, 1299.99, 300);
        Producto producto3 = new Producto(3,"Casco", "Huawei", 50.0, 125.99, 500);
        Producto producto4 = new Producto(4,"Tablet", "Nokia", 80.00, 200.50, 200);
        Producto producto5 = new Producto(5,"Monitor", "LG", 80.0, 299.99, 300);
        Producto producto6 = new Producto(6,"Mouse", "Lenovo", 20.0, 80.99, 200);
        Producto producto7 = new Producto(7,"Teclado", "LG", 15.99, 100.0, 25);
        Producto producto8 = new Producto(8,"Teclado", "Lenovo", 15.99, 150.0, 25);
        Producto producto9 = new Producto(9,"Teléfono", "Iphone", 500.0, 1299.99, 400);
        Producto producto10 = new Producto(10,"Laptop", "Samsung", 800.00, 1599.99, 500 );

</pre>

#### Apartado B

En este apartado, creamos una lista para guardar cada uno de los productos y así luego poder mostrarlos
<pre>
   //Guardamos los productos en una lista
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);
        productos.add(producto9);
        productos.add(producto10);
        System.out.println("----------------------------------------------- Lista Productos ----------------------------------------");

        for (Producto producto : productos) {
            System.out.println(producto.toString());
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
        }
</pre>
la salida que obtendremos será la siguiente:

-----------------------------------------------
Lista Productos
-----------------------------------------------
| Código     | Nombre          | Marca           | Precio Costo(€) | Precio Venta(€) | Cantidad Stock  |
|----------- | --------------- | --------------- | --------------- | --------------- | --------------- |
| 1          | Laptop          | Asus            | 800,00          | 1499,99         | 50              |
| 2          | Teléfono        | Samsumg         | 750,99          | 1299,99         | 300             |
| 3          | Casco           | Huawei          | 50,00           | 125,99          | 500             |
| 4          | Tablet          | Nokia           | 80,00           | 200,50          | 200             |
| 5          | Monitor         | LG              | 80,00           | 299,99          | 300             |
| 6          | Mouse           | Lenovo          | 20,00           | 80,99           | 200             |
| 7          | Teclado         | LG              | 15,99           | 100,00          | 25              |
| 8          | Teclado         | Lenovo          | 15,99           | 150,00          | 25              |
| 9          | Teléfono        | Iphone          | 500,00          | 1299,99         | 400             |
| 10         | Laptop          | Samsung         | 800,00          | 1599,99         | 500             |
-----------------------------------------------

#### Apartado C y D
En este apartado lo que he hecho es igual el precio de Venta al primero y el de Costo al primero y así poder averiguar cual es el máximo en el precio venta 
y el mínimo en el precio costo, quedamos algo parecido a esto:

>>El precio de Venta máximo es: 1599.99 €<br>
El precio de Costo minimo es: 15.99 €

En esta parte del código he creado un método el cual creará esa lógica:

<pre>
private static void CalcularPrecioVentasMaxYPrecioCostoMin(List<Producto> productos){
        // vamos a inicializar el precio máximo al primer producto
        double precioMaximoVenta = productos.get(0).getPrecioVenta();
        double precioMinimoCosto = productos.get(0).getPrecioCosto();
        for (Producto producto : productos) {
            //Verificamos si el precio máximo
            if (producto.getPrecioVenta() > precioMaximoVenta) {
                precioMaximoVenta = producto.getPrecioVenta();
            } else if (producto.getPrecioCosto() < precioMinimoCosto) {
                precioMinimoCosto = producto.getPrecioCosto();
            }

        }
        System.out.println("El precio de Venta máximo es: " + precioMaximoVenta + " €");
        System.out.println("El precio de Costo minimo es: " + precioMinimoCosto + " €");
        System.out.println();

    }
</pre>

#### Apartado E

En esta parte, también he creado otro método para poder borrar el elemento 5 de la lista:

<pre>
   private static void borrarProducto(List<Producto> productos) {
        productos.remove(5);
        System.out.println("------------------------------------------- Lista Actuliazada 1 ----------------------------------------");
        for (Producto productoBorrado : productos) {
            System.out.println(productoBorrado.toString());
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
        }
    }
</pre>

#### Apartado F y G
En el apartado F lo que hago previamente es leer la lista de inicial y buscar los productos que tiene una cantidad máxima de stock en el caso que haya más de 1
y si hay 1 pues me devolverá sólo 1: 

<pre>
private static void productoCantidadMaxStock(List<Producto> productos) {
        int stockMax = 0;
        List<Producto> productosConStockMaximo = new ArrayList<>();//Creo una lista para guardar los productos con stock máx, en caso de que haya varios
        // Buscamos los productos con la cantidad máxima de stock
        for (Producto productoBuscar : productos) {
            if (productoBuscar.getCantidadStock() > stockMax) {
                stockMax = productoBuscar.getCantidadStock();
                productosConStockMaximo.clear(); // Limpiamos la lista para mantener solo los productos con stock máximo.
                productosConStockMaximo.add(productoBuscar);
            } else if (productoBuscar.getCantidadStock() == stockMax) {
                productosConStockMaximo.add(productoBuscar);
            }
        }

        System.out.println();
        System.out.println("Productos con la cantidad máxima de stock:");
        for (Producto producto : productosConStockMaximo) {
            System.out.println(producto);
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
        System.out.println();

        // Encuentra todos los productos con la cantidad máxima de stock
        for (Producto productoBuscar : productos) {
            if (productoBuscar.getCantidadStock() == stockMax) {
                int stockActualizado = productoBuscar.getCantidadStock() -3;
                productoBuscar.setCantidadStock(stockActualizado);

            }
        }

        System.out.println();

        System.out.println("----------------------------------------- Lista Actualizada 2 ------------------------------------------");
        for (Producto productoActualizado : productos) {

            System.out.println(productoActualizado);
            System.out.println("--------------------------------------------------------------------------------------------------------");
        }
    }
</pre>


Una vez lo haya obtenido, lo guardo en una lista secundaria y obtengo los productos que tiene el máximo número de stock. 
Una vez obtenido, a la lista inicial vuelvo a mirar cuales son los valores que necesito y les resto 3 unidades y por último muestro el resultado:

-----------------------------------------
Lista Actualizada 2
-----------------------------------------
| Código     | Nombre          | Marca           | Precio Costo(€) | Precio Venta(€) | Cantidad Stock  |
|----------- | --------------- | --------------- | --------------- | --------------- | --------------- |
| 1          | Laptop          | Asus            | 800,00          | 1499,99         | 50              |
| 2          | Teléfono        | Samsumg         | 750,99          | 1299,99         | 300             |
| 3          | Casco           | Huawei          | 50,00           | 125,99          | 497             |
| 4          | Tablet          | Nokia           | 80,00           | 200,50          | 200             |
| 5          | Monitor         | LG              | 80,00           | 299,99          | 300             |
| 7          | Teclado         | LG              | 15,99           | 100,00          | 25              |
| 8          | Teclado         | Lenovo          | 15,99           | 150,00          | 25              |
| 9          | Teléfono        | Iphone          | 500,00          | 1299,99         | 400             |
| 10         | Laptop          | Samsung         | 800,00          | 1599,99         | 497             |
-----------------------------------------

