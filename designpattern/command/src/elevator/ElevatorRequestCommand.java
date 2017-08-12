package elevator;

/**
 * Created by jinwoopark on 2017. 8. 11..
 */
public class ElevatorRequestCommand implements Command{
    private int destination;
    private Direction direction;
    private ElevatorManager manager;
    public ElevatorRequestCommand(int destination, Direction direction, ElevatorManager manager){
        this.destination = destination;
        this.direction = direction;
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.requestElevator(destination,direction);

    }
}
