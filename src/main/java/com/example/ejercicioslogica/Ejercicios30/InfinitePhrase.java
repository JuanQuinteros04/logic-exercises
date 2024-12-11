package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class InfinitePhrase {
    Scanner scanner = new Scanner(System.in);

    public void introducePhrase(){
        String combinationPhrase="";
        String phrase;

        do {
            System.out.println("Ingrese una frase: ");
            phrase = scanner.nextLine();
            combinationPhrase = combinationPhrase + phrase;
        }while (!phrase.isEmpty());

        System.out.println(combinationPhrase);
    }
}
