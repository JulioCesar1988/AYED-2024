package Ejercicios.practica1;

import Ejercicios.practica1.ejercicio3.Estudiante;
import Ejercicios.practica1.ejercicio3.Profesor;

import java.util.ArrayList;

/*
3. Creación de instancias mediante el uso del operador new
a. Cree una clase llamada Estudiante con los atributos especificados abajo y sus
correspondientes métodos getters y setters (haga uso de las facilidades que brinda
eclipse)
● nombre
● apellido
● comision
● email
● direccion
b. Cree una clase llamada Profesor con los atributos especificados abajo y sus
correspondientes métodos getters y setters (haga uso de las facilidades que brinda
eclipse)
● nombre
● apellido
● email
● catedra
● facultad

c. Agregue un método de instancia llamado tusDatos() en la clase Estudiante y en la
clase Profesor, que retorne un String con los datos de los atributos de las mismas.
Para acceder a los valores de los atributos utilice los getters previamente
definidos.

d. Escriba una clase llamada Test con el método main, el cual cree un arreglo con 2
objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego recorra ambos
arreglos imprimiendo los valores obtenidos mediante el método tusDatos(). Recuerde
asignar los valores de los atributos de los objetos Estudiante y Profesor invocando los
respectivos métodos setters.

e. Agregue dos breakpoints, uno en la línea donde itera sobre los estudiantes y otro en la
línea donde itera sobre los profesores

f. Ejecute la clase Test en modo debug y avance paso a paso visualizando si el
estudiante o el profesor recuperado es lo esperado..*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("julio","contreras","4","j@gmail.com","Fcio Varela");
        Estudiante e2 = new Estudiante("julito","gomez","5","jg@gmail.com","La Plata");
        ArrayList<Estudiante> arregloEstudiantes = new ArrayList<>();
        arregloEstudiantes.add(e1);
        arregloEstudiantes.add(e2);

        Profesor p1  = new Profesor("gustavo","Rossi","r@gmail.com","Objetos 1","Facultad de Informatica");
        Profesor p2  = new Profesor("Florencia","Lara","f@gmail.com","Leyes 1","Facultad de Humanidades");
        Profesor p3  = new Profesor("Hector","Lopez","h@gmail.com","Construcciones","Facultad de Arquitectura");
        ArrayList<Profesor> arregloProfesores = new ArrayList<>();
        arregloProfesores.add(p1);
        arregloProfesores.add(p2);
        arregloProfesores.add(p3);

        for (int i = 0; i <arregloEstudiantes.size() ; i++) {
            System.out.println(arregloEstudiantes.get(i).toString());
        }
        for (int i = 0; i < arregloProfesores.size(); i++) {
            System.out.println(arregloProfesores.get(i).toString());
        }

    }

}
