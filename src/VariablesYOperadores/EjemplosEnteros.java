package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosEnteros {
    public static void main(String[] args) {
        //Pedir por teclado dos numeros y guardarlos en dos variables de tipo entero
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = sc.nextInt();

        // Mostrar el resultado de cada operacion
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2; // OJO: es el cociente de la division entera
        int resto = num1 % num2;

        // Mostrar el resultado de cada operacion
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + producto);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println(num1 + " % " + num2 + " = " + resto);


    }
}
