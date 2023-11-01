public class Camiseta extends Vestimenta{
    private String cuello;
    private String manga;

    public Camiseta(int codigo,
                    String nombre,
                    double precio,
                    String marcar,
                    String talla,
                    String color,
                    String cuello,
                    String manga) {
        super(codigo, nombre, precio, marcar, talla, color);
        this.cuello = cuello;
        this.manga = manga;
    }

    @Override
    public String mensaje() {
        return "Esta camiseta es de manga: " + manga;
    }
}
