package EstructuraDeControl;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2 = sc.nextInt();

        // e indique si el primero es mayor, es igual o es menor que el segundo

        if (n1 > n2) {
            System.out.println("El primero es mayor que el segundo");
        } else if (n1 == n2) {
            System.out.println("Los dos primero numeros son iguales");
        } else {
            System.out.println("El primero es menor que el segundo");
        }






    }
}
