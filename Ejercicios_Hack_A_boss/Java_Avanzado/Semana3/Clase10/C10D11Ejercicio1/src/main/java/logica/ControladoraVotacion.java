package logica;

import java.util.List;
import persistencia.ControladoraPersistenciaVotacion;

public class ControladoraVotacion {
    Votacion voto = new Votacion();

    ControladoraPersistenciaVotacion controladora = new ControladoraPersistenciaVotacion();
    


    public void crearVoto(Votacion voto) {

        controladora.crearVoto(voto);
    }

    public List<Votacion> mostrarVotaciones() {
        return controladora.votaciones();
    }
    
    public void modificarVoto(Votacion voto){
        controladora.modificarVoto(voto);
    }
    
    public Votacion buscarVotacionPorPartido(String partido) {
        // Realizar la búsqueda directamente en la base de datos
        return controladora.buscarVotacionPorPartido(partido);
    }

}
