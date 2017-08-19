import com.sun.javafx.scene.traversal.Direction;

/**
 * Created by jinwoopark on 2017. 8. 17..
 */
public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler instance;
    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }

    public static ElevatorScheduler getInstance() {
        if(instance == null){
            instance = new ResponseTimeScheduler();
        }
        return instance;

    }
}
