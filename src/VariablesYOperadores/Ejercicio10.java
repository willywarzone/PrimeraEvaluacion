package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // 10. Dado un número de dos dígitos, imprime su primer número (las decenas).

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero de dos digitos: ");
        int num1 = sc.nextInt();

        // las decenas son el cociente
        System.out.println("Las decenas son: " + (num1 / 10));
        System.out.println("..... y las unidades, " + (num1 % 10));

    }
}
