package Ejercicios.practica1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio7 {
    /*    g. Considere que se aplica la siguiente función de forma recursiva. A partir de un número
        n positivo se obtiene una sucesión que termina en 1:
        Por ejemplo, para n= 6, se obtiene la siguiente sucesión:
        f(6) = 6/2 = 3
        f(3) = 3*3 + 1 = 10*/
    public static void recursionFuncion(Integer n) {
        if (n != 1) {
            if (n % 2 == 0) {
                // esPar
                System.out.println("IsPar -> " + n / 2);
                recursionFuncion(n / 2);
            } else {
                // esImpar
                System.out.println("IsImpar -> " + ((3 * n) + 1));
                recursionFuncion(3 * n + 1);
            }
        }
    }


    public static List<Integer> calcularSucesion (int n) {
        List<Integer> list = new ArrayList<>();
        recursionFuncionReturn(n,list);
        return  list;
    }

    public static  void recursionFuncionReturn(Integer n,List<Integer> list_aux){
        list_aux.add(n);
        if (n != 1) {
            if (n % 2 == 0) {
                // esPar
                // System.out.println("IsPar -> " + n/2);
                recursionFuncionReturn(n / 2,list_aux);
            } else {
                // esImpar
                // System.out.println("IsImpar -> "+ ((3*n) +1));
                recursionFuncionReturn(3 *n +1,list_aux);
            }
        }
    }

    public static void main(String[] args) {
       List<Integer> list =  calcularSucesion(6);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println("Value list => " +list.get(i));
        }

    }

}
