package Ejercicios.practica1;
/*
1. Escriba tres métodos de clase (static) que reciban por parámetro dos números enteros (tipo
int) a y b e impriman todos los números enteros comprendidos entre a; b (inclusive), uno por
cada línea en la salida estándar. Para ello, dentro de una nueva clase escriba un método por
cada uno de los siguientes incisos:
a. Que realice lo pedido con un for.
b. Que realice lo pedido con un while.
c. Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do
                                                                                 while).
        Por último, escriba en el método de clase main el llamado a cada uno de los métodos
creados, con valores de ejemplo. En su computadora, ejecute el programa y verifique
que se cumple con lo pedido.*/
public class Ejercicio1 {
    public static void conFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println("Secuencia => " + i);
        }
    }

    public static void conWhile(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println("Secuencia => " + i);
            i++;
        }
    }

    public static void conRecursion(int a, int b) {
        if (a <= b) {
            System.out.println("Secuencia => " + a);
            conRecursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        //conFor(a,b);
        //conWhile(a,b);
        conRecursion(a, b);
    }


}
