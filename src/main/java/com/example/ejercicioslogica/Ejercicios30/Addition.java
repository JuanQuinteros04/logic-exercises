package com.example.ejercicioslogica.Ejercicios30;

import java.util.Scanner;

public class Addition {

    Scanner scanner = new Scanner(System.in);

    int addition = 1;
    int result=0;
    public void sumar(){
        System.out.println("Ingresar el numero maximo de sumas: ");
        int max = scanner.nextInt();
        if (max>1) {
            do {
                result= addition+result;
                System.out.println(result);
                addition++;
            }
            while (addition < max);

            }else throw new RuntimeException("Ingrese un valor valido.");
    }

}
