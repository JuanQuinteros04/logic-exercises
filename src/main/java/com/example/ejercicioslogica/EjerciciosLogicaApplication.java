package com.example.ejercicioslogica;

import com.example.ejercicioslogica.Ejercicios.OperacionesMatematicasSimples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class EjerciciosLogicaApplication {

    public static void main(String[] args) {
        OperacionesMatematicasSimples operacionesMatematicasSimples = new OperacionesMatematicasSimples();
        operacionesMatematicasSimples.suma();
        operacionesMatematicasSimples.resta();
        operacionesMatematicasSimples.multiplicacion();
        operacionesMatematicasSimples.division();


    }
}
