package Elemetosbasicos;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        12. Escribe un programa que lea tres cadenas de texto y las muestre en orden
            inverso, cada una en una nueva línea.
         */
        Scanner sc = new Scanner(System.in);
        // leo
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();
        String cadena3 = sc.nextLine();

        System.out.println(cadena3);
        System.out.println(cadena2);
        System.out.println(cadena1);
    }
}
