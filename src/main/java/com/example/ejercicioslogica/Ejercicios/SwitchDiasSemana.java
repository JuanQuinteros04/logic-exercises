package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class SwitchDiasSemana {

    public void funcion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana(la primera letra debe ser en mayuscula): ");
        String dia = scanner.nextLine();

        switch (dia){
            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Dia laboral.");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Dia de descanso.");
            default:
                System.out.println("Ingrese un dia de la semana. La primera letra debe ser en mayuscula, ejemplo(Lunes)");

        }
    }

}
