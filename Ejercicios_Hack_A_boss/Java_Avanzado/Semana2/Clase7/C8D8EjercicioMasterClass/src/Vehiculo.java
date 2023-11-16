public class Vehiculo {
    private String marca;
    private double costo;
    private String modelo;

    public Vehiculo(String marca,String modelo, double costo ) {
        this.marca = marca;
        this.costo = costo;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return  "Marca: " + marca + '\n' +
                "Modelo: " + modelo + '\n' +
                "Costo: " + costo +'\n';
    }
}
