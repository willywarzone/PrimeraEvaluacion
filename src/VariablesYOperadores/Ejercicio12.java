package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
//        12. Escribe un programa que lea un número de tres cifras
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

//        y muestre el número invertido.
//                Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
//        introducimos 976, el programa debe mostrar 679.

        int centenas = numero / 100;
        int auxiliar = numero % 100; // en este resto estan decenas y unidades
        int decenas = auxiliar / 10;
        int unidades = auxiliar % 10;
        System.out.println(unidades + "" + decenas + "" + centenas); // los "" es para que no los sume
    }
}
