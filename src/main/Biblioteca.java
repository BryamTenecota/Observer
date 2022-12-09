package main;

/**
 *
 * @author Usuario
 */


public class Biblioteca {

    public void devuelveLibro(Libro libro) {
        if (libro.getEstadoLibro().equals("malo")) {
            AlarmaLibro al = new AlarmaLibro();
            al.notifyObservers();
        }
    }

}
