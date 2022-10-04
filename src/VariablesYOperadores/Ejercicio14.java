package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        // 14. Realiza un programa que calcule la longitud de una circunferencia de radio 3 metros.

        // Formula es: 2 + pi * r
        double radio = 3;

        // NEW: el numero pi lo podemos poner directamente como Math.PI

        double circuferencia = 2 * Math.PI + radio;

        System.out.println(circuferencia);

        // NEW PARA MOSTRAR UN NUMERO DE MUCHOS DECIMALES CON SOLO 2
        System.out.printf("La circuferencia es %.2f", circuferencia);




    }
}
