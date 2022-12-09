package main;

/**
 *
 * @author Usuario
 */


public class Main {

    public static void main(String... zhunIOS) {
        AlarmaLibro al = new AlarmaLibro();
        al.attach(new Compras());
        al.attach(new Administracion());
        al.attach(new Stock());
        
        Libro libro = new Libro();
        libro.setEstadoLibro("malo");
        
        Biblioteca b = new Biblioteca();
        b.devuelveLibro(libro);
        
    }
    
}
