package org.generation.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora =  new Calculadora();

    @Test
    @DisplayName("Prueba de suma")
    public void suma() {
        assertEquals(20, calculadora.sumar(10, 10));
    }

    @Test
    @DisplayName("Prueba de resta")
    public void resta() {
        assertEquals(20, calculadora.restar(50, 30));
    }

    @Test
    @DisplayName("Prueba de Multiplicacion")
    public void multiplicacion() {
        assertEquals(50, calculadora.multiplicar(10, 5));
    }

    @Test
    @DisplayName("Prueba de Division")
    public void division() {
        assertEquals(2, calculadora.dividir(20, 10));
    }

    @Test
    @DisplayName("Prueba Division entre 0")
    public void failsDueToUncaughtException() {
        calculadora.dividir(10, 0);
    }

}