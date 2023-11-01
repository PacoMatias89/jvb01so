public class Zapato extends Vestimenta{
    private String material;
    private String TipoCierre;

    public Zapato(int codigo,
                  String nombre,
                  double precio,
                  String marcar,
                  String talla,
                  String color,
                  String material,
                  String tipoCierre) {
        super(codigo, nombre, precio, marcar, talla, color);
        this.material = material;
        TipoCierre = tipoCierre;
    }

    @Override
    public String mensaje() {
        return "Estos zapatos son de marca: " + getMarcar();
    }
}
