package org.generation.model;

public class Manager extends Employee {

    // Atributos
    private int subordinate;
    private float bonus;

    // Constructor
    public Manager(Long employeeId, String name, float salary, int subordinate, float bonus) {
        super(employeeId, name, salary);
        this.subordinate = subordinate;
        this.bonus = bonus;
    }

    // Getters y Setters
    public int getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(int subordinate) {
        this.subordinate = subordinate;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    //toString()
    @Override
    public String toString() {
        return "Manager: " +
                "subordinate=" + subordinate +
                ", bonus=" + bonus +
                ", employeeId=" + employeeId +
                ", name='" + name +
                ", salary=" + salary;
    }
}
