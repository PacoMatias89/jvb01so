import java.util.Random;

public class Gato extends Mascota {

    private String raza;
    private String colorPelo;
    private String tipoPelo;

    public Gato(Long id, String nombre, Integer edad, String especie, String raza, String colorPelo, String tipoPelo) {
        super(id, nombre, edad, especie);
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.tipoPelo = tipoPelo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String toString() {
        return String.format(
                "Detalles de Gato:\n" +
                        "  - Raza: %s\n" +
                        "  - Nombre: %s\n" +
                        "  - Edad: %d\n" +
                        "  - Especie: %s\n" +
                        "  - Color de pelo: %s\n" +
                        "  - Tipo de pelaje: %s\n", raza, getNombre(), getEdad(), getEspecie(), colorPelo, tipoPelo);
    }

}
