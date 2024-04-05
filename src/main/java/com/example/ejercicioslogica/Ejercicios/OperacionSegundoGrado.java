package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class OperacionSegundoGrado {

    public void operacion(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        double a = scanner.nextFloat();

        System.out.println("Ingrese el valor de B: ");
        double b = scanner.nextFloat();

        System.out.println("Ingrese el valor de C: ");
        double c = scanner.nextFloat();

        double discriminante = Math.pow(b, 2) - (4*a*c);

        if (discriminante > 0) {
            double x1 = (b * -1) + (Math.sqrt(discriminante)) / (2 * a);
            double x2 = (b * -1) - (Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }else {
            System.out.println("El discriminante debe ser mayor a 0.");
        }

    }


}
