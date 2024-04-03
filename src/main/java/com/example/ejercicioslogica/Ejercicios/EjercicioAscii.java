package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class EjercicioAscii {
    public void ascii(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        char ch = (char) numero;
        System.out.println("Valor ASCII : " + ch);
}


}
