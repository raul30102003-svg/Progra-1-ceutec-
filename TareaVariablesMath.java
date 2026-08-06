/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareavariablesmath;

import java.util.Scanner;

public class TareaVariablesMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Seleccione un ejercicio:");
        System.out.println("1. Rectángulo");
        System.out.println("2. Círculo");
        System.out.println("3. Interés simple");
        System.out.print("Opción: ");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Rectangulo.main(args);
                break;

            case 2:
                Circulo.main(args);
                break;

            case 3:
                InteresSimple.main(args);
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }
}