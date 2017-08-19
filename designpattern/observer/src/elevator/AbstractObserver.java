package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public abstract class AbstractObserver implements Observer{
    protected ElevatorController subject;
    public AbstractObserver(ElevatorController subject){
        this.subject = subject;
    }
}
