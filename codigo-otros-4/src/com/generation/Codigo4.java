package com.generation;

import java.util.Scanner; // Importar Scanner

public class Codigo4 {
    public static void main(String[] args) { // Agregar main
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1;
        do {
            j1 = s.nextLine().toLowerCase();
        } while (!j1.equals("piedra")&& !j1.equals("papel") && !j1.equals("tijeras"));

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // Cambiando numero del jugador
//    Scanner s2 = new Scanner(System.in); no se necesita este scanner
        String j2 = s.nextLine().toLowerCase();
        if (j1.equals(j2)) { //En todas las comparaciones de string usamos equals
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        break; // En este caso no se necesita igualar a 1 porque no ganaria el jugador 1, por lo que se usa break para que el valor de g sea 2
                    }

                case "tijeras": // Agregando s a la palabra
                    if (j2.equals("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    System.out.println("Error: El jugador 1 ingresó una opción inválida.");
                    s.close();
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close(); // Cerrar scanner
    }
}