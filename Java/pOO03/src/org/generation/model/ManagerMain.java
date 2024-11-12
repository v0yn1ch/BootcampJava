package org.generation.model;

import org.generation.services.EmployeeService;
import org.generation.services.ManagerService;

public class ManagerMain {

    public static void main(String[] args) {
        // Instanciar Manager
        Manager neri = new Manager(20200123L, "Neri Gutierrez", 69355.22f, 8, 2300f);
        ManagerService service = new ManagerService();
        EmployeeService employeeService = new EmployeeService();

        System.out.println(neri);
        service.supervise(neri);
        service.calcularSalario(neri);
        employeeService.calcularSalario(neri);


    }
}
