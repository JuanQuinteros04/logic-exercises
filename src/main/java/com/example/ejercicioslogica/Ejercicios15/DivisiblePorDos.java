package com.example.ejercicioslogica.Ejercicios15;

import java.util.Scanner;

public class DivisiblePorDos {

    public void divisiblePorDos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a comprobar: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println(numero + " es divisible por dos.");
        }else {
            System.out.println(numero + " no es divisible por dos.");
        }
    }

}
