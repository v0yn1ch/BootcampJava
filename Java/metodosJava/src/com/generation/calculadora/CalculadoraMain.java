package com.generation.calculadora;

public class CalculadoraMain {
    public static void main(String[] args) {


        Calculadora calculadora01 = new Calculadora();
        Calculadora calculadora02 = new Calculadora();

        System.out.println(calculadora01.sumar(10,20));
        System.out.println(calculadora02.restar(50,20));
    }

}
