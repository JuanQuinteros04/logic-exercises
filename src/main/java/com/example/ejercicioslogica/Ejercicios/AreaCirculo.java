package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

import static java.lang.Math.PI;

public class AreaCirculo {

    public void areaCirculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = Double.parseDouble(scanner.nextLine());
        double area = PI * Math.pow(radio,2);
        System.out.println("El area del circulo es: " + area);
    }
}
