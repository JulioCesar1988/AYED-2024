package Ejercicios.practica1;
/*6. Análisis de las estructuras de listas provistas por la API de Java.
        a. ¿En qué casos ArrayList ofrece un mejor rendimiento que LinkedList?
        b. ¿Cuándo LinkedList puede ser más eficiente que ArrayList?
        c. ¿Qué diferencia encuentra en el uso de la memoria en ArrayList y LinkedList?
        d. ¿En qué casos sería preferible usar un ArrayList o un LinkedList?*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio6 {
/*
    ArrayList y LinkedList son dos implementaciones comunes de la interfaz List en Java, pero difieren en la forma en que almacenan y acceden a los elementos.

            ArrayList:

    Almacena elementos en un array dinámico.
    Ofrece acceso rápido a elementos mediante índices.
    Ideal para acceso aleatorio y lectura secuencial de elementos.
    Tiene mejor rendimiento en operaciones de búsqueda y acceso aleatorio debido a que acceder a un elemento por índice es de complejidad O(1).
    Aumenta automáticamente su tamaño cuando es necesario, aunque esto puede resultar en una sobrecarga de rendimiento ocasional al tener que redimensionar el array interno.
            LinkedList:

    Almacena elementos en nodos enlazados.
    Ofrece un mejor rendimiento en la inserción y eliminación de elementos en el medio de la lista, ya que no requiere desplazamiento de elementos como en ArrayList.
    Ideal para manipulaciones frecuentes de la estructura de la lista (inserción, eliminación) en cualquier posición.
    Tiene un rendimiento más pobre en acceso aleatorio, ya que para acceder a un elemento se requiere un recorrido desde el inicio o el final de la lista, lo que tiene complejidad O(n).
    En resumen, ArrayList ofrece un mejor rendimiento en operaciones de búsqueda y acceso aleatorio, mientras que LinkedList es más eficiente en inserciones y eliminaciones en el medio de la lista. Por lo tanto, si la aplicación requiere principalmente acceso aleatorio a elementos o lectura secuencial, ArrayList sería preferible. Por otro lado, si la aplicación implica una gran cantidad de inserciones y eliminaciones en el medio de la lista, LinkedList podría ser más adecuado.*/
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        LinkedList<Integer> arr = new LinkedList<>();


    }

}
