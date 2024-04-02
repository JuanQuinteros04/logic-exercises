package com.example.ejercicioslogica.Ejercicios;

public class OperacionesMatematicasSimples {

    int numero1 = 12;
    int numero2 = 7;

    public int suma(){
        System.out.println("Suma: " + (numero1 + numero2));
        return numero1 + numero2;
    }

    public int resta(){
        System.out.println("Resta: " + (numero1 - numero2));
        return numero1 - numero2;
    }

    public int multiplicacion(){
        System.out.println("Multiplicacion: " + (numero1 * numero2));
        return numero1 * numero2;
    }

    public int division(){
        System.out.println("Division: " + (numero1 / numero2));
        return numero1 / numero2;
    }

}
