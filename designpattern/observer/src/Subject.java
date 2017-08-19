import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer o : observers){
            o.update();
        }
    }
}
