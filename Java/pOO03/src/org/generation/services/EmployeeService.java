package org.generation.services;

import org.generation.model.Employee;
import org.generation.repository.EmployeeRepository;

// Vive la logica de mi modelo
// Al implementar la interface, la clase se convierte en una clase abstracta
public class EmployeeService {

    // Metodo para mostrar una accion
    public void trabajar(Employee employee){
        System.out.println(employee.getName() + " se encuentra trabajando");
    }

    // Metodo para calcular el salario
    public void calcularSalario(Employee employee){
        System.out.println("El salario de " + employee.getName() + " es de $" + employee.getSalary());
    }

    // Metodo para mostrar informacion general
    public void infoGeneral(Employee employee){
        System.out.println("Nombre: " + employee.getName() + ". Numero de empleado: " + employee.getEmployeeId() + ". Salario: " + employee.getSalary());
    }

}
