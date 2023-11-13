
# Ejercicio N. º 2 - Gestor de Eventos - Individual

Esta aplicación simula una agenda de eventos, en la cual tenemos varias opción:

+ Filtra los eventos que están programados para una fecha específica.
+ Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
+ Encuentra el evento más próximo en el tiempo utilizando Optionals.


#### Filtrar los eventos por fecha programada
En esta parte del código, lo que hemos hecho es crear una lista adicional para recorrer todos los eventos, para 
ello hacemos uso del método stream() para crear un flujo de datos y para poder filtrar por las fechas usamos el método filter,
en el cual le vamos a decir que nos muestre los eventos programado.

<pre>
List<Evento> eventosProgramados = eventos.stream()
                .filter(evento -> evento.getFecha().isBefore(LocalDate.of(LocalDate.now().getYear(), 12, 31)))
                .toList();

</pre>


#### Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
En esta parte del código he usado na variable para guardar la cantidad de eventos, pero yo lo he hecho buscando lo eventos y contando los nombres de los proyectos o eventos:
<pre>
  int numeroEvento = (int) eventos.stream()
                .filter(cantidadEvento -> cantidadEvento.getCategoria().equals(Categoria.REUNION))
                .mapToInt(cantidadEvento -> cantidadEvento.getNombre().length())// Cuento por nombre de los eventos.
                .count();
</pre>


#### Encuentra el evento más próximo en el tiempo utilizando Optionals.
En esta parte de mi código lo que he usado como nos pedía en el ejercicio un Optional de tipo evento, ya que lo que
pide es que busquemos ela fecha más próxima en el tiempo, yo entiendo aquí que la fecha más próxima en el tiempo a la fecha actual,
así tienes controlado los eventos que tienes próximo y tienes la agenda al día.

Como se puede observar uso el método min en el cual le agrego dos parámetros, uno es el mínimo y la otra con la que será comparada, entonces
yo uso la fecha del sistema y así como he dicho antes tenemos los eventos controlados y puestos al día.

<pre>

 // Encuentra el evento más próximo en el tiempo utilizando Optionals.
        System.out.println("---Encuentra el evento más próximo en el tiempo utilizando Optionals---");
        Optional<Evento> eventoMasProximo = eventos.stream()
                .min((evento1, evento2) -> LocalDate.now().compareTo(evento1.getFecha()));//Comparamos la fecha más próxima con la fecha actual.

        eventoMasProximo.ifPresent(evento -> {
            System.out.println("El evento más próximo es: \n" + evento);
        });
</pre>

### ENUM
Para la creación de las categorias he creado un ENUM ya que al ser datos estáticos me es más sencillo de trabajar con ellos:

<pre>
public enum Categoria {
    REUNION, CONFERENCIA, TALLER
}

</pre>