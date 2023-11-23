
package logica;

import java.util.List;
import persistencia.ControladoraPersistenciaEquipo;


public class ControladoraEquipo {
    ControladoraPersistenciaEquipo controladoraEquipo = new ControladoraPersistenciaEquipo();
    
    
    public void crearEquipo(Equipo eq){
        controladoraEquipo.crearEquipo(eq);
    }
    
    public List<Equipo> traerEquipo(){
        return controladoraEquipo.traerEquipo();
    }
    
    public Equipo buscarEquipoPorId(Long id){
        return controladoraEquipo.buscarPorId(id);
    }
    
}
