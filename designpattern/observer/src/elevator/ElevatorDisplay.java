package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class ElevatorDisplay extends AbstractObserver{

    public ElevatorDisplay(ElevatorController elevatorController){
        super(elevatorController);
    }

    @Override
    public void update() {
        int floor = super.subject.getCurFloor();
        System.out.println("Elevator is located at" + floor);
    }
}
