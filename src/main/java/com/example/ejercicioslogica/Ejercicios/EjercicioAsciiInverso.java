package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class EjercicioAsciiInverso {

    public void charAscii(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        char caracter = scanner.next().charAt(0);
        int numeroAscii = (int) caracter;
        System.out.println("El caracter " + caracter +  "tiene el valor de: " + numeroAscii);

    }

}
