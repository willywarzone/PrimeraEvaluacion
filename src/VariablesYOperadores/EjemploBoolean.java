package VariablesYOperadores;

public class EjemploBoolean {
    public static void main(String[] args) {
        boolean apto = false;
        System.out.println("¿Es apto? " + apto);

        // Operadores logicos
        // Usuario: ! NOT

        System.out.println(!apto);

        // Operadores binarios: se utilizan con 2 variables
        // AND y
        System.out.println("AND");
        System.out.println("===");
        boolean v1 = true;
        boolean v2 = true;
        boolean and = v1 && v2;
        System.out.println(and);

        // OR o ||
        System.out.println("OR");
        boolean or = v1 || v2;
        System.out.println(or);

        // XOR (o exclusivo)
        System.out.println("XOR");
        boolean xor = v1 ^ v2;
        System.out.println(xor);

        boolean frío = false; // no hace frío
        boolean seco = true; // hace tiempo seco
        boolean verano = false; // no estamos en verano
        boolean trekking = seco && (!frío || verano); // ¡true, nos vamos de trekking!

        

    }
}
