package com.hackaboss.c2d3ejercicio1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiConvertMeter {

    @GetMapping("/convert")
    public String convert(@RequestParam double data ) {
        return data +"cm son: "+  (data / 100) +" m";
    }



}
