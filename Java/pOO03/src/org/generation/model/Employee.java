package org.generation.model;

import org.generation.repository.EmployeeRepository;

public class Employee {

    // Variables de Instancia
    Long employeeId;
    String name;
    float salary;

    // Constructor
    public Employee(Long employeeId, String name, float salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getters y Setters
    public Long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: employeeId = " + employeeId + ", name = " + name + ", salary = " + salary;
    }
}
