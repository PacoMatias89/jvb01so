public class Ave extends Animal {
    private int longitudAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;
    /**********************************APARTADO A **********************************/

    public Ave(int id,
               String nombre,
               int edad, String tipoPiel,
               String tipoAlimentacion,
               int longitudAlas,
               String tipoVuelo,
               String colorPlumaje,
               String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitudAlas = longitudAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    /**********************************APARTADO B**********************************/
    @Override
    public String saludar() {
        return "Hola, soy un ave....";
    }

}
