import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        CalcularPrecioVentasMaxYPrecioCostoMin(productos); // Método que calcula el precio máximo de venta y mínimo de costo de todos los productos

        borrarProducto(productos); // Método que elimina un producto de la lista

        productoCantidadMaxStock(productos);//Método que calcula el precio máximo de venta y mínimo de costo de todos los productos

    }

    //Métodos

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

    private static void borrarProducto(List<Producto> productos) {
        productos.remove(5);
        System.out.println("------------------------------------------- Lista Actuliazada 1 ----------------------------------------");
        for (Producto productoBorrado : productos) {
            System.out.println(productoBorrado.toString());
            System.out.println("--------------------------------------------------------------------------------------------------------\n");
        }
    }

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


}