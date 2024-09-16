package Interfaces;

public interface Observable {

    public void subscribe(Observer observer); // POUR CREER UN NOUVEAU OBSERVATEUR
    public void unsubscribe(Observer observer); // POUR SUPPRIMER UN OBSERVATEUR
    public void notifyObserver(); // POUR NOTIFIER UN OBSERVATEUR
}
