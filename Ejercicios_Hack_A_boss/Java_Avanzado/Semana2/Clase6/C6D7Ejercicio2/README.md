# Ejercicio 2: Veterinaria
Este ejercicio es una pequeña aplicación de gestión para una veterinaria, en la cual gestionaremos el registro de los animales, la busqueda tanto por especie como por nombre
la cantidad de animales que tenemos registrados en la veterinaria y la de generar datos aleatoriamente.

Los pasos que nos dan para la realización del ejercicio son : 

## Pasos:
+ Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
+ Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
+ Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
+ Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.

### Paso 1
En este paso como bien dice lo que haremos en agregar los animales. En este caso lo que haremos una vez creadas todas las clases que nos piden
es crearnos un método llamado _agregarMascota_ el cual como su propia palabra dice agregará las mascota. El método estará ubicado en la clase 
**RegistroMascota**.

<pre>
   public void agregarMascota(T mascota) {
        this.mascotas.add(mascota);
        System.out.println("La mascota " + mascota.getNombre() + " ha sido agregada en la base de datos....");
    }
</pre>

El cual no va a devolver nada y le agregaremos un parámetro de tipo genérico, para así poder agregar los objetos de los animales.


<pre>
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
</pre>
Este trozo de código es lo que haremos en la clase Main

### Paso 2
En este paso y trabajando en la misma clase **RegistroMascota** crearemos un método para buscar los animales. En el enunciado te dice que puedes
buscar por especie o por el nombre del animal.
<pre>
       public List<T> buscarMascotas(String nombre, String especie) {
        List<T> filtrarMascota = mascotas.stream()
                .filter(mascota -> mascota.getNombre().equalsIgnoreCase(nombre) || mascota.getEspecie().equalsIgnoreCase(especie))
                .collect(Collectors.toList());


        return filtrarMascota;
    }

</pre>
Como podremos ver en el método le agrego dos parámetros pero puedes buscar tanto por el nombre como por la especie.

En el Main me creo otro método llamado _buscarYMostrarMascotas_ que recibe tres parámetros, uno es de tipo RegristroMascotas que es de tipo genérico y luego recibe 2 String, el nombre y la especie:

<pre>
    private static <T extends Mascota> void buscarYMostrarMascotas(RegistroMascota<T> registro, String especie, String nombre) {
        List<T> mascotasEncontradas = registro.buscarMascotas(nombre, especie);

        // Imprimir las mascotas con saltos de línea y espacio adicional
        String mascotasConSaltosDeLinea = mascotasEncontradas.stream()
                .map(Mascota::toString)
                .collect(Collectors.joining("\n\n"));

        System.out.println(mascotasConSaltosDeLinea);
    }


</pre>
En este método lo que hago también como se puede ver es que en la lista que vamos a ver tengamos una salto de línea entre lso objetos y
así poder visualizarlos mejor. 
Y así quedaría la llamada del método :
<pre>
        //Buscamos mascotas por nombre o especie
        System.out.println("*************BUSCAMOS LAS MASCOTAS************");

        buscarYMostrarMascotas(registroPerros, "Perro", "");
        buscarYMostrarMascotas(registroGatos, "Felino", "");
        buscarYMostrarMascotas(registroAves, "ave", "");

</pre>

Como podemos ver, sólo estoy buscando por especie y no por nombre y especie, aunque también se podría y por el nombre solo también se podría.

### Paso 3
En este caso nos pude que obtenamos la longitud de la lista de las mascotas, en otras palabras, que  mostremos cual es la cantidad de animales que tenemos registrados.

Para ello creamos un método en la clase **RegistroMascota** llamado _contarMascota_ y así iremos contando cada array de los animales.

<pre>
  //Contamos las mascotas que hay
    public int contarMascotas() {
        return mascotas.size();
    }
</pre>

Por último en el mán lo que hacemos en sumar la cantidad de todos los animales que hay en nuestro registro:
<pre>
        //Contamos la cantidad de mascotas registradas
        System.out.println("*************CONTAMOS LA CANTIDAD DE MASCOTAS************");
        int totalRegistradasRegistradas = registroPerros.contarMascotas() + registroAves.contarMascotas()+registroGatos.contarMascotas()+registroReptiles.contarMascotas();
        System.out.println("El total de mascotas es: ".toUpperCase(Locale.ROOT) +totalRegistradasRegistradas);
        System.out.println();
</pre>

### Paso 4

En la clase Mascota me creo un método llamado _generarMascotaAleatoria_ , el cual generará los datos aleatoriamente:

En el main los voy agregando uno a uno;

<pre>
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

</pre>

<pre>
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

</pre>
Este método lo que va hacer es que va a generar X cantidad de aleatorios, si al crearlo el objeto tiene alguna de las especies específicas lo que hará es
buscarla en el swicht y así poder asignarlo alguna de las clases específicas


Una vez que los he agregado y los he generado toca mostrar todo los animales, para ello usamos estos dos métodos:

<pre>

  // Mostrar todos los datos generados
        registroMascotasAleatorias.mostrarDatosGenerados();


        // Mostrar mascotas aleatorias
        System.out.println("*************BUSCAMOS LAS MASCOTAS CON LOS DATOS ALEATORIOS************");
        buscarYMostrarMascotas(registroPerros, "Perro", "");
        buscarYMostrarMascotas(registroGatos, "Felino", "");
        buscarYMostrarMascotas(registroAves, "ave", "");



</pre>

el método mostrarDatosGenerados es un método que está ubicado en la clase RegistroMascotas, el cual nos va a proporcionar todas las listas de los animales generodos

y el segundo método es el mismo método que en apartado 2, para así verificar que los datos por ejemplo de Perro, Felino y Ave se han guardo, en el caso de que se genere algún reptíl no lo
mostrará, ya que habría que crear un 4º método para tal fin, pero para efectos prácticos con esos 3 creo que está bien, ya que funcionan perfectamente.