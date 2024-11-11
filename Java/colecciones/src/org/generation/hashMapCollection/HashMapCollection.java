package org.generation.hashMapCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        //HashMap
        //Almacena datos en pares (key/value) y se puede acceder a ellos mediante index. No es ordenado y no permite datos duplicados
        HashMap<Long, String> estudiantes = new HashMap<>();

        //Agregar elementos (K/V) a mi HashMap .put();
        estudiantes.put(2024110601L, "Karla Espinoza");
        estudiantes.put(2024110602L, "Cesar Franco");
        estudiantes.put(2024110603L, "Erick Ortiz");
        estudiantes.put(2024110604L, "Luis Ramos");
        estudiantes.put(2024110605L, "Martha Huerta");
        System.out.println(estudiantes);

        //Recorrer un HashMap mediante forEach
        for(Map.Entry<Long, String>estudiante : estudiantes.entrySet()) {
            Long matricula = estudiante.getKey();
            String nombre = estudiante.getValue();
            System.out.println("Matricula: " + matricula + ", Estudiante: " + nombre);
        }
    }
}
