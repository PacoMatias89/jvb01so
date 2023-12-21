package org.hackaboss.c6d7ejercicio1.controller;

import org.hackaboss.c6d7ejercicio1.dto.DisheDto;
import org.hackaboss.c6d7ejercicio1.model.Dishes;
import org.hackaboss.c6d7ejercicio1.service.IDischesService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/dishes")
public class DisheController {


    @Autowired
    private IDischesService dishesService;

    @GetMapping("/{name}")
    public DisheDto getAllDishes(@PathVariable String name) throws FileNotFoundException {
        return dishesService.getDishesByName(name);
    }

}
