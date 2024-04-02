package com.example.ejercicioslogica.Ejercicios;

public class MayorMenorIgual {
    int num1 = 0;
    int num2 = 1000;

    public void mayorMenorIgualFuncion(){
        if (num1 < num2){
            System.out.println("El numero " + num1 + " es MENOR que el numero " + num2 + ".");
        } else if (num1 > num2) {
            System.out.println("El numero " + num1 + " es MAYOR que el numero " + num2 + ".");

        }else {
            System.out.println("El numero " + num1 + " es IGUAL que el numero " + num2 + ".");
        }
    }
}
