import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventarioCoche <T extends Coche>{

    //Creamos una lista vacía para almacenar los autos.
    private List<T> coches;

    public InventarioCoche() {
        this.coches = new ArrayList<>();
    }

    public T agregarCoche(T coche) {
        this.coches.add(coche);
        System.out.println("El coche " + coche.getMarca() + " "+ coche.getModelo() + " ha sido agregado");
        return coche;
    }

    // buscamos un auto por su marca o año.
    public T buscarCoche(String marca, LocalDate fechaFabricacion) {
        Optional<T> cocheEncontrado = coches.stream()
                .filter(coche -> coche.getMarca().equals(marca) && coche.getFechaFabricacion().equals(fechaFabricacion))
                .findFirst();

        return cocheEncontrado.orElse(null);
    }

    // calculamos el valor total del inventario.
    public Double calcularValorTotal() {
        double valorTotalInventario = 0.0;
        for (T coche : this.coches) {
            valorTotalInventario += coche.getPrecio();
        }
        return valorTotalInventario;
    }



}
