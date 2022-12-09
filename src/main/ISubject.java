package main;

/**
 *
 * @author Usuario
 */


public interface ISubject {

    public void attach(ILibroMalEstado observador);

    public void dettach(ILibroMalEstado observador);

    public void notifyObservers();

}
