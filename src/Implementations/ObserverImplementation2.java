package Implementations;

import Interfaces.Observable;
import Interfaces.Observer;

public class ObserverImplementation2 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImplementation)observable).getState();
        System.out.println("*** ObserverImplementation2 ***");
        System.out.println("nouvel état : "+state);
        System.out.println("changement d'état : "+(state%2==0?"pair":"impair"));
        System.out.println("***********************");
    }
}
