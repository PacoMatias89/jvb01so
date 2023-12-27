package org.hackaboss.c9d10ejercicio1.repositories;

import org.hackaboss.c9d10ejercicio1.model.Curso;
import org.hackaboss.c9d10ejercicio1.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemaRepository extends JpaRepository<Tema, Long> {

    Tema findByNombre(String nombre);

    List<Tema> findByCurso(Curso curso);
}
