package com.operadores;
import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salary = 75984;
        double isr = 30D;
        double isDecimal = isr / 100;
        double descuentoISR = salary * isDecimal;
        System.out.println("El isr en decimal es: " + isDecimal);
        System.out.println("El descuento es: " + descuentoISR);
        double totalSalary = salary - descuentoISR;
        System.out.println("Tu salario despues del ISR es: " + totalSalary);
        float calificacion1 = 9f;
        float calificacion2 = 5f;
        float calificacion3 = 4.5f;
        float calificacion4 = 7f;

        float sumaCalificaciones = calificacion1 + calificacion2 + calificacion3 + calificacion4;
        System.out.println("La suma de calificaciones es: " + sumaCalificaciones);
        float promedio = sumaCalificaciones / 4;
        System.out.println("El promedio es: " + promedio);

        int parOImpar = 50;
        System.out.print("Ingresa un numero: ");
        int inputNumber = scan.nextInt();

        if (parOImpar % 2 == 0) {
            System.out.println("El numero: " + inputNumber + " es par.");
        } else {
            System.out.println("El numero: " + inputNumber + " es impar.");
        }
        scan.close();
    }
}
