package org.generation.employee;

// Esta clase es la plantilla de mi Objeto, donde se definen atributos y métodos pertenecientes al objeto. Así mismo, recibe métodos de tipo Constructor y métodos de Accesibilidad y Modificación.
public class Employee {
    //1. Definir atributos (variables de instancia)
    String nombre;
    String apellido;
    int edad;
    float salario;
    String puesto;

    //2. Método Constructor. Tiene que recibir el mismo nombre de la Clase, no retorna algo, recibe como parametros "argumento" a los atributos del objeto (¿siempre?) y estos se guardan en una variable de tipo "this"
    public Employee(String nombre, String apellido, int edad, float salario, String puesto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.puesto = puesto;
    }

    // 3. Métodos (compartamientos) del Objeto.
    public void trabajar() {
        System.out.println("Trabajo de 9 a 6");
    }

    public void calcularSalario() {
        System.out.println("El salario es de $" + this.salario);
    }

    public void infoGeneral() {
        System.out.println("Nombre: " + this.nombre + ", Apellido: " + this.apellido + ". Edad: " + this.edad + ". Puesto: " + this.puesto);
    }

// 4. Métodos de Accesibilidad (getters) y Modificación (setters).
// Atajo para generar Getters y Setter: click derecho -> Generate Getters y Setters -> Select fields (all) -> Generate
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String puesto){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String puesto){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getPuesto(){
        return puesto;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

//5. Metodo para mostrar los datos de las instancias de tipo String (to String): click derecho -> Source -> Generate toString() -> Generate
    @Override
    public String toString(){
        return "Employee [nombre=" + nombre + ", apellido=" + ", edad=" + edad + ", salario=" + salario + ", puesto=" + puesto + "]";
    }
}


