/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareavariablesmath;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radio;
        double area, circunferencia;

        System.out.print("Ingrese el radio del círculo: ");
        radio = sc.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;

        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Circunferencia: %.2f%n", circunferencia);

        sc.close();
    }
}
