import java.util.Random;

public class Mascota <T>{
    private Long id;
    private String nombre;
    private Integer edad;
    private String especie;

    public Mascota(Long id,
                   String nombre,
                   Integer edad,
                   String especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public  String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return String.format(
                "Mascota:\n" +
                        "  - ID: %d\n" +
                        "  - Nombre: %s\n" +
                        "  - Edad: %d\n" +
                        "  - Especie: %s\n", id, nombre, edad, especie);
    }

}
