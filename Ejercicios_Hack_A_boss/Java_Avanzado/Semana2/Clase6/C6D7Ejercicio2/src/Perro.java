import java.util.Random;

public class Perro extends Mascota {
    private String raza;
    private String colorPelo;
    private String tipoPelo;

    public Perro(Long id, String nombre, Integer edad, String especie, String raza, String colorPelo, String tipoPelo) {
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
                "Detalles de Perro:\n" +
                        "  - Nombre: %s\n" +
                        "  - Raza: %s\n" +
                        "  - Edad: %d\n" +
                        "  - Especie: %s\n" +
                        "  - Color de pelo: %s\n" +
                        "  - Tipo de pelaje: %s\n", getNombre(), raza, getEdad(), getEspecie(), colorPelo, tipoPelo);
    }



}
