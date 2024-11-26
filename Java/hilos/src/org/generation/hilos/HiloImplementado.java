package org.generation.hilos;

// Podemos crear un subproceso (thread) a partir de la interface Runnable, es decir, la clase implementa Runnable.
// JVM permite que una aplicacion tenga multiples subprocesos ejecutandose simultaneamente
public class HiloImplementado implements Runnable {
    // Tenemos que sobreescribir el metodo run() para que el codigo pueda ejecutarse como un subproceso

    @Override
    public void run() {
        for(int i  = 0; i <= 20; i++){
            System.out.println("Segundo hilo" + i);
        }
    }


}