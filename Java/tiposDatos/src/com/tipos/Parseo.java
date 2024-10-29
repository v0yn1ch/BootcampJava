package com.tipos;

public class Parseo {
    public static void main(String[] args) {
        String fecha = "28/10/2024";
        String id = "1212321";
        boolean isValid = true;
        int edad = 30;
        boolean isInvalid =false;

        int idNumero = Integer.parseInt(id);
        int fechaNumero = Integer.parseInt(fecha);
        String booleanText = String.valueOf(isValid);
        System.out.println("Convertir un string a un int: " + idNumero);
        System.out.println("Convertir un boolean a un String: " + booleanText);
        System.out.println(Boolean.parseBoolean("abcd"));
    }
}
