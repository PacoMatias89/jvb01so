import java.time.LocalDate;

public class Coche {
    private String marca;
    private String modelo;
    private LocalDate fechaFabricacion;
    private Double precio;

    public Coche(String marca, String modelo, LocalDate fechaFabricacion, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "Marca: '" + marca + '\n' +
                "Modelo: " + modelo +  '\n' +
                "Fecha de fabricación: " + fechaFabricacion + '\n' +
                "Precio: " + precio + " €" +  '\n' ;
    }
}
