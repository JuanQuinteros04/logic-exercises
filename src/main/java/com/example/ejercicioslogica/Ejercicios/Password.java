package com.example.ejercicioslogica.Ejercicios;

import java.util.Scanner;

public class Password {

    public void funcion() {

        String contra = "Miramar4357";
        int intentos = 0;
        boolean acierto = false;

        Scanner scanner = new Scanner(System.in);

        while (intentos < 3 && !acierto) {

            System.out.println("Ingrese la contraseña: ");
            String contraUser = scanner.nextLine();
            intentos++;

            if (contra.equals(contraUser)) {
                System.out.println("Contraseña correcta. Accediendo a los datos...");
                acierto = true;
            }
        }
    }
}