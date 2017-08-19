import com.sun.javafx.scene.traversal.Direction;

/**
 * Created by jinwoopark on 2017. 8. 17..
 */
public interface ElevatorScheduler {
    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
