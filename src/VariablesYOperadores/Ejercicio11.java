package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
//        11. Dado un número de dos cifras
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero de dos cifras: ");
        int numero = sc.nextInt();
//        , escribe un programa que permita obtener el número invertido.
//        Ejemplo, si se introduce 23 que muestre 32.

        // extraemos la decenas
        int decenas = numero / 10;
        int unidades = numero % 10;

        //lo mostramos al reves
        System.out.println(unidades + "" + decenas);

    }
}
