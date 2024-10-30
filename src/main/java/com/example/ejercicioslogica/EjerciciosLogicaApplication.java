package com.example.ejercicioslogica;

import com.example.ejercicioslogica.Ejercicios30.Digits;
import com.example.ejercicioslogica.Ejercicios30.NumeroPrimo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosLogicaApplication {

    public static void main(String[] args) {

        NumeroPrimo numeroPrimo = new NumeroPrimo();
        numeroPrimo.esPrimo();

    }
}
