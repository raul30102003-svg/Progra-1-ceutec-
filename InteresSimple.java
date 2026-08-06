/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareavariablesmath;

import java.util.Scanner;

public class InteresSimple {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double capital;
            int tasa;
            int tiempo;
            double interes;
            
            System.out.print("Ingrese el capital inicial: ");
            capital = sc.nextDouble();
            
            System.out.print("Ingrese la tasa de interés anual (%): ");
            tasa = sc.nextInt();
            
            System.out.print("Ingrese el tiempo en años: ");
            tiempo = sc.nextInt();
            
            interes = (capital * tasa * tiempo) / 100;
            
            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Interés generado: " + interes);
        }
    }
}