public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private Double precioCosto;
    private Double precioVenta;
    private int cantidadStock;

    public Producto(int codigo,
                    String nombre,
                    String marca,
                    Double precioCosto,
                    Double precioVenta,
                    int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return String.format("| %-10s | %-15s | %-15s | %-15s | %-15s | %-15s |%n", "Código", "Nombre", "Marca", "Precio Costo(€)", "Precio Venta(€)", "Cantidad Stock")
                + String.format("| %-10s | %-15s | %-15s | %-15.2f | %-15.2f | %-15d |%n", codigo, nombre, marca, precioCosto, precioVenta, cantidadStock);
    }


}
