import java.util.Random;

public class Ave extends Mascota {
    private String plumaje;
    private String colorPlumaje;
    private String tipoPico;
    private String alimentacion;

    public Ave(Long id, String nombre,
               Integer edad,
               String especie,
               String plumaje,
               String colorPlumaje,
               String tipoPico,
               String alimentacion) {
        super(id, nombre, edad, especie);
        this.plumaje = plumaje;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
        this.alimentacion = alimentacion;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return String.format(
                "Detalles de Ave:\n" +
                        "  - Nombre: %s\n" +
                        "  - Especie: %s\n" +
                        "  - Edad: %d\n" +
                        "  - Plumaje: %s\n" +
                        "  - Color de plumaje: %s\n" +
                        "  - Tipo de pico: %s\n" +
                        "  - Alimentación: %s\n", getNombre(), getEspecie(), getEdad(), plumaje, colorPlumaje, tipoPico, alimentacion);
    }


}
