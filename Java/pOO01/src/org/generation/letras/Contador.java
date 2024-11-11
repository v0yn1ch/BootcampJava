package org.generation.letras;

// Logica del programador
// Grupo 1 -> Metodos para determinar si el texto proporcionado contiene o no los caracteres especificos
// Grupo 2 -> Metodos en int para realizar el conteo de cada tipo de caracter

public class Contador {
    // Grupo 1

    // Vocales
    public boolean esVocal(char caracter){
        return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter ==
                'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');
    }

    public int contarVocales(String texto) {
        int vocales = 0;
        for (char caracter : texto.toCharArray()) {
            if (esVocal(caracter)) {
                vocales++;
            }
        }
        return vocales;
    }

    // Consonantes. Se sigue recibiendo un parametro de tipo char. Sin embargo, hay que evaluarlo con base en la tabla ASCII, por lo tanto, hay que realizar un casteo a tipo short
    public boolean esConsonante(char caracter){
        // Casteo de caracteres a short
        short codigoAscii = (short) caracter;
        return (((codigoAscii >= 65 && codigoAscii <= 90) || (codigoAscii >=97 && codigoAscii <= 122)) && !esVocal(caracter));
    }

    public int contarConsonantes(String texto) {
        int consonantes = 0;
        for (char caracter : texto.toCharArray()) {
            if (esConsonante(caracter)) {
                consonantes++;
            }
        }
        return consonantes;
    }


    // Numeros
    public boolean esNumero(char caracter){
        short codigoAscii = (short) caracter;
        return (codigoAscii >= 48 && codigoAscii <= 57);
    }

    public int contarNumeros(String texto) {
        int numeros = 0;
        for (char caracter : texto.toCharArray()) {
            if (esNumero(caracter)) {
                numeros++;
            }
        }
        return numeros;
    }

    // Simbolos
    public boolean esSimbolo(char caracter){
        return !(esVocal(caracter) || esConsonante(caracter) || esNumero(caracter));
    }

    public int contarSimbolos(String texto) {
        int simbolos = 0;
        for (char caracter : texto.toCharArray()) {
            if (esSimbolo(caracter)) {
                simbolos++;
            }
        }
        return simbolos;
    }
}
