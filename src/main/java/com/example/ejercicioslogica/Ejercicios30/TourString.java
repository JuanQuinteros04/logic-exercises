package com.example.ejercicioslogica.Ejercicios30;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TourString {

    List<String> vowels = List.of("a","e","i","o","u");
    Integer vowelsCount = 0;

    public void tour(){
        String phrase = "La lluvia en Sevilla es una maravilla";
        String phraseLower = phrase.toLowerCase();
        for (int i = 0; i < phraseLower.length(); i++){
            Character letter = phraseLower.charAt(i);
            for (int a = 0; a < 5; a++) {
                if (vowels.get(a).equals(letter.toString())){
                    System.out.println("ES IGUAL");
                    vowelsCount++;
                }
            }

        }
        System.out.println("La cantidad de vocales es de : " + vowelsCount);
    }
}
