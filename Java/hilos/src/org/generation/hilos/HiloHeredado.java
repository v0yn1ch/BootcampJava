package org.generation.hilos;

// Podemos crear un subproceso (thread) a partir de la super clase Thread, es decir, la subclase hereda de Thread.
// JVM permite que una aplicacion tenga multiples subprocesos ejecutandose simultaneamente
public class HiloHeredado extends Thread {
    // Tenemos que sobreescribir el metodo run() para que el codigo pueda ejecutarse como un subproceso

    @Override
    public void run() {
        for(int i  = 0; i <= 20; i++){
            System.out.println("Primer hilo" + i);
        }
    }


}
