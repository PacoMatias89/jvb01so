package com.hacjaboss.c2d3ejercicio2.controller;

import com.hacjaboss.c2d3ejercicio2.util.MorseCode;
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
