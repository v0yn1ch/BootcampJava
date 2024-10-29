package com.tipos;

public class Casting {
    public static void main(String[] args) {
        long numeroLargo = 100000000L;
        double isr = 17.92D;
        short numero = 1;
        int numeroInt = (int)numeroLargo;
        int doubleToInt = (int)isr;
        long shortToLong = (long)numero;
        double shortToDouble = (double)numero;

        System.out.println("Transforme un double a un int: " + doubleToInt);
        System.out.println("Transforme un long a un int: " + numeroInt);
        System.out.println("Transforme un short a un long: " + shortToLong);
        System.out.println("Transforme un short a un double: " + shortToDouble);
        double suma = isr + numeroInt;
    }
}
