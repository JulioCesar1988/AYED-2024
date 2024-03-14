package Ejercicios.practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2. Escriba un método de clase que dado un número n devuelva un nuevo arreglo de tamaño n
con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {n*k donde k : 1..k}
Agregue al programa la posibilidad de probar con distintos valores de n ingresandolos por
teclado, mediante el uso de System.in. La clase Scanner permite leer de forma sencilla
valores de entrada..*/
public class Ejercicio2 {
    public static List<Integer> procesar(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i*n);
        }
    return list;
    }


    public static void main(String[] args) {
        int n = 5;
       // List<Integer> list = procesar(n);
            System.out.println("INGRESE NUEMEROS DISTINTOS A 42 ");
            Scanner s = new Scanner(System.in) ;
            int cantidad = 1 ;
            while (s.nextInt() != 42) {

                cantidad++;
            }



    }


}
