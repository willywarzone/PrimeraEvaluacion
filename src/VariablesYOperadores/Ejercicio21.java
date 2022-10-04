package VariablesYOperadores;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
//        21. Realiza un programa que pida las notas de las tres evaluaciones del módulo Programación
//        y muestre la nota final (la nota final es la media de las tres
//        evaluaciones).
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1 evalucacion: ");
        double n1 = sc.nextDouble();
        System.out.println("Nota 2 evalucacion: ");
        double n2 = sc.nextDouble();
        System.out.println("Nota 3 evalucacion: ");
        double n3 = sc.nextDouble();

        double suma = n1 + n2 + n3;
        double media = suma / 3;

        System.out.printf("La nota final es de %.2f", media);
    }
}
