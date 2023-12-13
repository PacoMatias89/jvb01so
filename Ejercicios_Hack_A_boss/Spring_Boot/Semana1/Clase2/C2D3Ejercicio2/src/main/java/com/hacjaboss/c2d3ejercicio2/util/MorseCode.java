package com.hacjaboss.c2d3ejercicio2.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MorseCode {


        private static HashMap<Character, String> morseCodeMap;

        static { // I create static data
            morseCodeMap = new HashMap<>();
            morseCodeMap.put('A', ".-");
            morseCodeMap.put('B', "-...");
            morseCodeMap.put('C', "-.-.");
            morseCodeMap.put('D', "-..");
            morseCodeMap.put('E', ".");
            morseCodeMap.put('F', "..-.");
            morseCodeMap.put('G', "--.");
            morseCodeMap.put('H', "....");
            morseCodeMap.put('I', "..");
            morseCodeMap.put('J', ".---");
            morseCodeMap.put('K', "-.-");
            morseCodeMap.put('L', ".-..");
            morseCodeMap.put('M', "--");
            morseCodeMap.put('N', "-.");
            morseCodeMap.put('O', "---");
            morseCodeMap.put('P', ".--.");
            morseCodeMap.put('Q', "--.-");
            morseCodeMap.put('R', ".-.");
            morseCodeMap.put('S', "...");
            morseCodeMap.put('T', "-");
            morseCodeMap.put('U', "..-");
            morseCodeMap.put('V', "...-");
            morseCodeMap.put('W', ".--");
            morseCodeMap.put('X', "-..-");
            morseCodeMap.put('Y', "-.--");
            morseCodeMap.put('Z', "--..");
            morseCodeMap.put('0', "-----");
            morseCodeMap.put('1', ".----");
            morseCodeMap.put('2', "..---");
            morseCodeMap.put('3', "...--");
            morseCodeMap.put('4', "....-");
            morseCodeMap.put('5', ".....");
            morseCodeMap.put('6', "-....");
            morseCodeMap.put('7', "--...");
            morseCodeMap.put('8', "---..");
            morseCodeMap.put('9', "----.");
        }

        public static String convertToMorseCode(String word) {
            StringBuilder morseCode = new StringBuilder();
            word = word.toUpperCase(); // Convert to upper case
            for(int i= 0; i < word.length(); i++) { // let's look for the letter
                char caracter = word.charAt(i);
                if(morseCodeMap.containsKey(caracter)) {
                    morseCode.append(morseCodeMap.get(caracter)).append(" ");
                }
            }
            return morseCode.toString().trim();
        }



}
