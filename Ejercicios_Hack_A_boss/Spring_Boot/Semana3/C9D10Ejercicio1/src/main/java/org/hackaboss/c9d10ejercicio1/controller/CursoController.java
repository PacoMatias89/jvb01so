package org.hackaboss.c9d10ejercicio1.controller;


import org.hackaboss.c9d10ejercicio1.dto.CursoDto;
import org.hackaboss.c9d10ejercicio1.model.Curso;
import org.hackaboss.c9d10ejercicio1.services.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private ICursoService cursoServices;

    @PostMapping("/agregar")
    public String agregarCurso(@RequestBody Curso curso) {
        cursoServices.crearCurso(curso);
        return "Curso " + curso.getNombre() + " creado exitosamente";
    }

    @GetMapping("/listar")
    public List<Curso> listarCursos() {
        return cursoServices.listarCursos();
    }

    @GetMapping("/java")
    public List<Curso> listarCursosJava() {
        return cursoServices.obtenerCursosConNombreQueContieneJava();
    }

    @PutMapping("/actualizar/{id}")
    public String actualizarCurso(@PathVariable Long id, @RequestBody CursoDto cursoDto) {
        //Lo primero que tenemos que hacer es buscar el objeto curso por su id
        Curso curso = cursoServices.obtenerCurso(id);
        //Verificamos que ese curso existe
        if (curso != null) {
            curso.setNombre(cursoDto.getNombre());
            curso.setFechaFinalizacion(cursoDto.getFechaFinalizacion());
        }
        cursoServices.crearCurso(curso);
        return "Curso " + curso.getNombre() + " ha sido actualizado exitosamente";
    }
}
