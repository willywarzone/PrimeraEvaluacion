package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosOperadoresRelacionales {
    public static void main(String[] args) {
        // Sirven para comparar dos numeros (normalmente) y dan como resultado un boolean

        int num1 = 35;
        int num2 = 23;

        num2 = num1; // Estoy asignando el num2 el valor de num1

        boolean comparacion= num2 == num1; // estoy comparando los valores de num1 y num2 y el resultado (true) lo asigno a comparacion

        boolean otraComparacion = num2 != num1;

        int nueve = 9;
        int otronueve = 9;
        int diez = 10;

        System.out.println(nueve > otronueve);
        System.out.println(nueve >= otronueve);

        int edad = 18;
        System.out.println("¿Mayor de edad? " + (edad >= 18));
        System.out.println("¿Mayor de edad? " + (edad > 17));

        // Cuando aparecen operadores mezclados de distintos tipos

        int num = 1000;
        boolean resultado = num + 10 > num + 9; // 1010 > 1009

        // Unir operaciones relacionales usando operadores logicos


         int a = 5;
         int b = 6;
         int c = 7;
         // quiero saner si a<= b <= c

        //System.out.println(a <= b <= c); // esto asi no se puede sino que hay que hacer la comparacion de dos en dos con un AND

        System.out.println(a <= b && b <= c);

        // Ejemplo: pedimos tres estaturas poor teclado y queremos ver si estan en orden ascendente
        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();

        boolean ordenAscendente = estatura1 <=  estatura2 && estatura2 <= estatura3;
        System.out.println("Orden ascendente: " + ordenAscendente);
        // Tambien comprobamos si estan en orden descendente

        boolean ordenDescendente = estatura1 >=  estatura2 && estatura2 >= estatura3;
        System.out.println("Orden descendente: " + ordenDescendente);



    }
}
