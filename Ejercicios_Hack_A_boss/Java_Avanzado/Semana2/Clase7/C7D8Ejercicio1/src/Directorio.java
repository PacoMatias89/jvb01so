import java.util.ArrayList;
import java.util.List;

public class Directorio {

    private final int id;
    private String nombre;
    List<Directorio> subDirectorios;
    List<String> archivos;

    public Directorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subDirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    //agregamos los directorios
    public void agregarDirectorio(Directorio directorio) {
        this.subDirectorios.add(directorio);
    }

    //agregamos los archivos
    public void agregarArchivo(String archivo) {
        this.archivos.add(archivo);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubDirectorios() {
        return subDirectorios;
    }

    public void setSubDirectorios(List<Directorio> subDirectorios) {
        this.subDirectorios = subDirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }
}
