import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascota<T extends Mascota> {
    private List<T> mascotas;

    public RegistroMascota() {
        this.mascotas = new ArrayList<>();
    }

    public List<T> getMascotas() {
        return mascotas;
    }

    //Registro de mascotas
    public void agregarMascota(T mascotas) {
        this.mascotas.add(mascotas);
        System.out.println("La mascota " + mascotas.getNombre() + " de la especie "+mascotas.getEspecie() +" ha sido agregada en la base de datos....");
    }

    //Buscar mascotas por nombre o especie
    public List<T> buscarMascotas(String nombre, String especie) {
        List<T> filtrarMascota = mascotas.stream()
                .filter(mascota -> mascota.getNombre().equalsIgnoreCase(nombre) || mascota.getEspecie().equalsIgnoreCase(especie))
                .collect(Collectors.toList());


        return filtrarMascota;
    }

    //Contamos las mascotas que hay
    public int contarMascotas() {
        return mascotas.size();
    }

    public void mostrarDatosGenerados() {
        System.out.println("*************MUESTRAS LOS DATOS GENERADOS************");
        mascotas.forEach(mascota -> System.out.println(mascota));
    }



    // Generamos mascotas aleatorias
    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        int mascotasGeneradas = 0;

        while (mascotasGeneradas < cantidad) {
            Long id = (long) (mascotasGeneradas + 1);
            String nombre = "Mascota " + id;
            Integer edad = random.nextInt(10) + 1;

            // Generar especie aleatoria entre "perro", "gato", "ave", o "reptil"
            String[] especies = {"perro", "gato", "ave", "reptil"};
            String especie = especies[random.nextInt(especies.length)];

            // Crear una instancia de mascota específica y agregarla al registro específico
            switch (especie) {
                case "perro":
                    Perro perro = crearMascota(id, nombre, edad, especie);
                    agregarMascota((T) perro);
                    break;
                case "gato":
                    Gato gato = crearMascota(id, nombre, edad, especie);
                    agregarMascota((T) gato);
                    break;
                case "ave":
                    Ave ave = crearMascota(id, nombre, edad, especie);
                    agregarMascota((T) ave);
                    break;
                case "reptil":
                    Reptil reptil = crearMascota(id, nombre, edad, especie);
                    agregarMascota((T) reptil);
                    break;

            }

            mascotasGeneradas++;
        }



    }



    private <U extends Mascota> U crearMascota(Long id, String nombre, Integer edad, String especie) {
        switch (especie.toLowerCase()) {
            case "perro":
                // Ajusta los parámetros según las características específicas de Perro
                return (U) new Perro(id, nombre, edad, especie, "RazaPerro", "ColorPeloPerro", "TipoPeloPerro");
            case "gato":
                // Ajusta los parámetros según las características específicas de Gato
                return (U) new Gato(id, nombre, edad, especie, "RazaGato", "ColorPeloGato", "TipoPeloGato");
            case "ave":
                // Ajusta los parámetros según las características específicas de Ave
                return (U) new Ave(id, nombre, edad, especie, "PlumajeAve", "ColorPlumajeAve", "TipoPicoAve", "AlimentacionAve");
            case "reptil":
                // Ajusta los parámetros según las características específicas de Reptil
                return (U) new Reptil(id, nombre, edad, especie, "AlimentacionReptil", "HabitatReptil", 25.0);
            default:
                // Puedes manejar otros casos o lanzar una excepción si es necesario
                throw new IllegalArgumentException("Especie desconocida: " + especie);
        }
    }


//

}







