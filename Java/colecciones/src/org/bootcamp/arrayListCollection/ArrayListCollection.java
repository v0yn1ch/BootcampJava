package org.bootcamp.arrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCollection {

    public static void main(String[] args) {
        //ArrayList
        //Podemos inicializar el ArrayList a partir de su clase para que dicha estructura de dato no cambie su tipo, o bien, si inicializamos desde el interface podemos mutarla a las diferentes estructuras que implementan dicha interface.

        ArrayList<String> peliculas = new ArrayList<String>(); //Creando ArrayList desde la propia clase
        List<Integer> edades =  new ArrayList<Integer>(); //Creando ArrayList desde la interface List
        ArrayList<Double> salarios = new ArrayList<>();

        //Agregar elementos al ArrayList (.add())
        peliculas.add("Interestelar");
        peliculas.add("Matrix");
        peliculas.add("Batman");
        peliculas.add("Señor de los anillos");
        peliculas.add("Terrifier");
        peliculas.add("The silence of the lambs");
        peliculas.add("No manches Frida");
        peliculas.add("Nacho Libre");
        peliculas.add("Cementerio de Mascotas");
        peliculas.add("LaLaLand");
        System.out.println(peliculas);

        //Acceder a elementos especificos del ArrayList .get(index);
        String peliculas03 = peliculas.get(2);
        System.out.println(peliculas03);

        //Modificar elemento del ArrayList .set(index, newValue);
        peliculas.set(7, "Toy Story");
        System.out.println(peliculas);

        //Conocer el tamaño del ArrayList
        int numElementos = peliculas.size();
        System.out.println(numElementos);

        //Acceder al ultimo elemento del ArrayList .size()-1
        String ultimaPelicula = peliculas.get(numElementos - 1);
        System.out.println(ultimaPelicula);

        //Eliminar un elemento mediante su indice .remove(index);
        peliculas.remove(6);
        System.out.println(peliculas);

        //Recorrer un ArrayList y mostrarlo en forma de lista
        for(var pelicula : peliculas) {
            System.out.println(pelicula);
        }

        //Ordenando el ArrayList utilizando el metodo .sort() de Collections
        Collections.sort(peliculas);
        System.out.println(peliculas);

        // Agregar múltiples elementos a un ArrayList
        salarios.addAll(Arrays.asList(25363.22, 12399.12, 48711.01));
        System.out.println(salarios);
    }
}
