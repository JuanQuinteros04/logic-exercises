package com.example.ejercicioslogica;

import com.example.ejercicioslogica.Ejercicios30.Digits;
//import com.example.ejercicioslogica.Ejercicios30.NumeroPrimo;
import com.example.ejercicioslogica.Ejercicios30.TourString;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosLogicaApplication {

    public static void main(String[] args) {

        TourString tourString = new TourString();
        tourString.tour();
    }
}
