import java.util.ArrayList;
import java.util.List;

class Tarea {
    private String nombre;
    private List<Tarea> tareas;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
        this.subtareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void agregaTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void agregaSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }
}
