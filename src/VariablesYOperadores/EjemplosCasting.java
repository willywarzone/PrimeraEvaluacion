package VariablesYOperadores;

public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100; // int ocupa 32 bits
        long numGrande = num; // puedo asignar un int a long sin mas (costing implicito)

        // ¿y al reves?
        long numGrande2 = 101; // long ocupa 64 bits
        int entero = (int) numGrande2; // Esto es un casting explicito

        // int a short -> casting explicito
        short numeroCorto = (short) num; // no puedo hacerlo directamente porque int son 32 bits y no caben en 16 bits

        // de char a int

        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);

        // de float a double
        float decimal = 3.1416f;
        double decimalDoble = decimal;

        // de double a float
        double decimaDoble2 = 3000000000000000.14162232;
        float decimalF= (float) decimaDoble2;

        // de double a int
        int entero32bits = (int) decimaDoble2;
        System.out.println(entero32bits); // resultado imprevicible

        // de double a short
        short entero16bits = (short) decimaDoble2;
        System.out.println(entero16bits);

    }
}
