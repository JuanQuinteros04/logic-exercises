package com.example.ejercicioslogica;

import com.example.ejercicioslogica.Ejercicios30.Digits;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosLogicaApplication {

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.howManyDigits(1234567890);



    }
}
