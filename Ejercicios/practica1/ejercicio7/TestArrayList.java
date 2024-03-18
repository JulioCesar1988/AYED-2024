package Ejercicios.practica1.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//a. Escriba una clase llamada TestArrayList cuyo método main recibe una secuencia de
//números, los agrega a una lista de tipo ArrayList, y luego de haber agregado todos los
//números a la lista, imprime el contenido de la misma iterando sobre cada elemento.
public class TestArrayList {
    public static void main(String[] args) {
        String[] array = args; // Convertir los argumentos en un array de Strings
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        for(Object s : arrayList){
            System.out.println("Elemento => " + s);
        }
    }
}
