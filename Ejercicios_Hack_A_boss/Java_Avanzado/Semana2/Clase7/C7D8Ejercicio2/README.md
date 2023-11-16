# Organizador de Tareas

Este programa permite organizar tareas en un proyecto mediante una estructura jerárquica. Cada tarea puede tener subtareas asociadas, y estas subtareas también pueden tener sus propias subtareas, creando así una estructura de "árbol de tareas".

## Instrucciones de Uso

1. **Agregar Tarea Principal:** Ingrese el nombre de la tarea principal cuando se le solicite.
2. **Agregar Tareas y Subtareas:** Se le dará la opción de agregar una tarea (T) o una subtarea (S). Si elige agregar una tarea, simplemente ingrese el nombre de la tarea. Si elige agregar una subtarea, primero indique a qué tarea o subtarea existente desea agregarla y luego ingrese el nombre de la subtarea.
3. **Finalizar Agregado:** Puede finalizar el proceso de agregado ingresando "N". Esto generará la estructura completa de tareas.

## Estructura de Tareas

La estructura completa de tareas se mostrará en formato de "árbol de tareas" mediante el uso de caracteres ASCII para mejorar la visualización.

## Código Fuente

## Clase Main

La clase Main sirve como punto de entrada principal del programa y se encarga de la interacción con el usuario y la lógica de ejecución del programa.


<pre>
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Agregamos tarea principal
        System.out.println("Agregue tarea principal: ");
        Tarea tareaPrincipal = new Tarea(entrada.nextLine());

        // Agregamos subtareas y tareas principales
        boolean agregarTarea = true;

        while (agregarTarea) {
            System.out.println("¿Quieres agregar una tarea o subtarea? (T/S/N)");
            System.out.println("T - Tarea");
            System.out.println("S - Subtarea");
            System.out.println("N - Salir");
            String respuesta = entrada.nextLine();

            if (respuesta.equalsIgnoreCase("T")) {
                System.out.println("Agregue tarea: ");
                Tarea tarea = new Tarea(entrada.nextLine());
                tareaPrincipal.agregaTarea(tarea);
            } else if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("¿A qué tarea/subtarea deseas agregar una subtarea?");
                String tareaPadre = entrada.nextLine();
                Tarea tareaPadreSeleccionada = buscarTarea(tareaPrincipal, tareaPadre);

                if (tareaPadreSeleccionada != null) {
                    System.out.println("Agregue subtarea: ");
                    Tarea subtarea = new Tarea(entrada.nextLine());
                    tareaPadreSeleccionada.agregaSubtarea(subtarea);
                } else {
                    System.out.println("La tarea/subtarea no existe.");
                }
            } else if (respuesta.equalsIgnoreCase("N")) {
                agregarTarea = false;
            } else {
                System.out.println("Respuesta no válida. Por favor, ingrese T, S o N.");
            }
        }

// Mostramos la estructura completa
        System.out.println("Estructura completa de tareas: ");
        ExplorarDirectorio.explorarDirectorioRecursivo(tareaPrincipal, 0);

    }

    private static Tarea buscarTarea(Tarea tarea, String nombre) {
        if (tarea.getNombre().equalsIgnoreCase(nombre)) {
            return tarea;
        }

        for (Tarea subtarea : tarea.getSubtareas()) {
            Tarea resultado = buscarTarea(subtarea, nombre);
            if (resultado != null) {
                return resultado;
            }
        }

        return null;
    }

}

</pre>

### Método `main`

El método `main` es el punto de entrada principal del programa. Utiliza un objeto `Scanner` para recibir la entrada del usuario desde la consola. Luego, crea una instancia de `Tarea` que actúa como la tarea principal del proyecto.

Dentro de un bucle while, el programa permite al usuario agregar tareas y subtareas de manera recursiva. Muestra un menú que le permite al usuario elegir entre agregar una tarea principal (`T`), una subtarea (`S`), o salir del bucle (`N`).

- Si elige agregar una tarea principal (`T`), el programa solicita al usuario el nombre de la tarea y la agrega a la tarea principal.
- Si elige agregar una subtarea (`S`), el programa le pregunta a qué tarea o subtarea desea agregar una subtarea. Luego, busca la tarea seleccionada y agrega la subtarea al nivel correspondiente.
- Si elige salir (`N`), el bucle termina.

Finalmente, muestra la estructura completa de tareas utilizando el método `explorarDirectorioRecursivo` de la clase `ExplorarDirectorio`.

### Método `buscarTarea`

Este método realiza una búsqueda recursiva en la estructura jerárquica de tareas para encontrar una tarea específica por su nombre. Se utiliza para determinar a qué tarea o subtarea se agregarán las nuevas subtareas.

