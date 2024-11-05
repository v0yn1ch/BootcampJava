package com.bootcamp.reto01;

import java.util.Random;
import java.util.Scanner;

public class Reto01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de participantes: ");
        int num = scanner.nextInt();
        int w = generador(num + 1);
        for (int i = 1; i <= num; i++) {
            if (i == w) {
                System.out.println("Usuario numero " + w + ", eres el ganador!");
                continue;
            }
            System.out.println("Usuario numero " + i);
        }
        }

    public static int generador(int max) {
        Random r = new Random();
        return r.nextInt(max);
    }
}
