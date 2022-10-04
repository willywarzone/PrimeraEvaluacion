package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*9. Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
        transcurrido entre dos momentos del mismo día. Para ello, el programa ha de pedir
        por teclado seis números enteros: las horas, minutos y segundos para el momento
        inicial y lo mismo para el momento final. De momento vamos a considerar que los
        números introducidos van a estar en el rango adecuado y que el momento inicial
        introducido es menor (o igual) que el momento final. Por ejemplo, si se introducen
        los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
        el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
        el formato: hh:mm:ss.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Momento incial");
        System.out.println("==============");
        System.out.println("Introduce la hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int min1 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int seg1 = sc.nextInt();

        System.out.println("Momento final");
        System.out.println("=============");
        System.out.println("Introduce la hora: ");
        int hora2 = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int min2 = sc.nextInt();
        System.out.println("Introduce los segundos: ");
        int seg2 = sc.nextInt();

        System.out.println("Datos introducidos: Momento incial: " + hora1 + ":" + min1 + ":" + seg1 + " Momento final: " + hora2 + ":" + min2 + ":" + seg2);

        // pasamos a segundos el momento inicial
        int hora1ensegundos = hora1 * 60 * 60;
        int minuto1EnSegundos = min1 * 60;
        int momentoInicialSegundos = hora1ensegundos + minuto1EnSegundos + seg1;
        //System.out.println(momentoInicialSegundos); // muestra por pantalla si voy bien

        // pasamos a segundo el momento final
        int hora2ensegundos = hora2 * 60 * 60;
        int minuto2EnSegundos = min2 * 60;
        int momentoFinalSegundos = hora2ensegundos + minuto2EnSegundos + seg2;
        //System.out.println(momentoFinalSegundos); // muestra por pantalla si voy bien

        // Hallar la diferencia entre ambos
        int diferenciaEnSegundos = momentoFinalSegundos - momentoInicialSegundos;
        //System.out.println(diferenciaEnSegundos);
        //System.out.println(diferenciaEnSegundos / 60);
        //System.out.println(diferenciaEnSegundos % 60);

        // De esa diferencia (Que sera en segundos) extraer las horas, minutos y segundos
        // Extraigo los segundos
        int segundooDiferencia = diferenciaEnSegundos % 60;
        // Extraigo los minutos totales que tengo en esos segundos
        int minutosTotalesDiferencia = diferenciaEnSegundos / 60; // esta puede contener x horas
        // De esos minutos extraigo las horas
        int horaDiferencia = minutosTotalesDiferencia / 60;
        // El resto son los minutos que quedan
        int minutosDiferencia = minutosTotalesDiferencia % 60;

        // El programa debe mostrar por pantalla la diferencia en
        // el formato: hh:mm:ss
        System.out.println("La diferencia entre ambos momento sera " + horaDiferencia + ":" + minutosDiferencia + ":" + segundooDiferencia);



        System.out.println();

    }
}
