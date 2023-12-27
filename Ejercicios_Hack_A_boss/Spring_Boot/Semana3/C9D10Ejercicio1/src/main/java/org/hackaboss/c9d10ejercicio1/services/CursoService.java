package org.hackaboss.c9d10ejercicio1.services;

import org.hackaboss.c9d10ejercicio1.model.Curso;
import org.hackaboss.c9d10ejercicio1.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService implements ICursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Curso crearCurso(Curso curso) {
        // Verificar que la fecha de finalización esté en el futuro
        if (curso.getFechaFinalizacion() != null && curso.getFechaFinalizacion().isBefore(LocalDate.now())) {

            throw new IllegalArgumentException("La fecha de finalización debe estar en el futuro.");
        }

        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso obtenerCurso(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }



    @Override
    public List<Curso> obtenerCursosConNombreQueContieneJava() {
        List<Curso> cursos = cursoRepository.findAll();
        //Filtramos para que el curso contenga java
        List<Curso> cursosConJava = cursos
                .stream()
                .filter(curso -> curso.getNombre().toLowerCase().contains("java"))
                .toList();
        return cursosConJava;

    }
}
