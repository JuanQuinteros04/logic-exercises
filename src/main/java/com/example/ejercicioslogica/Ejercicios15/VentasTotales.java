package com.example.ejercicioslogica.Ejercicios15;

import java.util.Scanner;

public class VentasTotales {

    public void funcionVentas(){

        float total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero total de ventas: ");
        float numeroVentass = scanner.nextFloat();

        for (int num= 1; num <= numeroVentass; num++){
            System.out.println("Ingrese el valor total de la venta: ");
            float venta = scanner.nextFloat();
            total = total + venta;
        }
        System.out.println("Total: " + total);
    }

}
