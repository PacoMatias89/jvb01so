public class Vestimenta {
    private int codigo;
    private String nombre;
    private double precio;
    private String marcar;
    private String talla;
    private String color;

    public Vestimenta(int codigo,
                      String nombre,
                      double precio,
                      String marcar,
                      String talla,
                      String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marcar = marcar;
        this.talla = talla;
        this.color = color;
    }

    public String getMarcar() {
        return marcar;
    }



    public String mensaje(){
        return "Vestimenta de marca" + marcar +" genérica";
    }


}
