package Elemetosbasicos;

public class Variables {
    public static void main(String[] args) {
        //Variables
        int a; // Declaro la variable a (a partir de ahora hay un trocito que se llama a)
        // Por favor, las variables se declaran en minuscula
        a = 5; //y a continuacion guardo en ella el valor 5
        // su valor puede ser notificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + a);
        // Reglas para nombrar varibles
        //int 5c = 4; --> no compila
        // Puede contener cualquier letra o digito
        int c58 = 2;
        //No se puede contener ningun caracter especial (signos de puntuacion, . . .)
        int _variable = 3;
        int $otraVariable = 4;
        //No puede contener espacios
        //int otra variable; --> no compila

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("==================");
        System.out.println("Las varibales se declaran poniendo 1' el tipo de variable que es 2' el nombre que le damos a la varible");
        System.out.println("Variables para numeros enteros: byte, short, ");
        System.out.println("byte");
        byte variableBytePos = 127; //es el numero mas grande que puedo guardar en una varibale de tipo byte
        byte variableByteNeg = -128; //es el numero mas pequeño que puedo guardar en una variable byte
        System.out.println("variableBytePos = " + variableBytePos);
        System.out.println("variableBytePos = " + variableByteNeg);
        System.out.println("Numeros con decimaes: float o double");
        double decimal = 3.14;
        double numero = 3;
        System.out.println(numero);
        float otroDecimal = 8.43f; // si declaras una variable de tipo floot ponemos una
    }
}
