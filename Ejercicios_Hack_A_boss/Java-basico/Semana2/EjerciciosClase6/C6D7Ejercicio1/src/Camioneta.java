import java.time.LocalDate;
import java.time.Period;

public class Camioneta extends Vehiculo implements Combustion{

    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id,
                     String matricula,
                     String marca,
                     String modelo,
                     int fechaFabicacion,
                     Double costo,
                     double capacidadTanque,
                     double consumoCombustible) {
        super(id, matricula, marca, modelo, fechaFabicacion, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }




    @Override
    String calcularFechaAntiguedad() {
        LocalDate fechaFabricacion = LocalDate.of(getFechaFabicacion(), 1, 1);
        LocalDate fechaActual = LocalDate.now();
        Period antiguedad = Period.between(fechaFabricacion, fechaActual);
        return antiguedad.getYears() + " años de antigüedad";  // calculamos la antiguedad del vehículo
    }

    @Override
    public String recargarCombustible() {

        return "Recargando combustible";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "capacidadTanque=" + capacidadTanque +"\n" +
                "consumoCombustible=" + consumoCombustible ;
    }
}
