package org.hackaboss.c9d10ejercicio1.repositories;

import org.hackaboss.c9d10ejercicio1.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNombre(String nombre);
}
