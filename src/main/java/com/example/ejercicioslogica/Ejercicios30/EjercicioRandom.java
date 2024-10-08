package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class EjercicioRandom {

    public void funcion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero.");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero.");
        int num2 = scanner.nextInt();

        for (int num = 1; num <= 10; num++){
            int numeroRandom = (int) Math.floor(Math.random()*(num1-num2+1)+num2);
            System.out.println(numeroRandom);
        }
    }

}
