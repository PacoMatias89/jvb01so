package org.hackaboss.c9d10ejercicio1.controller;

import org.hackaboss.c9d10ejercicio1.dto.TemaDto;
import org.hackaboss.c9d10ejercicio1.model.Tema;
import org.hackaboss.c9d10ejercicio1.services.ITemaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temas")
public class TemaController {

    @Autowired
    private ITemaServices temaServices;


    @PostMapping("/agregar")
    public String agregarTema (@RequestBody Tema tema) {
        temaServices.crearTema(tema);
        return "Tema "+ tema.getNombre() +" ha sido agregado con exito";
    }

    @GetMapping("/obtener/{cursoid}")
    public List<Tema> obtenerTemas (@PathVariable Long cursoid) {
        return temaServices.obtenerTemaPorCurso(cursoid);
    }

    @PutMapping("/actualizar/{id}")
    public String actualizarTema (@PathVariable Long id, @RequestBody TemaDto temaDto) {
        //Lo primero que tenemos que hacer es buscar el objeto curso por su id
        Tema tema = temaServices.obtenerTemaPorId(id);
        //Verificamos que ese curso existe
        if (tema!= null) {
            tema.setNombre(temaDto.getNombre());
            tema.setDescripcion(temaDto.getDescripcion());
        }
        temaServices.crearTema(tema);
        return "Tema " + tema.getNombre() + " ha sido actualizado exitosamente";
    }


}
