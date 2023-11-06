public class Pantalon extends Vestimenta {
    private String estilo;
    private String TipoTejido;

    public Pantalon(int codigo,
                    String nombre,
                    double precio,
                    String marcar,
                    String talla,
                    String color,
                    String estilo,
                    String tipoTejido) {
        super(codigo, nombre, precio, marcar, talla, color);
        this.estilo = estilo;
        TipoTejido = tipoTejido;
    }

    @Override
    public String mensaje() {
        return "Estos pantalones son de estilo: " + estilo;
    }
}
