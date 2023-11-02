import java.time.LocalDate;
import java.time.Period;

public class Auto extends Vehiculo implements Electrico {
    private double capacidadBateria;
    private int autonomia;

    public Auto(int id,
                String matricula,
                String marca,
                String modelo,
                int fechaFabicacion,
                Double costo,
                double capacidadBateria,
                int autonomia) {
        super(id, matricula, marca, modelo, fechaFabicacion, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }


    @Override
    public String cargarEnergia() {
        return "Recargar energía";
    }

    @Override
    String calcularFechaAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(getFechaFabicacion(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad"; // calculamos la antiguedad del vehículo
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "capacidadBateria: " + capacidadBateria +
                "autonomia=" + autonomia;
    }
}
