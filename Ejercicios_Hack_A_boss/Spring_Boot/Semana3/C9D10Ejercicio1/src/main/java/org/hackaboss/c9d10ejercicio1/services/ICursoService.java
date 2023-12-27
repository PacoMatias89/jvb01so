package org.hackaboss.c9d10ejercicio1.services;

import org.hackaboss.c9d10ejercicio1.model.Curso;

import java.util.List;

public interface ICursoService {

    Curso crearCurso(Curso curso);
    List<Curso> listarCursos();

    Curso obtenerCurso(Long id);



    List<Curso> obtenerCursosConNombreQueContieneJava();

}
