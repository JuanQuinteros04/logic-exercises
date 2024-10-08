package com.example.ejercicioslogica.Ejercicios15;

//3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

import java.util.Scanner;

public class MensajeBienvenida {

    public void mensajeNombre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);
    }



}
