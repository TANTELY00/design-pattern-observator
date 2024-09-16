package Implementations;

import Interfaces.Observable;
import Interfaces.Observer;

public class ObserverImplementation1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImplementation)observable).getState();
        System.out.println("*** ObserverImplementation1 ***");
        System.out.println("nouvel état : "+state);
        int resultat = state*state+10;
        System.out.println("changement d'état : "+resultat);
        System.out.println("***********************");

    }
}
