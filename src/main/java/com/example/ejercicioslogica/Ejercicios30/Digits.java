package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class Digits {

    Scanner scanner = new Scanner(System.in);

  public void howManyDigits(Integer number){
        if (number >= 0) {
            String numToChar = number.toString();
            char[] figures = numToChar.toCharArray();
            System.out.println("The number has " + figures.length + " digit/s");
        }else throw new RuntimeException("The number cannot be negative");
  }
}
