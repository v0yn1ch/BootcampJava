# Bank

Programa que permite realizar operaciones bancarias basicas a partir de cuentas bancarias de nuevos usuarios y usuarios existentes.

> **Requerimientos**

1. Trabajar con el paradigma de Programacion Orientada a Objetos.
2. Aplicar encapsulamiento en clases Java.
3. Manejar excepciones.
4. Organizar el proyecto en paquetes
5. Recibir clientes nuevos (inician con saldo de $0).
6. Recibir clienes existentes (con cuenta bancaria previa).
7. Operaciones basicas
   - Consultar saldo
   - Retirar dinero
   - Ingresar dinero
   - Salir de la cuenta

*Clases Java*
1. Modelo de mi trabajo -> model -> CuentaBancaria.java
2. Logica del programa -> logic -> CuentaBancariaServive.java
3. Definir Excepciones -> exceptions -> FondosInsuficientesException.java
4. Main -> BancoMain.java