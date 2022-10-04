package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        n3 -= 1; // porque no lo puedo tener dentro del sout
        n4 --; // no lo pongo dentro del sout por que me imprimiria primero antes de incrementarse
        System.out.println((n1 - 1) + " " + --n2 + " " + n3 + " " + n4);
    }
}
