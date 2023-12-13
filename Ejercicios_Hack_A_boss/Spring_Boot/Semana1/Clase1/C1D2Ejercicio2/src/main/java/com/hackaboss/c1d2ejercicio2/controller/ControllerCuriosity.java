package com.hackaboss.c1d2ejercicio2.controller;

import com.hackaboss.c1d2ejercicio2.model.Curiosity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@RestController
public class ControllerCuriosity {

    @GetMapping("/curiosity")
    public Curiosity getCuriosity() {
        List<Curiosity> curiosityList = new ArrayList<>();
        curiosityList.add(new Curiosity("El animal más grande del mundo es la ballena azul, que puede llegar a medir hasta 30 metros de largo y pesar hasta 200 toneladas."));
        curiosityList.add(new Curiosity("El animal más pequeño del mundo es la musaraña pigmea, que mide solo 2,9 centímetros de largo."));
        curiosityList.add(new Curiosity("El núcleo de la Tierra es el más caliente de todos los planetas del Sistema Solar, con temperaturas que superan los 5.000 grados Celsius."));
        curiosityList.add(new Curiosity("El océano Atlántico es el océano más grande del mundo, con una superficie de más de 106 millones de kilómetros cuadrados."));
        curiosityList.add(new Curiosity("El cerebro humano es el órgano más complejo del cuerpo humano, con más de 86 mil millones de neuronas."));
        curiosityList.add(new Curiosity("El río Amazonas es el río más largo del mundo, con una longitud de 6.992 kilómetros."));

        Collections.shuffle(curiosityList);
        return curiosityList.get(0);
    }




}
