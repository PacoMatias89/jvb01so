import java.time.LocalDate;
import java.time.Period;

public class Moto extends Vehiculo implements Combustion{
    private double cilindrada;
    private String tipoMotor;

    public Moto(int id,
                String matricula,
                String marca,
                String modelo,
                int fechaFabicacion,
                Double costo,
                double cilindrada,
                String tipoMotor
                ) {
        super(id, matricula, marca, modelo, fechaFabicacion, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;

    }



    @Override
    public String recargarCombustible() {
        return "Recargando combustible";
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
        return super.toString() + "\n"+
                "cilindrada=" + cilindrada + "\n" +
                "tipoMotor='" + tipoMotor + "\n" ;
    }
}
