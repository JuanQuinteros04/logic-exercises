package com.example.ejercicioslogica.Ejercicios30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumeroPrimo {
   Integer numeroUser = 0;

   Scanner scanner = new Scanner(System.in);

   List<Double> numerosDivisibles = new ArrayList<>();
    public void esPrimo(){
        System.out.println("Ingrese un numero mayor a 1: ");
        numeroUser = scanner.nextInt();
        Integer numeroDividido = Math.sqrt(numeroUser);
        for (Double i = 1.0; i <= numeroDividido; i++){
            if(numeroDividido % i == 0 ){
                numerosDivisibles.add(i);
            }
            System.out.println(numeroDividido % i);
            System.out.println(numeroDividido);
            System.out.println(numeroDividido);
        }
        System.out.println(numerosDivisibles);
        if(numerosDivisibles.size() == 2){
            System.out.println(numeroUser + " es primo.");
        }
    }
}
