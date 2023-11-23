
package persistencia;

import java.time.LocalDate;
import java.util.List;
import logica.Partido;


public class ControladoraPersistenciaPartido {
    
     PartidoJpaController partidoJpa = new PartidoJpaController();
    
    public void crearPartido(Partido partido){
        partidoJpa.create(partido);
    }
    
    public List<Partido> traerPartido(){
        return partidoJpa.findPartidoEntities();
    }
    
    // Método para obtener partidos por equipo y fecha
    public List<Partido> traerPartidoPorEquipoYFecha(Long idEquipo, LocalDate fecha) {
        return partidoJpa.traerPartidoPorEquipoYFecha(idEquipo, fecha);
    }
    
}
