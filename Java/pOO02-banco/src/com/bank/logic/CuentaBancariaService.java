package com.bank.logic;

import com.bank.exceptions.FondosInsuficientesException;
import com.bank.model.CuentaBancaria;

// Metodos que el objeto puede implementar (comportamiento)
public class CuentaBancariaService {

    // Consultar saldo
    public void consultar(CuentaBancaria cuenta) {
        System.out.println("Tu saldo es de: $" + cuenta.getSaldo());
    }

    // Depositar dinero
    public void depositar(CuentaBancaria cuenta, double monto) {
        double actualizarSaldo = cuenta.getSaldo() + monto;
        cuenta.setSaldo(actualizarSaldo);
        // cuenta.getSaldo(cuenta.getSaldo() + monto); 2da opcion
    }

    // Retirar dinero. Crear excepcion que me evalua si puedo retirar dinero segun mi saldo
    public void retirar(CuentaBancaria cuenta, double retiro) throws FondosInsuficientesException {
        if(retiro <= cuenta.getSaldo()) {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
        } else {
            throw new FondosInsuficientesException(cuenta.getSaldo());
        }
    }


}
