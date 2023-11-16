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
