package com.bank.exceptions;

public class FondosInsuficientesException extends Exception {

    // Serie agregada por default ya que Exception implmenta la intergace Serializable
    private static final long serialVersionUID = 1L;

    // Atributos
    private double fondos;

    // Constructor
    public FondosInsuficientesException(double fondos) {
        this.fondos = fondos;
    }

    // Getters y Setters
    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }
}
