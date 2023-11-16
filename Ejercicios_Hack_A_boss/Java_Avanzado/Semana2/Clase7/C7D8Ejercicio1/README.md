# Ejercicio 1: Exploración de Directorios

Exploración de archivo en un simulacro de directorios

## Clase ExplorarDirectorio

<pre>
public class ExplorarDirectorio {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_YELLOW = "\u001B[33m";

    public static void explorarDirectorioRecursivo(Directorio directorio, int nivel) {
        if (directorio == null || directorio.getNombre() == null) {
            return;
        }

        imprimirIndentacion(directorio, nivel);

        // Diferenciar color para directorios y archivos
        if (nivel > 0) {
            System.out.print(ANSI_CYAN + "|-- " + directorio.getNombre() + ANSI_RESET);
        } else {
            System.out.print(ANSI_CYAN + directorio.getNombre() + ANSI_RESET);
        }

        System.out.println();

        for (String archivo : directorio.getArchivos()) {
            imprimirIndentacion(directorio, nivel + 1);
            System.out.println(ANSI_YELLOW + "|   " + archivo + ANSI_RESET);
        }

        for (Directorio subdirectorio : directorio.getSubDirectorios()) {
            explorarDirectorioRecursivo(subdirectorio, nivel + 1);
        }
    }
    public static void imprimirIndentacion(Directorio directorio, int nivel) {
        StringBuilder espacios = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacios.append("    ");  // Utilicé cuatro espacios para mayor claridad
        }
        System.out.print(espacios);
    }

}


</pre>

**Explicación:**

1. **Definición de Clase:**
    - Declara una clase Java llamada `ExplorarDirectorio`.

2. **Códigos de Color ANSI:**
    - Define códigos de color ANSI como constantes para el formato de texto.

3. **Método `explorarDirectorioRecursivo`:**
    - Método para explorar un directorio de forma recursiva.
    - Verifica si el directorio es nulo o si su nombre es nulo, y retorna temprano si es verdadero.
    - Llama a `imprimirIndentacion` para imprimir la indentación.
    - Diferencia el color para directorios y archivos.
    - Itera sobre los archivos, imprimiendo cada uno con la indentación y color adecuados.
    - **Explora de forma recursiva los subdirectorios.**

4. **Método `imprimirIndentacion`:**
    - Método para imprimir la indentación según el nivel.
    - Utiliza un StringBuilder para agregar espacios según el nivel especificado.

Este código utiliza códigos de color ANSI para mejorar la representación visual de directorios y archivos al explorar un directorio de manera recursiva. El método `imprimirIndentacion` maneja la indentación, y el método `explorarDirectorioRecursivo` explora la estructura del directorio de forma recursiva.






