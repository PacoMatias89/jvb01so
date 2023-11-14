import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InventarioCoche <T extends Coche>{

    //Creamos una lista vacía para almacenar los autos.
    private List<T> coche;

    public InventarioCoche() {
        this.coche = new ArrayList<T>();
    }

    public void agregarCoche(T coche) {
        this.coche.add(coche);
        System.out.println("El coche " + coche.getMarca() + " "+ coche.getModelo() + " ha sido agregado");
    }

    // buscamos un auto por su marca o año.
    public T buscarCoche(String marca, LocalDate fechaFabricacion) {
        for (T coche : this.coche) {
            if (coche.getMarca().equals(marca) && coche.getFechaFabricacion().equals(fechaFabricacion)) {
                return  coche;
            }
        }
        return null;
    }

    // calculamos el valor total del inventario.
    public Double calcularValorTotal() {
        Double valorTotalInventario = 0.0;
        for (T coche : this.coche) {
            valorTotalInventario += coche.getPrecio();
        }
        return valorTotalInventario;
    }

}
