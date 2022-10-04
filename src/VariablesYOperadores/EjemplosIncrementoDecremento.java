package VariablesYOperadores;

public class EjemplosIncrementoDecremento {
    public static void main(String[] args) {
        // De momento no le vamos a ver utilidad,
        // Pero es superutil cuando veamos bucles: for, white, do-while

        // Se utilizan cuando queremos que una variabe aumente o desminuyan
        // en una unidad

        int n = 10;
        System.out.println("1. " + n);
        // quiero aumentar una unidad
        n= n +1;
        System.out.println("2. " + n);
        // esto mismo lo podria haber hecho asi
        n++; // Incremento el valor de n en 1 - es lo mismo que n = n + 1
        System.out.println("3. " +n);
        // otra forma de escribir eso mismo es
        n +=1; // esta nomenclatura vale tambien para el producto (n *=1) etc...
        System.out.println("4. " +n);
        // y una opcion mas de escribir(pero no es exactamente igual)
        ++n;
        System.out.println("5. " +n);

        // lo mismo para el decremento
        // si quiero que la variable disminuya en 1 unidad puedo hacerlo de dos formas
        n = n -1;
        n--;
        n-= 1;
        --n;
        System.out.println("Decremento tras decremento... " + n);

        // Diferencia entre prefijo ++ a sufijo
        int a = 4;
        int b = a++; // primero asigna a al b
        System.out.println("b: " + b);
        System.out.println(b++);
        System.out.println(a);

        int c = 10;
        System.out.println("c++ " + c++);
        System.out.println("c: " + c);
        System.out.println("++c " + ++c);
    }
}
