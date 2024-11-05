package com.bootcamp.metodosJava;

public class MetodosJava {

    // Metodo que retorna. Debo declarar el tipo de dato y los argumentos a utilizar.
    public static int sumar(int a, int b){
        return a+b;
    }

    /*public static Object informacion(String name, int edad){
        return name + " " + edad;
    }*/

    public static Object infoPersonal(String nombre, double salario){
        return nombre + " $" + salario;
    }

    public static void asteriscos(){
        System.out.println("***********************************");
    }

    //Metodo Main
    public static void main(String[] args) {
        System.out.println(MetodosJava.sumar(2,2));
        System.out.println(sumar(2,2));
        //System.out.println(informacion("Arturo", 26));
        System.out.println(infoPersonal("Arturo", 20000));
        asteriscos();
    }
}
