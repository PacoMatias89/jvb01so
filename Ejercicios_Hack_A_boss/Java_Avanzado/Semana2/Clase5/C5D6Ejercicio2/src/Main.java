import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:
 *
 * Filtra los eventos que están programados para una fecha específica.
 *
 * Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
 *
 * Encuentra el evento más próximo en el tiempo utilizando Optionals.
 *
 * */

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = List.of(
                new Evento("Reunión de Proyecto A", LocalDate.of(2024, 11, 15), Categoria.REUNION),
                new Evento("Conferencia de Desarrollo Web", LocalDate.of(2023, 12, 5), Categoria.CONFERENCIA),
                new Evento("Taller de Diseño Gráfico", LocalDate.of(2024, 1, 20), Categoria.TALLER),
                new Evento("Reunión de Equipo B", LocalDate.of(2023, 11, 25), Categoria.REUNION),
                new Evento("Conferencia de Inteligencia Artificial", LocalDate.of(2023, 12, 10), Categoria.CONFERENCIA),
                new Evento("Taller de Programación en Java", LocalDate.of(2024, 2, 8), Categoria.TALLER),
                new Evento("Presentación de Proyecto C", LocalDate.of(2023, 11, 30), Categoria.REUNION),
                new Evento("Seminario de Machine Learning", LocalDate.of(2023, 12, 15), Categoria.CONFERENCIA),
                new Evento("Curso de Photoshop Avanzado", LocalDate.of(2024, 1, 5), Categoria.TALLER),
                new Evento("Entrenamiento de Liderazgo", LocalDate.of(2023, 12, 20), Categoria.REUNION)
        );

        // Filtrar eventos que están programados para una fecha específica.
        List<Evento> eventosProgramados = eventos.stream()
                .filter(evento -> evento.getFecha().isBefore(LocalDate.of(LocalDate.now().getYear(), 12, 31)))
                .toList();

        System.out.println("---Filtrado de eventos para una fecha específica---");

        eventosProgramados.forEach(System.out::println);
        System.out.println("---------------------------------------------------");
        System.out.println();


        // Agrupar eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        System.out.println("---Agrupando eventos por categoría y su número de eventos---");
        int numeroEventoReunion = (int) eventos.stream()
                .filter(cantidadEvento -> cantidadEvento.getCategoria().equals(Categoria.REUNION))
                .mapToInt(cantidadEvento -> cantidadEvento.getNombre().length())// Cuento por nombre de los eventos.
                .count();

        int numeroEventoTaller = (int) eventos.stream()
                .filter(cantidadEvento -> cantidadEvento.getCategoria().equals(Categoria.TALLER))
                .mapToInt(cantidadEvento -> cantidadEvento.getNombre().length())// Cuento por nombre de los eventos.
                .count();

        int numeroEventoConferencia = (int) eventos.stream()
                .filter(cantidadEvento -> cantidadEvento.getCategoria().equals(Categoria.CONFERENCIA))
                .mapToInt(cantidadEvento -> cantidadEvento.getNombre().length())// Cuento por nombre de los eventos.
                .count();

        System.out.println("El número de eventos que tienen la categoría " + Categoria.REUNION +  " es: " + numeroEventoReunion);
        System.out.println("El número de eventos que tienen la categoría " + Categoria.TALLER +  " es: " + numeroEventoTaller);
        System.out.println("El número de eventos que tienen la categoría " + Categoria.CONFERENCIA +  " es: " + numeroEventoConferencia);
        System.out.println("---------------------------------------------------");
        System.out.println();

        Optional<Evento> eventoMasProximo = eventos.stream()
                .filter(evento -> LocalDate.now().compareTo(evento.getFecha()) <=0) //eliminamos los eventos pasados
                .min(Comparator.comparing(evento -> ChronoUnit.YEARS.between(LocalDate.now(), evento.getFecha())));

// Comparamos la fecha más próxima con la fecha actual.
        if (eventoMasProximo.isPresent()) {
            System.out.println("El evento más próximo es: \n" + eventoMasProximo.get());
        } else {
            System.out.println("No hay eventos próximos");
        }


        System.out.println("---------------------------------------------------");
        System.out.println();




    }
}