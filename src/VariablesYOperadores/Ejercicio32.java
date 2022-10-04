package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
//        32. Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor
//        que 0. El programa debe imprimir un booleano (true o false).
        Scanner sc = new Scanner(System.in);

         int valor = sc.nextInt();

         boolean menor10ymayor0 = valor < 10 && valor > 0;

        System.out.println(menor10ymayor0);
    }
}
