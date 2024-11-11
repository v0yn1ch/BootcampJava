package org.generation.letras;

import java.util.Scanner;

public class Letras {

    //Instanciar un objeto de tipo Scanner para recibir el texto del usuario
    Scanner sc = new Scanner(System.in);

    // Metodo para darle contexto al usuario, recibe un parametro String para mensajes personalizados
    public void contexto(String mensaje){
        System.out.println(mensaje);
    }

    // Metodo para retornar el Scanner y utilizarlo las veces que queramos en diferentes instancias
    public String leerTexto(){
        return sc.nextLine();
    }


}