## Clase `ExplorarDirectorio`

La clase `ExplorarDirectorio` se encarga de la representación visual de la estructura de tareas en forma de un árbol de directorios, utilizando códigos ANSI para mejorar la presentación en la consola.

### Método `explorarDirectorioRecursivo`

Este método recorre de forma recursiva la estructura de tareas y subtareas, imprimiendo cada tarea con la indentación apropiada. Utiliza códigos ANSI para cambiar los colores en la consola, mejorando la visualización. Llama a sí mismo para explorar las subtareas de cada tarea.

### Método `imprimirIndentacion`

Este método imprime la cantidad correcta de espacios en blanco para la indentación adecuada en la salida del árbol de tareas.


## Clase `ExplorarDirectorio`

<pre>
public class ExplorarDirectorio {
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void explorarDirectorioRecursivo(Tarea directorio, int nivel) {
        if (directorio == null || directorio.getNombre() == null) {
            return;
        }

        imprimirIndentacion(nivel);
        System.out.println(ANSI_CYAN + "|-- " + directorio.getNombre() + ANSI_RESET);

        for (Tarea tarea : directorio.getTareas()) {
            explorarDirectorioRecursivo(tarea, nivel + 1);
        }

        for (Tarea subtarea : directorio.getSubtareas()) {
            explorarDirectorioRecursivo(subtarea, nivel + 1);
        }
    }

    public static void imprimirIndentacion(int nivel) {
        StringBuilder espacios = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacios.append("    ");  // Utilicé cuatro espacios para mayor claridad
        }
        System.out.print(espacios);
    }
}


</pre>

La clase `ExplorarDirectorio` se encarga de representar visualmente la estructura de tareas en forma de un árbol de directorios utilizando códigos ANSI para mejorar la presentación en la consola.

### Atributos

- `ANSI_CYAN`: Constante que define el código ANSI para el color cian en la consola.
- `ANSI_RESET`: Constante que define el código ANSI para restablecer el color en la consola.

### Método `explorarDirectorioRecursivo`

Este método recorre de forma recursiva la estructura de tareas y subtareas, imprimiendo cada tarea con la indentación adecuada. Utiliza códigos ANSI para cambiar los colores en la consola, mejorando la visualización.

- **Parámetros:**
    - `directorio`: La tarea principal o directorio que se va a explorar.
    - `nivel`: El nivel de indentación en el que se encuentra la tarea actual.

- **Funcionalidad:**
    - Verifica si el directorio es nulo o si su nombre es nulo, en cuyo caso se detiene.
    - Imprime la indentación y el nombre del directorio actual en color cian.
    - Llama recursivamente al método para explorar las tareas y subtareas de la lista de tareas de la tarea actual.
    - Llama recursivamente al método para explorar las subtareas de la tarea actual.

### Método `imprimirIndentacion`

Este método imprime la cantidad correcta de espacios en blanco para la indentación adecuada en la salida del árbol de tareas.

- **Parámetros:**
    - `nivel`: El nivel de indentación actual.

- **Funcionalidad:**
    - Utiliza un bucle para agregar cuatro espacios por nivel de indentación.

Esta clase proporciona una representación visual clara y estructurada de la jerarquía de tareas y subtareas en la consola mediante el uso de colores y formatos ANSI.


## Funcionalidad del proyecto
<pre>
Agregue tarea principal: 
Proyecto
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
s
¿A qué tarea/subtarea deseas agregar una subtarea?
Proyecto
Agregue subtarea: 
Desarrollo Backend
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
s
¿A qué tarea/subtarea deseas agregar una subtarea?
Desarrollo Backend
Agregue subtarea: 
Configuración de la base de datos
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
s
¿A qué tarea/subtarea deseas agregar una subtarea?
Proyecto
Agregue subtarea: 
Desarrollo Fronted
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
s
¿A qué tarea/subtarea deseas agregar una subtarea?
Desarrollo Fronted
Agregue subtarea: 
Configuración de la interfaz de usuario
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
s
¿A qué tarea/subtarea deseas agregar una subtarea?
Proyecto
Agregue subtarea: 
Pruebas
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
s
¿A qué tarea/subtarea deseas agregar una subtarea?
Pruebas
Agregue subtarea: 
Pruebas unitarias con Junit5
¿Quieres agregar una tarea o subtarea? (T/S/N)
T - Tarea
S - Subtarea
N - Salir
n
Estructura completa de tareas: 
|-- Proyecto
    |-- Desarrollo Backend
        |-- Configuración de la base de datos
    |-- Desarrollo Fronted
        |-- Configuración de la interfaz de usuario
    |-- Pruebas
        |-- Pruebas unitarias con Junit5

</pre>

