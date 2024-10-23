package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class Digits {

    Scanner scanner = new Scanner(System.in);


    public void howManyDigitsLogic(){
        System.out.println("Enter a number integer and positive: ");
        int number = scanner.nextInt();
        if (number >= 0) {

            String numberString = Integer.toString(number);

            Character firstArray[] = new Character[numberString.length()];
            for (int i = 0; i < numberString.length(); i++) {
                firstArray[i] = numberString.charAt(i);
            }
            System.out.println("The number has (" + firstArray.length + ") digit/s.");
        }else throw new RuntimeException("The number cannot be negative.");
    }


  public void howManyDigitsFunctions(){
      System.out.println("Enter a number integer and positive: ");
        Integer number = scanner.nextInt();
        if (number >= 0) {
            String numToChar = number.toString();
            char[] figures = numToChar.toCharArray();
            System.out.println("The number has " + figures.length + " digit/s");
        }else throw new RuntimeException("The number cannot be negative");
  }
}
