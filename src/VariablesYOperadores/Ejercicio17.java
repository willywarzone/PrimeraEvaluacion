package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // 17. Calcular el área de un triangulo ( base * altura)/2.
        Scanner sc= new Scanner (System.in);
        System.out.println("Base: ");
        double base = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        // Resuelve el ejercicio primero con
        // variables de tipo entero y después con variables de tipo float. ---> pasamos por que no es correcto hacerlo asi
        // Calculamos
        double area = (base * altura)/2;
        // Mostramos el resultado
        System.out.println("Area: " + area);

    }
}
