public class Sombrero extends Vestimenta {
    private String tipo;
    private String dimension;

    public Sombrero(int codigo,
                    String nombre,
                    double precio,
                    String marcar,
                    String talla,
                    String color,
                    String tipo,
                    String dimension) {
        super(codigo, nombre, precio, marcar, talla, color);
        this.tipo = tipo;
        this.dimension = dimension;
    }

    @Override
    public String mensaje() {
        return "Este sombrero es de tipo: " + tipo;
    }
}
