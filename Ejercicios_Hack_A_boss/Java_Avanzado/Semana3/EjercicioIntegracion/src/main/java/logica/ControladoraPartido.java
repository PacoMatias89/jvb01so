
package logica;

import java.time.LocalDate;
import java.util.List;
import persistencia.ControladoraPersistenciaPartido;


public class ControladoraPartido {
    
    ControladoraPersistenciaPartido controladoraPartido = new ControladoraPersistenciaPartido();
    
    public void crearPartido(Partido pa){
        controladoraPartido.crearPartido(pa);
    }
    
    public List<Partido> listaPartidos(){
        return controladoraPartido.traerPartido();
    }
    
    // Verifica si hay un partido programado para un equipo en una fecha específica
    public boolean existePartidoEnFecha(Long idEquipo, LocalDate fecha) {
        List<Partido> partidos = controladoraPartido.traerPartidoPorEquipoYFecha(idEquipo, fecha);
        return !partidos.isEmpty();
    }
    
}
