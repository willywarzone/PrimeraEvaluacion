package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*6. N ardillas encuentran X nueces y deciden dividirlas equitativamente. Escribe un
        programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
        cuántas sobrarán tras el reparto.*/

        // Pedimos el número
        Scanner sc = new Scanner(System.in);

        System.out.print("'N' de ardillas: ");
        int N = sc.nextInt();
        System.out.print("'K' numeros de nueces: ");
        int K = sc.nextInt();

        //Las dividimos (division entera)
        int cociente = K / N; // son las nueces que corresponden a cada ardilla
        int resto = K % N; // son los que sobran

        //Mostramos el resultado
        System.out.println("Tocan a " + cociente + " nueces por ardilla y" + "sobran " + resto + "nueces.");
    }
}
