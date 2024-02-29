package OberverPattern;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Subject demoSubject=new SubjectImplmentation();
        List<Observer> observers=new ArrayList<>();


        for (int i = 0; i <5 ; i++) {
            observers.add(new ObserverImplementation("Observer "+(i+1)));
        }
        for (Observer observer:observers
             ) {
            demoSubject.register(observer);
            observer.setSubjct(demoSubject);
        }


        observers.get(0).update();
demoSubject.postMessage("New Item Stock fill");
demoSubject.postMessage("Item 2 Stocked");
    }
}
