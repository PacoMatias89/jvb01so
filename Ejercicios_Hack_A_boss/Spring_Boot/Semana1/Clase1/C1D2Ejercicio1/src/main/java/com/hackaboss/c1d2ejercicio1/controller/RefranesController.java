package com.hackaboss.c1d2ejercicio1.controller;

import com.hackaboss.c1d2ejercicio1.model.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class RefranesController {



    @GetMapping("/refranes")
    public Refran getRefranes() {
        List<Refran> listRefranes = new ArrayList<>();

        listRefranes.add(new Refran("A buen entendedor, pocas palabras bastan"));
        listRefranes.add(new Refran("A caballo regalado, no le mires el diente"));
        listRefranes.add(new Refran("A Dios rogando y con el mazo dando"));
        listRefranes.add(new Refran("A la tercera va la vencida"));
        listRefranes.add(new Refran("A mal tiempo, buena cara"));
        listRefranes.add(new Refran("A quien madruga, Dios le ayuda"));
        listRefranes.add(new Refran("A quien no quiere caldo, dos tazas"));
        listRefranes.add(new Refran("A toda prisa, el hombre se aburre y la mula se desboca"));
        listRefranes.add(new Refran("Al mal paso, darle prisa"));
        listRefranes.add(new Refran("Al pan, pan y al vino, vino"));
        listRefranes.add(new Refran("Al que madruga, Dios le ayuda"));

        // Reordena la lista de forma aleatoria
        Collections.shuffle(listRefranes);

        // Devuelve un refrán aleatorio
        return listRefranes.get(0);
    }
}
