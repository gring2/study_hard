import com.sun.javafx.scene.traversal.Direction;

/**
 * Created by jinwoopark on 2017. 8. 17..
 */
public class Client {

    public static void main(String[] args){
        ElevatorManager emWithResponseTimeScheduler = new ElevatorMangerWIthResponseTimeScheduling(2);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);
        ElevatorManager emWithThroughScheduler = new ElevatorManagerWithThroughScheduling(2);
        emWithThroughScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamincScheduler = new ElevatorManagerWIthDynamicScheduling(2);
        emWithDynamincScheduler.requestElevator(10, Direction.UP);

    }
}
