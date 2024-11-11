package org.generation.arrays;

import java.util.Arrays;

public class ArraysJava {
    public static void main(String[] args) {
        //Arrays
        String[] nombres = {"Jorge", "Paulina", "Orlando", "Romina"};
        int[] edades = {25, 22, 31, 26, 22};
        double[] salarios = {14231.22, 51698.00, 8766.44, 31455.88};

        //Creando un Array (manera 2)
        char[] simbolos = new char[3];
        simbolos[0] = '@';
        simbolos[1] = '.';
        simbolos[2] = '?';
        //simbolos[3] = '!'; Este nos marcaria una exception

        //Imprimir Arrays: Debemos implementar el metodo to String para mostrar los elementos y no el espacio en memoria
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(salarios));
        System.out.println(Arrays.toString(simbolos));

        //Acceder a elementos del Array
        String nombre1 = nombres[0];
        System.out.println(nombre1);

        //Longitud del Array
        System.out.println(simbolos.length);

        //Mostrar todos los elementos del Array en forma de lista
        for (var nombre : nombres) {
            System.out.println(nombre);
        }
    }
}