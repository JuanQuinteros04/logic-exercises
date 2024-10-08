package com.example.ejercicioslogica.Ejercicios15;

public class UnoAlCienDivisibleDosTres {

    public void divisible(){
        for (int num=1; num <= 100; num++){
            if (num % 2 == 0 & num % 3 == 0){
                System.out.println(num);
            }
        }
    }
}
