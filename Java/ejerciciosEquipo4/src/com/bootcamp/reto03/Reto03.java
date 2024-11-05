package com.bootcamp.reto03;

import java.util.Random;
import java.util.Scanner;

public class Reto03 {
    public static void main(String[] args) {
        int lives = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int num = sc.nextInt();
        Random rand = new Random();
        int random = rand.nextInt(num);
        System.out.println(random);
        do {
            if (num < random) {
                System.out.println("El numero que buscas es mas grande");
                lives--;
            } else if (num > random) {
                System.out.println("El numero que buscas es mas chico");
                lives--;
            }else{
                System.out.print("Lo haz logrado! Encontraste el numero!");
            }
            num = sc.nextInt();
        }while (num != random);
    }

}
