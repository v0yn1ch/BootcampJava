package com.bootcamp.metodosJava;

import java.util.Scanner;

public class ClassString {
    public static void main(String[] args) {
        String mensaje = "Hoy es jueves y mañana es puente";
        String festividades = new String("Mañana se celebra dia de muertos");
        String puenteFestivo = new String("Mañana se celebra el dia de muertos");

        System.out.println(mensaje + " y " + festividades);

        System.out.println("La longitud de mi String es de " + mensaje.length() + " caracteres");

        System.out.println("Devolvemos el caracter al que apunta el indice proporcionado, aqui es el caracter" + festividades + " que se encuentra en el indice");
    System.out.println("Comparando 2 Strings y el resultado es " + festividades.equals(puenteFestivo));
    System.out.println("Convirtiendo String a mayuscula " + puenteFestivo.toUpperCase());
        System.out.println("Convirtiendo String a mayuscula " + puenteFestivo.toLowerCase());
        System.out.println("Si queremos reemplazar un caracter de un String con otro usamos replace, por ejemplo: " + mensaje.replace('e', '3'));


        //System.out.println(prueba);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();
        sc.close();

        //Solucion 1: Iterar sobre el String y transformarlo en caracteres
        for(int i = 0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
        }
        System.out.println("\tSolucion2");

        //Solucion 2: Aplicar un ciclo for-Each al String convertido en un Array de caracteres
        for(char caracter : texto.toCharArray()){
            System.out.println(caracter);
        }

        System.out.println("\tSolucion3");

        //Solucion 3: Utilizando 'var', permite inferir automaticamente el tipo de dato de la variable
        for(var caracter : texto.toCharArray()){
            System.out.println(caracter);
        }
    }
}
