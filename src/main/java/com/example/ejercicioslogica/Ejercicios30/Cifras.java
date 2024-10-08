package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class Cifras {
    Scanner scanner = new Scanner(System.in);
    public String mostrarCifras(){
        Integer numero = 0;

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();
        }while(numero < 0); int contador = 0; for (int i = numero; i>0; i/=10){
            contador ++;
        }
        if(contador == 1){
            System.out.println("El numero " + numero + " tiene 1 cifra.");
        }else
            System.out.println("El numero " + numero + " tiene " + contador + " cifras");

        return null;
    }
}
