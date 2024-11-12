package org.generation.model;

import org.generation.repository.EmployeeRepository;
import org.generation.services.EmployeeService;

public class EmployeeMain {
    public static void main(String[] args) {

        // Instanciar objetos
        Employee romina = new Employee(202411110022L, "Romina Loyda", 15232.22f);
        Employee gabriel = new Employee(202411110023L, "Gabriel", 12530.50f);
        EmployeeService service = new EmployeeService();
        System.out.println(romina);

        service.calcularSalario(romina);
        service.calcularSalario(gabriel);
        service.trabajar(romina);
        service.infoGeneral(gabriel);

        // Instanciando un objeto de tipo Employee a partir de la interface EmployeeRepository implementada en la clase Employee
        Employee karla = new Employee(20231004L, "Karla Espinoza", 18336.11f);
    }
}
