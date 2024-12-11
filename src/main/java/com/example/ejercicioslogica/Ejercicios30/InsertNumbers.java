package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class InsertNumbers {

    Scanner scanner = new Scanner(System.in);

    public void insertar() {
        Integer number;
        Integer count = 0;
        do {
            System.out.println("Ingrese un numero");
            number = scanner.nextInt();
            count++;
        } while (number != -1);
        System.out.println("El numero de numeros es de: " + count);
    }

}
