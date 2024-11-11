package com.bank.model;

import com.bank.exceptions.FondosInsuficientesException;
import com.bank.logic.CuentaBancariaService;

public class BancoMain {
    public static void main(String[] args) {

        // Instanciar objetos de las dos clases
        CuentaBancaria cuentaArturo = new CuentaBancaria(2024111101L, "Arturo Peralta", 100d); // Usuaio existente
        CuentaBancaria cuentaJikme = new CuentaBancaria(2024111102L, "Jikme Lopez"); // Usuario nuevo

        // Instancia de la clase Service
        CuentaBancariaService cuentaService = new CuentaBancariaService();

        System.out.println(cuentaArturo);
        System.out.println(cuentaJikme);

        // Consultar saldo
        cuentaService.consultar(cuentaJikme);
        cuentaService.consultar(cuentaArturo);

        // Depositar dinero
        cuentaService.depositar(cuentaJikme, 50000);
        cuentaService.consultar(cuentaJikme);

        // Retirar dinero
        try {
            cuentaService.retirar(cuentaArturo, 100);
        } catch (FondosInsuficientesException e) {
            System.out.println("Saldo Insuficiente");
        }
        // Consultar a Arturo despues del retiro de dinero
        cuentaService.consultar(cuentaArturo);

        // Ingresar dinero a la cuentaArturo y mostrar el saldo
        cuentaService.depositar(cuentaArturo, 1000000);
        cuentaService.consultar(cuentaArturo);
    }
}
