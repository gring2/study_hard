import com.sun.javafx.scene.traversal.Direction;

/**
 * Created by jinwoopark on 2017. 8. 17..
 */
public class ThroughputScheduler implements ElevatorScheduler{
    private static ElevatorScheduler instance;

    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }

    public static ElevatorScheduler getInstance() {
        if(instance == null){
           instance = new ThroughputScheduler();
        }
        return instance;
    }
}
