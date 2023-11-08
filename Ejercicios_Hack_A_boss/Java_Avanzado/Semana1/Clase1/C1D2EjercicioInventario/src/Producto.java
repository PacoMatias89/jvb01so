import java.time.format.DateTimeParseException;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidadDisponible;


    public Producto(int id, String nombre, double precio, int cantidadDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

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


    @Override
    public String toString() {
        return  "id: " + id + '\n' +
                "nombre: " + nombre + '\n' +
                "precio: " + precio + '\n' +
                "cantidad de producto disponible: " + cantidadDisponible ;
    }
}
