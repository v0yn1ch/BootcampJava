import java.util.Scanner;

public class Codigo6 {
    public static void main(String[] args) { // Agregando main
        int[] n = new int[20]; // Arreglando declaracion de array
	    for (int i = 0; i < 20; i++) {
        n[i] = (int)(Math.random() * 381) + 20;
        System.out.print(n[i] + " "); // Agregando out
    }

	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("1 – los múltiplos de 5\n2 – los múltiplos de 7: ");
        Scanner sc = new Scanner(System.in); // Cambiando el Integer por Scanner
    int opcion = sc.nextInt();

    int multiplo = (opcion == 1) ? 5 : 7; // Corrigiendo operador ternario

    for(int e : n){ // Corrigiendo forEach
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            }else{
                    System.out.print(e + " ");
                }
            }
        }
    }

