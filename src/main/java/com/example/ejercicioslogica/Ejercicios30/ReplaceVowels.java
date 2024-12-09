package com.example.ejercicioslogica.Ejercicios30;

import java.util.ArrayList;
import java.util.List;

public class ReplaceVowels {

    List<String> vowels = List.of("a","e","i","o","u");
    List<Character> phraseE = new ArrayList<>();
    Character e = new Character('e');
    Integer vowelsCount = 0;

    public void tour(){
        String phrase = "La lluvia en Sevilla es una maravilla";
        String phraseLower = phrase.toLowerCase();
        for (int i = 0; i < phraseLower.length(); i++){
            Character letter = phraseLower.charAt(i);
            if (vowels.get(0).equals(letter.toString())){
                phraseE.add(e);
            }else phraseE.add(letter);
        }
        System.out.println(phraseE);
        System.out.println(phraseE.toString());
    }

}
