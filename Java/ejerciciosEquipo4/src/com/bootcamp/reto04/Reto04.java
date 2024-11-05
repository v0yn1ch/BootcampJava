package com.bootcamp.reto04;

import java.util.Scanner;

public class Reto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = Reto04.comprobacionInt(scanner.nextInt());
        System.out.print("Ingresa tu sueldo: ");
        double sueldo = Reto04.comprobacionDouble(scanner.nextDouble());
        System.out.print("La prima calculada es: $" + Reto04.calculo(edad, sueldo));
    }

    public static int comprobacionInt(int edad) {
            while (edad < 18 || edad > 80) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Edad no valida. Ingresa una edad valida: ");
                edad = scanner.nextInt();
        }
            return edad;
    }

    public static double comprobacionDouble(double sueldo){
            while (sueldo < 550) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Sueldo no valido. Ingresa un sueldo valido: ");
                sueldo = scanner.nextDouble();
            }
            return sueldo;
    }

    public static double calculo(int edad, double sueldo){
        double prima;
        if(edad >= 70 && sueldo >= 3000){
            prima = 500*1.10;
        }else if(edad >= 50 && edad < 70 && sueldo >= 3000){
            prima = 400*1.10;
        }else if (edad >= 30 && edad < 50 && sueldo >= 3000){
            prima = 250*1.10;
        }else if (edad < 30  && sueldo >= 3000) {
            prima = 100* 1.10;
        }else if(edad >= 70 && sueldo < 3000){
            prima = 500*1.05;
        }else if(edad >= 50 && edad < 70 && sueldo < 3000){
            prima = 400*1.05;
        }else if (edad >= 30 && edad < 50 && sueldo < 3000){
            prima = 250*1.05;
        }else if (edad < 30 && sueldo < 3000) {
            prima = 100* 1.05;
        }else{
            return 0;
        }
        return prima;
    }
}
