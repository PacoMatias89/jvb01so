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
