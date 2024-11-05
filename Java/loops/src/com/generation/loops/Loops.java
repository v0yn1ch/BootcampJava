package com.generation.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // 1. Crear un programa que realice una cuenta de 1 a n, donde n es el numero que el usuario proporciona
        System.out.print("Ingresa hasta que numero llega el contador: ");
        Scanner scanner = new Scanner(System.in);
        int numInicial = 1;
        int n = scanner.nextInt();
        while (numInicial <= n) {
            System.out.println(numInicial);
            numInicial++;
        }

        // 2.
        int w = getRandomInt(1, 21);
        for (int i = 1; i <= 20; i++) {
            if (i == w) {
                System.out.println("Cliente numero " + w + ", eres el ganador!");
                continue;
            }
            System.out.println("Cliente numero " + i);
        }

        // 3.
        System.out.print("Ingresa el radio de la circunferencia: ");
        float radio = scanner.nextFloat();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de la circunferencia es: " + area);

        // 4. Crear un programa que solicite al usuario un numero entre 1 y 999 para determinar cuantos digitos tiene dicho numero. El programa se ejecuta ciclicamente hasta que el usuario escribe 0
        int numero;
        do{
            System.out.print("Ingresa un numero para ver cuantos digitos tiene: ");
            numero = scanner.nextInt();
            String numTransform = Integer.toString(numero);
            System.out.println("El numero tiene " + numTransform.length() + " digitos");
        } while(numero != 0);

    }

    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
