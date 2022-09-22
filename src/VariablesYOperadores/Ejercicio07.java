package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
        cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
        minutos.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Minutos: ");
        int M = sc.nextInt();

        int cociente = M / 60;
        int resto = M % 60;

        System.out.println(" son " + cociente + " y " + resto + " minutos");

    }
}
