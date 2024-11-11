package org.generation.exceptions;

// Vamos a crear un metodo que me permita dividir 2 enteros. En esta clase creo metodo y las mando a llamar
public class ExcepcionAritmetica {
    // Metodo para dividir dos enteros
    static int division(int a, int b) {
        return a / b;
    }

    static float divisionDecimales(float a, float b) {
        return a / b;
    }

    public static void main (String[] args) {
        // Mandar a llamar los metodos
        System.out.println(division(50, 10));
        System.out.println(division(50, 7));
        System.out.println(divisionDecimales(50, 7));
//


        // Manejando Exceptions (try-catch)
        try{
            int resultado = division(20, 0);
            System.out.println("El resultado de la division es " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("\u001B[31mNo se puede dividir entre cero\u001B[32m");
        } finally {
            System.out.println("Programa finalizado\u001B[0m");
        }

        //Forzar la Exception
        // Al manejar excepciones no se detine el flujo del programa
        try{
            int resultado = division(40, 20);
            System.out.println("El resultado de la division es " + resultado);
        } catch(ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        }
    }
}
