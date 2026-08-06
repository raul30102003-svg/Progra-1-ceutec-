/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareavariablesmath;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, altura;
        double area, perimetro;

        System.out.print("Ingrese la base del rectángulo: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        sc.close();
    }
}
