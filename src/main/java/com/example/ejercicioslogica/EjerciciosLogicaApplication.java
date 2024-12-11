package com.example.ejercicioslogica;

import com.example.ejercicioslogica.Ejercicios30.*;
//import com.example.ejercicioslogica.Ejercicios30.NumeroPrimo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosLogicaApplication {

    public static void main(String[] args) {

       Addition addition = new Addition();
       addition.sumar();
    }
}
