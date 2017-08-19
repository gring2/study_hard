package battery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer){
        this.observers.add(observer);
    }
    public void detach(Observer observer){
        this.observers.remove(observer);
    }

    protected void notifyObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
