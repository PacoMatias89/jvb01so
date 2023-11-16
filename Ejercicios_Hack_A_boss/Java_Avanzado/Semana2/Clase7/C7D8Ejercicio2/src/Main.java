import java.util.Scanner;

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
