package org.example.persistencia;

import org.example.logica.Platillo;

import java.util.List;

public class ControladoraPersistencia {

    PlatilloJpaController platilloJpaController = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        platilloJpaController.create(platillo);
    }

    public void borrarPlatillo(Long id) {
        platilloJpaController.destroy(id);
    }

    public void actualizarPlatillo(Platillo platillo) {
        platilloJpaController.edit(platillo);
    }

    public List<Platillo> obtenerPlatillos() {
        return platilloJpaController.findPlatilloEntities();
    }
}
