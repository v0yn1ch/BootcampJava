package com.bootcamp.reto02;

import java.util.Scanner;

public class Reto02 {
    public static void main(String[] args) {
        if(Reto02.verificarPalabras()){
            System.out.println("Es un palindromo!");
        }else{
            System.out.println("No es un palindromo");
        }
    }

    public static boolean verificarPalabras() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        String invertido;
        palabra = palabra.replaceAll("[\\W]", "").toLowerCase();
        invertido = palabra;
        invertido = new StringBuilder(invertido).reverse().toString();
        return palabra.equals(invertido);
    }
}
