package org.generation.hashSetCollection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
        //HashSet
        //Los HashSet son respaldados por las tablas hash dondde los elementos se recuperan mediante la optimizacion de la memoria. Por lo tanto, los elementos se muestran desordenados. No se muestran los elementos duplicados
        HashSet<String> animales = new HashSet<>();
        animales.addAll(Arrays.asList("capibara","conejo","leon","pinguino","ornitorrinco","capibara","wallabi","carcayu","cacatua","capibara"));
        System.out.println(animales);
        for(var animal : animales) {
            System.out.println(animal);
        }

        //Conocer si un elemento se encuentra dentro de la estructura de datos
        System.out.println(animales.contains("perro"));
        System.out.println(animales.contains("capibara"));

        //
    }
}
