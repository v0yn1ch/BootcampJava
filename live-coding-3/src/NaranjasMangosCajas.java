public class NaranjasMangosCajas {

        int naranjas;
        int mangos;

    public NaranjasMangosCajas(int naranjas, int mangos) {
        this.naranjas = naranjas;
        this.mangos = mangos;
    }

    public int calcularCajas(int a, int b){
        while(b !=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void imprimir (){
        int cajas = calcularCajas(mangos, naranjas);
        int mangosCajas = mangos/cajas;
        int naranjasCajas = naranjas/cajas;

        System.out.println("El numero de cajas es: " + cajas);
        System.out.println("El numero de mangos por caja es: " + mangosCajas);
        System.out.println("El numero de naranjas por caja es: " + naranjasCajas);
    }


}
