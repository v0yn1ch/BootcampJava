package com.generation.controlDeFlujo;

import java.util.Scanner;

public class ControlDeFlujo {
    public static void main(String[] args) {
        System.out.print("Ingresa tu edad: ");
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }

        System.out.println("Ingresa un numero del 1 al 7 y te mostramos el dia de la semana que corresponde");
        byte numeroDia = scanner.nextByte();

        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El numero de dia no es valido.");
                break;
        }

        int precio = 1599;
        double descuento = (precio > 2000) ? precio*0.1 : precio*0.05;
        System.out.println("El descuento del producto es: " + descuento);

        boolean activo = true;
        String mensaje = activo ? "Activo" : "Inactivo";
        System.out.println(mensaje);

        scanner.close();
    }
}
