package org.generation.services;

import org.generation.model.Employee;
import org.generation.model.Manager;

public class ManagerService extends EmployeeService{

    // Metodo unico de Manager para supervisar subordinados
    public void supervise(Manager manager){
        System.out.println(manager.getName() + " esta supervisando " + manager.getSubordinate() + " colaboradores");

    }

    // Polimorfismo en el metodo calcularSalario();
    // Anulacion de metodos  (Overriding), debemos tener la misma firma. Es decir, mismo tipo de metodo, mismo nombre, mismos parametros pero diferente cuerpo.
    @Override
    public void calcularSalario(Employee empleado){
        // Determinar si el empleado (Employee) es una instancia de Manager. Si es true, calcular el salario sumando el bono.
        if(empleado instanceof Manager){
            // Necesito realizar un casteo explicito para convertir un Employee en Manager (Employee -> Manager)
            Manager manager = (Manager) empleado;
            float managerSalary = manager.getSalary() + manager.getBonus();
            System.out.println(manager.getName() + " recibe un salario de $" + managerSalary);
        }

    }


 //Sobrecarga de metodos (Overloading), debemos tener diferente firma. Es decir, mismo tipo de metodos, mismo nombre, diferentes parametros
     /*   public void salaryCalc(Manager manager){
        float managerSalary = manager.getSalary() + manager.getBonus();
        System.out.println(manager.getName() + " recibe un salario de " + managerSalary);
    }
*/


}
