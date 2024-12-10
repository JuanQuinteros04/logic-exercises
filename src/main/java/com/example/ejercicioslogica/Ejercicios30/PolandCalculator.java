package com.example.ejercicioslogica.Ejercicios30;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PolandCalculator {

    Scanner scanner = new Scanner(System.in);


    public String calcuar(){
        System.out.println("Ingrese el primer numero: ");
        Integer a = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        Integer b = scanner.nextInt();

        System.out.println("Ingrese la operacion: ");
        String operacion = scanner.next();

        switch (operacion){
            case "+":
                System.out.println("El resultado es: " + (a + b));
                break;
            case "-":
                System.out.println("El resultado es: " + (a - b));
                break;

            case "/":
                System.out.println("El resultado es: " + (a / b));
                break;

            case "*":
                System.out.println("El resultado es: " + (a * b));
                break;

            case "^":
                System.out.println("El resultado es: " + (a ^ b));
                break;

            case "%":
                System.out.println("El resultado es: " + (a % b));
                break;

            default:
                System.out.println("Ingrese informacion valida.");

        }
        return "Operacion exitosa";
    }

}
