package org.generation.model;

// Un developer tambien es un empleado con nombre completo, numero de empleado, salario pero tambien recibe los atributos de lenguaje de programacion y nivel de dominio
public class Developer extends Employee{
    // Atributos
    ProgrammingLanguages language;
    Level level;

    // Constructor
    public Developer(Long id, String name, float salary, ProgrammingLanguages language, Level level) {
        super(id, name, salary);
        this.language = language;
        this.level = level;
    }

    //Getters y Setters
    public ProgrammingLanguages getLanguage() {
        return language;
    }
    public void setLanguage(ProgrammingLanguages language) {
        this.language = language;
    }
    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Developer: "  +
                "employeeId = " + employeeId +
                ", name = " + name + '\'' +
                ", salary = " + salary +
                ", language = " + language +
                ", level = " + level;
    }
}
