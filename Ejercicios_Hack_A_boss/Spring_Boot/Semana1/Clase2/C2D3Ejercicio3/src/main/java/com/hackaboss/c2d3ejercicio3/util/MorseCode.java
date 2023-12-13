package com.hackaboss.c2d3ejercicio3.util;

import java.util.HashMap;

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

        public static String convertToMorseCode(String phrase) {
            StringBuilder morseCode = new StringBuilder();
            String[] words = phrase.split("\\s+"); // Divide the sentences into words


            for (String word : words) { // Iterates over each word in the phrase
                word = word.toUpperCase(); // Convert to upper case
                for (int i = 0; i < word.length(); i++) {
                    char character = word.charAt(i);
                    if (morseCodeMap.containsKey(character)) {
                        morseCode.append(morseCodeMap.get(character)).append(" ");
                    }
                }
                morseCode.append("/ "); // I add a word separator at the end of each word
            }
            return morseCode.toString().trim();
        }



}
