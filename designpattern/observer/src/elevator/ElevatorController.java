package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class ElevatorController extends Subject{
    private int curFloor = 1;

    public ElevatorController(){}

    public void gotoFloor(int dest){
        this.curFloor=dest;
        notifyObservers();
    }

    public int getCurFloor(){
        return this.curFloor;
    }
}
