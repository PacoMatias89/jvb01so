public class Repitel extends Animal {

    private int longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;
    /**********************************APARTADO A**********************************/


    public Repitel(int id,
                   String nombre,
                   int edad,
                   String tipoPiel,
                   String tipoAlimentacion,
                   int longitud,
                   String tipoEscamas,
                   String tipoVeneno,
                   String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    /**********************************APARTADO B**********************************/
    @Override
    public String saludar() {
        return "Hola, soy un reptil....";
    }

}
