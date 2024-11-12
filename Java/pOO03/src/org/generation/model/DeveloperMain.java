package org.generation.model;

import org.generation.services.EmployeeService;

public class DeveloperMain {
    public static void main(String[] args) {
        // Instanciar un developer
        Developer edgar = new Developer(20210322L, "Edgar Lee", 26344.11f, ProgrammingLanguages.JAVA, Level.MIDDLE);

        System.out.println(edgar);

        // Instanciar EmployeeService
        EmployeeService employeeService = new EmployeeService();

        employeeService.calcularSalario(edgar);

    }
}
