package Ejercicios.practica1;

/* 5. Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio
en un único método.

Escriba tres métodos de clase, donde respectivamente:
a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return").
b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de
        tipo arreglo).
c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static List OpcionReturn(ArrayList<Integer> arrelgo) {
     // search  max , min promedio
       Integer max = Integer.MIN_VALUE;
       Integer min = Integer.MAX_VALUE;
       List lista = new ArrayList<>();
       Integer sum = 0;
        for (int i = 0; i < arrelgo.size(); i++) {
            if (arrelgo.get(i)> max){
                max = arrelgo.get(i);
            }
            if (arrelgo.get(i) < min){
                min = arrelgo.get(i);
            }
            sum = sum + arrelgo.get(i);
        }

        System.out.println("MAXIMO VALORE =>"+max );
        System.out.println("MINIMO VALOR => "+ min);
        System.out.println("PROMEDIO => "+ sum/arrelgo.size());

        lista.add(max);
        lista.add(min);
        lista.add(sum/arrelgo.size());

       return lista;

    }

    public static void OpcionSinReturn(ArrayList<Integer> arrelgo) {
        // search  max , min promedio
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        List lista = new ArrayList<>();
        Integer sum = 0;
        for (int i = 0; i < arrelgo.size(); i++) {
            if (arrelgo.get(i)> max){
                max = arrelgo.get(i);
            }
            if (arrelgo.get(i) < min){
                min = arrelgo.get(i);
            }
            sum = sum + arrelgo.get(i);
        }

        System.out.println("MAXIMO VALORE =>"+max );
        System.out.println("MINIMO VALOR => "+ min);
        System.out.println("PROMEDIO => "+ sum/arrelgo.size());

    }
    public static void main(String[] args) {
        ArrayList<Integer> arrelgo = new ArrayList<>();
        arrelgo.add(20);
        arrelgo.add(60);
        arrelgo.add(180);
        arrelgo.add(2);
        arrelgo.add(1988);
        List resultado = OpcionReturn(arrelgo);

    }

}
