package Elemetosbasicos;

import java.util.Scanner;

public class EjemploLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ahora ya podemos meter datos por teclado
        //Pero para poder utilizarlos despues en el programa
        //Tenemos que guardarlos en una variable
        //Las variables que guardan palabras o cadenas de texto se llaman string
        System.out.println("Introduce tu nombre:  ");
        String nombre = sc.nextLine(); // escribo el nombre en el teclado y la guarda en la variable
        System.out.println("Hola, " + nombre);
        //Creo otra variable para guardar el apellido que va a entrar por teclado
        System.out.println("Introduce tu apellido:  ");
        String apellido = sc.nextLine();
        System.out.println("Hola, " + nombre + " " + apellido);
        System.out.println("¿Cuantos años tienes:  ");
        int edad = sc.nextInt();
        /*
        Este metodo nexln() tiene un peligro: si a continuacion pones un nextLine() se salta.
        La manera de evitarla es: cada vez que yo escribo nextIn(), si que luego voy  a poner nextLine(),
        escribo un nextLine adicional, sin mas, de esta manera "Limpiamos el sc"
         */
        sc.nextLine();
        System.out.println("Vaya pareces muy joven para tener" + edad + " años ");
        System.out.println("¿Tienes mascota?");
        String mascota = sc.nextLine();
        System.out.println("Pues muy bien.");

        //Vamos a meter un dato con decimales
        System.out.println("¿Y cual es tu patrimonio?");
        double patrimonio = sc.nextDouble();
        System.out.println("¡" + patrimonio + "!");
        // Con los decimales:
        // Cuando lo escribimos en el codigo fuente: se pone .
        // Cuando lo escribimos los datos por el teclado: se pone ,


    }
}
