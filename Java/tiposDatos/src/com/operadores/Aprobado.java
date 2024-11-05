package com.operadores;

import java.util.Scanner;

public class Aprobado {
    /*
    * 1. Importar e instanciar un scanner
    * 2. El usuario va a ingresar float
    * 3. Sumarlo y guardarlos en una variable
    * 4. Se va a repetir 3 veces y vamos a usar un for
    * 5. Promediar la suma
    * 6. Condicional
    *   6.1. Calificacion < 5 reprobado
    *   6.2. Si calificacion es >= 6 && <=7 panzaste
    *   6.3. Si calificacion >= 8 && <= 9  eres todo un hacker
    *   6.4. Si calificacion == 10 eres todo un einstein
    * */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float cal = 0f;
        float promedio;
        int intentos = 1;
        for (int i = 1; i <= 3; i++){
            System.out.print("Ingresa tu calificacion numero " + i + ": ");
            float calEvaluada = Aprobado.calificacionValida(scan.nextFloat());
            if(calEvaluada == -1){
                System.out.println("Calificacion invalida, volver a ingresar");
                System.out.println("Te quedan " + (5 - intentos) + " intentos");
                i--;
                intentos++;
                if(intentos == 6){
                    System.out.println("Muchos intentos fallidos, terminando el programa");
                    break;
                }
                continue;
            }else{
                cal += calEvaluada;
            }
        }
        promedio = cal / 3;
        if (promedio == 0) {
            System.out.println("No se pudo calcular el promedio");
        }else {
            System.out.println(Aprobado.evaluacionPromedio(promedio));
        }
    }

    public static float calificacionValida(float cal){
        if(cal < 0 || cal > 10){
            return -1.0f;
        }
        return cal;
    }

    public static String evaluacionPromedio(float promedio){
        if(promedio < 6){
            return "Reprobaste con: " + promedio;
        }else if (promedio >= 6 && promedio <= 7){
            return "Panzaste con: " + promedio;
        }else if (promedio >= 8 && promedio <= 9){
            return "Bien hecho, pasaste con: " + promedio + ". Eres todo un hacker!";
        }else if(promedio == 10){
            return "Felicidades! pasaste con: " + promedio + ". Eres todo un Einstein";
        }else{
            return "Tu calificacion no exite. Hiciste trampa";
        }
    }

}
