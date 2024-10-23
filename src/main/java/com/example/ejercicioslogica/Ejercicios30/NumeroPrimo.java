package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class NumeroPrimo {
    Double numero = 0.00;
    Scanner scanner = new Scanner(System.in);
    Double resultado = 0.0;

    public void esPrimo(){
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextDouble();
        if (numero <= 1){
            System.out.println("El numero no es primo");
        }
        for (int i = 2; numero%i != 0; i++){
            if (i == numero){
                System.out.println("El numero " + numero + " es primo.");
            }continue;
        }
    }
}
