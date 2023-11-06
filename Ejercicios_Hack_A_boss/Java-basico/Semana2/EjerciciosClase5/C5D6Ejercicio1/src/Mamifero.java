public class Mamifero extends Animal {

    private int numPatas;
    private String tipoReproduccion;
    private String colorPelo;
    private String habitat;
        /**********************************APARTADO A **********************************/
    public Mamifero(int id,
                    String nombre,
                    int edad,
                    String tipoPiel,
                    String tipoAlimentacion,
                    int numPatas, String tipoReproduccion,
                    String colorPelo, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numPatas = numPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelo = colorPelo;
        this.habitat = habitat;
    }

    /**********************************APARTADO B**********************************/

    @Override
    public String saludar() {
        return "Hola, soy un mamífero..";
    }
}
