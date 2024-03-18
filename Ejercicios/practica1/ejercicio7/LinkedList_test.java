package Ejercicios.practica1.ejercicio7;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
b. Si en lugar de usar un ArrayList en el inciso anterior hubiera usado un LinkedList ¿Qué
diferencia encuentra respecto de la implementación? Justifique*/
public class LinkedList_test {
    public static void main(String[] args) {
        LinkedList<String> list = (LinkedList<String>) Arrays.asList(args);
        for (String s : list) {
            System.out.print("ELEMETO => " + s);
        }

    }

}
