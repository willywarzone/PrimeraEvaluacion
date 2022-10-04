package EstructuraDeControl;

import java.util.Scanner;
import java.util.SortedMap;

public class EjemploIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dme tu edad: ");
        /*int edad = sc.nextInt();

        // si la edad es mayor que 100 es una persona con mucha experiencia
        // y si no, no hace nada

        if (edad > 100) {
            System.out.println("Eres una persona con mucha experiencia. ");
        }

        // El resultado de la condicion es boolean; podemos simplificar a veces , asi
        boolean semaforoAbierto = false;

        if (semaforoAbierto) { // es lo mismo que semaforoAbierto == true
            System.out.println("Adelante.");
        } else {
            System.out.println("Dentente");
        }

        // Vamos a ver si un numero es par o impar

        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        */

        int presupuesto = sc.nextInt();

        if (presupuesto < 100) {
            System.out.println("Esto no es para mi");
        } else if (presupuesto >= 100 && presupuesto < 200) {
            System.out.println("Me comprare el paquete basico.");
        } else if (presupuesto >= 200 && presupuesto < 300) {
        }
    }
}

