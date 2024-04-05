package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class DoWhileMayorIgualCero {

    public void definir(){
        double numero = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextDouble();
        }while (numero< 0);

    }

}
