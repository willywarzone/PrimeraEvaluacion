package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*4. Escribir un programa en el cual se piden cuatro números y se calcule e imprima la
        suma de los dos primeros y el producto del tercero y el cuarto.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Tercer numero: ");
        int num3 = sc.nextInt();
        System.out.print("Cuarto numero: ");
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num3 + " * " + num4 + " = " + producto);
    }
}
