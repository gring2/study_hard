package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class FloorDisplay extends AbstractObserver {
    public FloorDisplay(ElevatorController subject) {
        super(subject);
    }

    @Override
    public void update() {
        int floor = subject.getCurFloor();
        System.out.println("<FloorDisplay> " + floor +" <FloorDisplay>");
    }
}
