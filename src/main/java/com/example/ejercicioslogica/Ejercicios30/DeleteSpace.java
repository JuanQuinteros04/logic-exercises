package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class DeleteSpace {

    Scanner scanner = new Scanner(System.in);

    public void delete(){
        System.out.println("Ingrese una frase: ");
        String phrase = scanner.nextLine();
        System.out.println("Phrase: "+ phrase.replaceAll(" ", ""));
    }

}
