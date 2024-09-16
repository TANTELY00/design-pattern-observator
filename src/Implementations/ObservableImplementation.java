package Implementations;

import Interfaces.Observable;
import Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImplementation implements Observable {
    // POUR LA RELATION ONE TO MANY , ON DOIT CREER UN LISTE DES OBSERVATEURS
    private List<Observer> observers = new ArrayList<>();
    private int state = 30;
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update(this);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }

    public int getState() {
        return state;
    }
}
