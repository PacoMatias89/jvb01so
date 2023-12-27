package org.hackaboss.c9d10ejercicio1.services;

import org.hackaboss.c9d10ejercicio1.model.Tema;
import org.hackaboss.c9d10ejercicio1.repositories.CursoRepository;
import org.hackaboss.c9d10ejercicio1.repositories.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaServices {

    @Autowired
    private TemaRepository temaRepository;
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Tema crearTema(Tema tema) {
        return temaRepository.save(tema);
    }

    @Override
    public List<Tema> obtenerTemaPorCurso(Long idCurso) {
        return cursoRepository.findById(idCurso).orElse(null).getTemas();
    }

    @Override
    public Tema obtenerTemaPorId(Long id) {
        return temaRepository.findById(id).orElse(null);
    }

    @Override
    public Tema obtenerTemaPorNombre(String nombre) {
        return temaRepository.findByNombre(nombre);
    }
}
