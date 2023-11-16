import java.util.Random;

public class Reptil extends Mascota {
    private String alimentacion;
    private String habitat;
    private double temperatura;

    public Reptil(Long id,
                  String nombre,
                  Integer edad,
                  String especie,
                  String alimentacion,
                  String habitat,
                  double temperatura) {
        super(id, nombre, edad, especie);
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.temperatura = temperatura;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return String.format(
                "Detalles de Reptil:\n" +
                        "  - Nombre: %s\n" +
                        "  - Especie: %s\n" +
                        "  - Edad: %d\n" +
                        "  - Alimentación: %s\n" +
                        "  - Habitat: %s\n" +
                        "  - Temperatura ideal: %s\n", getNombre(), getEspecie(), getEdad(), alimentacion, habitat, temperatura);
    }



}
