package VariablesYOperadores;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*15. Realiza un programa que calcule el área de una circunferencia de radio 5,2
        centímetros.*/

        // Formula: pi * radio al cuadrado

        double radio = 5.2;

        double area = Math.PI * Math.pow(radio, 2); // el metodo Math.pow sirve para calcular una potencia y funciona asi: Math.pow(base, exponente);
        //System.out.println(area); // con esto muestra todos los decimales
        System.out.printf("El area es %.2f", area);


    }
}
