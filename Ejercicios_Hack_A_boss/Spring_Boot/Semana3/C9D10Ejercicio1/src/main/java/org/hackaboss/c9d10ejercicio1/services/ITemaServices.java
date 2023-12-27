package org.hackaboss.c9d10ejercicio1.services;

import org.hackaboss.c9d10ejercicio1.model.Curso;
import org.hackaboss.c9d10ejercicio1.model.Tema;

import java.util.List;

public interface ITemaServices {

    Tema crearTema(Tema tema);

    List<Tema> obtenerTemaPorCurso(Long idCurso);

    Tema obtenerTemaPorId(Long id);

    Tema obtenerTemaPorNombre(String nombre);


}
