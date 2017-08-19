package elevator;

/**
 * Created by jinwoopark on 2017. 8. 12..
 */
public class ControllRoomDisplay extends AbstractObserver {
    public ControllRoomDisplay(ElevatorController subject) {
        super(subject);
    }

    @Override
    public void update() {
        int floor = subject.getCurFloor();
        System.out.println("<Controll Room> "+ floor +"<Controll Room>");
    }
}
