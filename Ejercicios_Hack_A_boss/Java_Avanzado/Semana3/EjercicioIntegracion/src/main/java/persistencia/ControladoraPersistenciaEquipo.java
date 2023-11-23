
package persistencia;

import java.util.List;
import logica.Equipo;



public class ControladoraPersistenciaEquipo {
    
    EquipoJpaController equipoJpa = new EquipoJpaController();
    
    public void crearEquipo(Equipo equipo){
        equipoJpa.create(equipo);
    }
    
    public List<Equipo> traerEquipo(){
        return equipoJpa.findEquipoEntities();
    }
    
    public Equipo buscarPorId(Long id){//Buscamos el equipo por Id
        return equipoJpa.findEquipo(id);
    }
   
    
}
