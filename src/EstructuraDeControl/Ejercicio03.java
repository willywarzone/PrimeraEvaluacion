package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
//        3. Escribe un programa que pida dos números e indique si el primero es mayor que el
//        segundo o no.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primero es mayor (" + num1 + " > " + num2 + ")");
    } else {
        System.out.println("El primero no es mayor(" + num1 + " <= " + num2 + ")");
    }



    }
}
