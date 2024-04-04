package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class EjercicioIva {

    public void calcularIVA(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        float precio = scanner.nextFloat();
        System.out.println("El precio total con IVA es de: " + funcionIVA(precio));

    }

    public float funcionIVA(float precio){
        return ((precio * 21) / 100) + precio;
    }

}
