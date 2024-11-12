import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el numero de naranjas: ");
        int n = s.nextInt();

        System.out.println("Ingresa el numero de mangos: ");
        int m = s.nextInt();

        NaranjasMangosCajas c = new NaranjasMangosCajas(n, m);
        c.imprimir();

        s.close();

    }
}
