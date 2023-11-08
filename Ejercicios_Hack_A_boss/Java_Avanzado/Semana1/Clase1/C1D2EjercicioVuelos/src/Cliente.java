import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Cliente {
    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private int numeroAsientosDeseados;

    public Cliente(String nombre, String destino, LocalDate fechaViaje, int numeroAsientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numeroAsientosDeseados = numeroAsientosDeseados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getNumeroAsientosDeseados() {
        return numeroAsientosDeseados;
    }

    public void setNumeroAsientosDeseados(int numeroAsientosDeseados) {
        this.numeroAsientosDeseados = numeroAsientosDeseados;
    }

    static void validarNombre(String nombre) throws ReservaInvalidaException {
        if (nombre == null || nombre.trim().isEmpty() || !nombre.matches("^[\\p{L}\\s]+$")) {
            throw new ReservaInvalidaException("El nombre del viajero es requerido y debe contener letras, incluyendo acentos y espacios.");
        }
    }

    static void validarDestino(String destino) throws ReservaInvalidaException {
        if (destino == null || destino.trim().isEmpty() || !destino.matches("^[\\p{L}\\s]+$")) {
            throw new ReservaInvalidaException("El destino es requerido y debe contener letras, incluyendo acentos y espacios.");
        }
    }


    static void validarFecha(String fechaStr) throws ReservaInvalidaException {
        try {
            LocalDate fecha = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (fecha.isBefore(LocalDate.now())) {
                throw new ReservaInvalidaException("La fecha de viaje debe ser en el futuro.");
            }
        } catch (DateTimeParseException e) {
            throw new ReservaInvalidaException("El formato de la fecha no es válido.");

        }
    }



    static void validarNumeroAsientos(int numeroAsientos) throws ReservaInvalidaException {
        if (numeroAsientos <= 0) {
            throw new ReservaInvalidaException("El número de asientos debe ser mayor que cero.");
        }
    }



    @Override
    public String toString() {
        return "Ticket de Vuelo:" + '\n' +
                "Nombre: " + nombre + '\n' +
                "Destino del viaje: " + destino + '\n' +
                "Fecha del viaje: " + fechaViaje + '\n' +
                "Numero de asiento: " + numeroAsientosDeseados + '\n';
    }
}
