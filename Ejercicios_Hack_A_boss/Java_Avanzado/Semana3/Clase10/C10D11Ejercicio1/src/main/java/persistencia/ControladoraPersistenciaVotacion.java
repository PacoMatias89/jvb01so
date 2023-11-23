package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Votacion;

public class ControladoraPersistenciaVotacion {

    VotacionJpaController votacionJpa = new VotacionJpaController();

    public void crearVoto(Votacion votacion) {
        votacionJpa.create(votacion);
    }

    public void modificarVoto(Votacion votomodificado) {
        try {
            votacionJpa.edit(votomodificado);
        } catch (Exception e) {
            Logger.getLogger(ControladoraPersistenciaVotacion.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    public List<Votacion> votaciones() {
        return votacionJpa.findVotacionEntities();
    }
   
 

    public Votacion buscarVotacionPorPartido(String partido) {
        List<Votacion> votaciones = votacionJpa.findVotacionByPartido(partido);
        return votaciones.isEmpty() ? null : votaciones.get(0);
    }

}
