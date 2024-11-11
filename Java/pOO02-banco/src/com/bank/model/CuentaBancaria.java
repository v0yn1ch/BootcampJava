package com.bank.model;

public class CuentaBancaria {
    private Long idCuenta;
    private String titular;
    private Double saldo = 0.0;

    public CuentaBancaria(Long idCuenta, String titular, Double saldo) {
        // super(); Se utiliza para recibir un supercontructor de una superclase (herencia)
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Clientes nuevos (idCuenta, propietario, saldo = $0). Usando Overloading iniciamos otro constructor

    public CuentaBancaria(Long idCuenta, String titular) {
        this.idCuenta = idCuenta;
        this.titular = titular;
    }

    public Long getIdCuenta() {
        return idCuenta;
    }
    public void setIdCuenta(Long idCuenta) {
        this.idCuenta = idCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // Metodo toString();
    public String toString() {
        return "CuentaBancaria = idCuenta: " + idCuenta + ", titular: " + titular + ", saldo: $" + saldo;
    }


}
