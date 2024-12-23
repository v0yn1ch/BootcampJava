package org.generation.productos;

public class ProductoMain {

    public static void main(String[] args) {

        // Instanciar los objetos
        ProductoThread pedido01 = new ProductoThread("amz-552233xam", "iPhone16", 21499f);
        ProductoThread pedido02 = new ProductoThread("amz-943302jwa", "Guitarra Yamaha", 4999f);
        ProductoThread pedido03 = new ProductoThread("amz-210254xpe", "Reloj", 7899f);
        ProductoRun pedido04 = new ProductoRun("amz-119744bql", "Monitor HP", 3230f);
        ProductoRun pedido05 = new ProductoRun("amz-786640kgv", "Taza Navidad", 144f);
        ProductoRun pedido06 = new ProductoRun("amz-416530rsc", "Arbol Navidad", 988f);

        // Instanciar objetos de tipo Thread
        Thread hiloPedido01 = new Thread(pedido01);
        Thread hiloPedido02 = new Thread(pedido02);
        Thread hiloPedido03 = new Thread(pedido03);
        Thread hiloPedido04 = new Thread(pedido04);
        Thread hiloPedido05 = new Thread(pedido05);
        Thread hiloPedido06 = new Thread(pedido06);

        // Iniciar la ejecucion de los subprocesos mediante el metodo run()
        hiloPedido01.start();
        hiloPedido02.start();
        hiloPedido03.start();
        hiloPedido04.start();
        hiloPedido05.start();
        hiloPedido06.start();

    }

}
