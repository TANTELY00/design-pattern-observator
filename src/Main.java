import Implementations.ObservableImplementation;
import Implementations.ObserverImplementation1;
import Implementations.ObserverImplementation2;

public class Main {
    public static void main(String[] args) {
        ObservableImplementation observableImplementation = new ObservableImplementation();
        ObserverImplementation1 observerImplementation1 = new ObserverImplementation1();
        ObserverImplementation2 observerImplementation2 = new ObserverImplementation2();

        observableImplementation.subscribe(observerImplementation1);
        observableImplementation.subscribe(observerImplementation2);

        //observableImplementation.unsubscribe(observerImplementation2);
        observableImplementation.setState(100);

    }
}