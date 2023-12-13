package com.hackaboss.c2d3ejercicio3.controller;

import com.hackaboss.c2d3ejercicio3.util.MorseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseCodeController {

    @GetMapping("/morseCode")
    public String morseCode(@RequestParam String code) {
        MorseCode morseCode = new MorseCode();
        return morseCode.convertToMorseCode(code);
    }

}
