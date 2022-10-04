package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

       //16. Realiza un programa que pida el lado de un cuadrado,
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado");
        double lado = sc.nextDouble();


        // calcular el parimetro(El perimetro de un cuadrado se calcula multiplicar el valor del cuadrado
        double perimetro = lado * 4;
        // y muestre por pantalla el
        //perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor
        // del lado por cuatro).
        System.out.println("Perimetro: " + perimetro);

    }
}
