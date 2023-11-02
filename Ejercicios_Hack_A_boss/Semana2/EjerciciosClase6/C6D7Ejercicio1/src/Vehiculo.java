import java.time.LocalDate;
import java.time.Period;

public abstract class Vehiculo  {
    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private int fechaFabicacion;
    private Double costo;


    public Vehiculo(int id,
                    String matricula,
                    String marca,
                    String modelo,
                    int fechaFabicacion,
                    Double costo) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabicacion = fechaFabicacion;
        this.costo = costo;

    }


    public int getFechaFabicacion() {
        return fechaFabicacion;
    }

    abstract String calcularFechaAntiguedad();

    @Override
    public String toString() {
        return  "Matrícula:" + matricula + "\n"+
                "Marca: " + marca +"\n" +
                "Modelo: " + modelo + "\n" +
                "Fecha de fabricación: " + fechaFabicacion + "\n" +
                calcularFechaAntiguedad()+ "\n" +
                "Precio: " + costo +" €" ;
    }
}
