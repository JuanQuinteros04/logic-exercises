package com.example.ejercicioslogica.Ejercicios;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaCirculo {

    public void areaCirculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        scanner.useLocale(Locale.US);
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }
}
