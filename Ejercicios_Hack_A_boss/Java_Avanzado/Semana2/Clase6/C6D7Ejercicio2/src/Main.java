import java.sql.SQLOutput;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        RegistroMascota<Perro> registroPerros = new RegistroMascota<>();
        RegistroMascota<Gato> registroGatos = new RegistroMascota<>();
        RegistroMascota<Reptil> registroReptiles = new RegistroMascota<>();
        RegistroMascota<Ave> registroAves = new RegistroMascota<>();
/***********************************************************************************************APARTADO 1******************************************************************************************************/

        // Agreamos los perros
        System.out.println("*************AGREGAMOS PERROS************");
        registroPerros.agregarMascota(new Perro(1L, "Max", 3, "Perro", "Labrador Retriever", "Blanco", "Corto"));
        registroPerros.agregarMascota(new Perro(2L, "Luna", 2, "Perro", "Bulldog Francés", "Atigrado", "Largo"));
        System.out.println();

        //Agregamos los gatos
        System.out.println("*************AGREGAMOS GATOS************");
        registroGatos.agregarMascota(new Gato(1L, "Mittens", 3, "Felino", "Siamés", "Blanco", "Corto"));
        registroGatos.agregarMascota(new Gato(2L, "Whiskers", 2, "Felino", "Persa", "Gris", "Largo"));
        System.out.println();

        // Agregamos los reptiles
        System.out.println("*************AGREGAMOS REPTILES************");
        registroReptiles.agregarMascota(new Reptil(8L, "Spike", 4, "Reptil", "Insectos", "Desierto", 28.5));
        registroReptiles.agregarMascota(new Reptil(9L, "Ziggy", 2, "Reptil", "Roedores", "Selva", 30.0));
        System.out.println();

        // Agregamos los aves
        System.out.println("*************AGREGAMOS AVES************");
        registroAves.agregarMascota(new Ave(5L, "Polly", 2, "Ave", "Loro", "Colorido", "Picudo", "Semillas"));
        registroAves.agregarMascota(new Ave(6L, "Tweetie", 3, "Ave", "Canario", "Amarillo", "Pico Cónico", "Semillas y Frutas"));
        System.out.println();
/*************************************************************************************************APARTADO 2****************************************************************************************************/

        //Buscamos mascotas por nombre o especie
        System.out.println("*************BUSCAMOS LAS MASCOTAS************");

        buscarYMostrarMascotas(registroPerros, "Perro", "");
        buscarYMostrarMascotas(registroGatos, "Felino", "");
        buscarYMostrarMascotas(registroAves, "ave", "");
/************************************************************************************************APARTADO 3*****************************************************************************************************/

        //Contamos la cantidad de mascotas registradas
        System.out.println("*************CONTAMOS LA CANTIDAD DE MASCOTAS************");
        int totalRegistradasRegistradas = registroPerros.contarMascotas() + registroAves.contarMascotas() + registroGatos.contarMascotas() + registroReptiles.contarMascotas();
        System.out.println("El total de mascotas es: ".toUpperCase(Locale.ROOT) + totalRegistradasRegistradas);
        System.out.println();
/************************************************************************************************APARTADO 4*****************************************************************************************************/
        System.out.println("*************MASCOTAS ALEATORIAS************");

        // Mascotas aleatorias
        RegistroMascota<Mascota> registroMascotasAleatorias = new RegistroMascota<>();


        // Agregar mascotas aleatorias a registroPerros
        registroMascotasAleatorias.getMascotas().stream()
                .filter(mascota -> mascota instanceof Perro)
                .map(mascota -> (Perro) mascota)
                .forEach(registroPerros::agregarMascota);

        // Agregar mascotas aleatorias a registroGatos
        registroMascotasAleatorias.getMascotas().stream()
                .filter(mascota -> mascota instanceof Gato)
                .map(mascota -> (Gato) mascota)
                .forEach(registroGatos::agregarMascota);

        // Agregar mascotas aleatorias a registroReptiles
        registroMascotasAleatorias.getMascotas().stream()
                .filter(mascota -> mascota instanceof Reptil)
                .map(mascota -> (Reptil) mascota)
                .forEach(registroReptiles::agregarMascota);

        // Agregar mascotas aleatorias a registroAves
        registroMascotasAleatorias.getMascotas().stream()
                .filter(mascota -> mascota instanceof Ave)
                .map(mascota -> (Ave) mascota)
                .forEach(registroAves::agregarMascota);



        // Generar la cantidad deseada de mascotas aleatorias y agregarlas al registro
        registroMascotasAleatorias.generarDatosAleatorios(4);

        // Mostrar todos los datos generados
        registroMascotasAleatorias.mostrarDatosGenerados();


        // Mostrar mascotas aleatorias
        System.out.println("*************BUSCAMOS LAS MASCOTAS CON LOS DATOS ALEATORIOS************");
        buscarYMostrarMascotas(registroPerros, "Perro", "");
        buscarYMostrarMascotas(registroGatos, "Felino", "");
        buscarYMostrarMascotas(registroAves, "ave", "");


        System.out.println();


    }

    private static <T extends Mascota> void agregarMascotasAleatoriasARegistro(RegistroMascota<Mascota> registroMascotasAleatorias, RegistroMascota<T> registroEspecífico) {
        List<Mascota> mascotasAleatorias = registroMascotasAleatorias.getMascotas();
        for (Mascota mascota : mascotasAleatorias) {
            // Verifica si la mascota ya está en el registro específico antes de agregarla
            if (!registroEspecífico.getMascotas().contains(mascota)) {
                registroEspecífico.agregarMascota((T) mascota);
            }
        }
    }


    private static <T extends Mascota> void buscarYMostrarMascotas(RegistroMascota<T> registro, String especie, String nombre) {
        List<T> mascotasEncontradas = registro.buscarMascotas(nombre, especie);

        // Imprimir las mascotas con saltos de línea y espacio adicional
        String mascotasConSaltosDeLinea = mascotasEncontradas.stream()
                .map(Mascota::toString)
                .collect(Collectors.joining("\n\n"));

        System.out.println(mascotasConSaltosDeLinea);
    }


}
