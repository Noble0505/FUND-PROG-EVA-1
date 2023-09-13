/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.C
 */
package eva1_9_area_triangulo;

import java.util.Scanner;

public class EVA1_9_AREA_TRIANGULO {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
       //double es el tipo real (para numero con parte decimal)
        double area;
        double base;
        double altura;
        
        System.out.println("Ingresa la altura del triangulo");
        altura = leer.nextDouble();
        System.out.println("Ingresa la base del triangulo");
        base = leer.nextDouble();
        area = base * altura / 2;
        System.out.println("El area del triangulo es igual a: " + area);
    }
}

