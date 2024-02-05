package com.example.ejercicioslogica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class EjerciciosLogicaApplication {

    public static void main(String[] args) {

//        String texto=.showInputDialog("Introduce un codigo de la tabla ASCII");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un codigo de la tabla ASCII");
        String texto = sc.next();
        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);

        //Pasamos el codigo a caracter
        char caracter=(char)codigo;

        System.out.println(caracter);
    }
}
